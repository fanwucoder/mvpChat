package com.fanwu.chat.rx;

import android.content.Context;

import com.fanwu.chat.bean.TestBean;
import com.fanwu.chat.injector.ContextLife;

import org.jivesoftware.smack.AbstractXMPPConnection;
import org.jivesoftware.smack.ConnectionConfiguration;
import org.jivesoftware.smack.SmackException;
import org.jivesoftware.smack.XMPPException;
import org.jivesoftware.smack.chat.Chat;
import org.jivesoftware.smack.chat.ChatManager;
import org.jivesoftware.smack.tcp.XMPPTCPConnection;
import org.jivesoftware.smack.tcp.XMPPTCPConnectionConfiguration;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;

import javax.inject.Inject;
import javax.inject.Singleton;
import javax.net.ssl.SSLContext;

import rx.Observable;
import rx.schedulers.Schedulers;

/**
 * Created by fan on 2016/2/23.
 */
public class RxTest {
    @Singleton
    @Inject
    public RxTest(@ContextLife("Application") Context context) {
    }

    /**
     * 获得所有的category
     *
     * @return
     */
    public Observable<TestBean> createTest(String name, String msg) {
        return Observable.create((Observable.OnSubscribe<TestBean>) subscriber -> {
            AbstractXMPPConnection connection = null;
            try {
                XMPPTCPConnectionConfiguration config = XMPPTCPConnectionConfiguration.builder()
                        .setUsernameAndPassword("fan", "fanwu123fanwu@")
                        .setSecurityMode(ConnectionConfiguration.SecurityMode.disabled)
                        .setHost("fanwu.xyz")
                        .setResource("Android")
                        .setServiceName("fanwu.xyz").setCustomSSLContext(SSLContext.getInstance("TLS"))
                        .setPort(5222)
                        .build();
                connection = new XMPPTCPConnection(config);
                connection.connect().login();
            } catch (XMPPException | SmackException | IOException | NoSuchAlgorithmException e) {
                e.printStackTrace();

                if (subscriber.isUnsubscribed()) {
                    subscriber.unsubscribe();
                }
                return;
            }
            Chat chat = ChatManager.getInstanceFor(connection).createChat("fanwu@fanwu.xyz");
            try {
                chat.sendMessage("Howdy!");
            } catch (SmackException.NotConnectedException e) {
                e.printStackTrace();
            }
            subscriber.onNext(new TestBean(name, msg));
        }).subscribeOn(Schedulers.io());

    }
}
