package com.example.mvptodo.model.rx;

import android.content.Context;

import com.example.mvptodo.R;
import com.example.mvptodo.exception.BusinessException;

import org.jivesoftware.smack.AbstractXMPPConnection;
import org.jivesoftware.smack.ConnectionConfiguration;
import org.jivesoftware.smack.SmackException;
import org.jivesoftware.smack.XMPPException;
import org.jivesoftware.smack.tcp.XMPPTCPConnection;
import org.jivesoftware.smack.tcp.XMPPTCPConnectionConfiguration;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;

import javax.net.ssl.SSLContext;

import rx.Observable;
import rx.Subscriber;
import rx.exceptions.OnErrorFailedException;
import rx.schedulers.Schedulers;

/**
 * Created by fan on 2016/4/20.
 */
public class RxChart {
    private final Context context;
    AbstractXMPPConnection connection = null;
    XMPPTCPConnectionConfiguration config;

    public RxChart(Context applicationContext) {
        context = applicationContext;
    }

    public Observable<AbstractXMPPConnection> getConnection(String userName, String password, String server, int port) {
        return Observable.create(new Observable.OnSubscribe<AbstractXMPPConnection>() {
            @Override
            public void call(Subscriber<? super AbstractXMPPConnection> subscriber) {
                try {
                    if (connection == null) {

                        config = XMPPTCPConnectionConfiguration.builder()
//                            .setUsernameAndPassword("fan", "fanwu123fanwu@")
//                            .setSecurityMode(ConnectionConfiguration.SecurityMode.disabled)
//                            .setHost("fanwu.xyz")
//                            .setResource("Android")
//                            .setServiceName("fanwu.xyz").setCustomSSLContext(SSLContext.getInstance("TLS"))
//                            .setPort(5222)
                                .setUsernameAndPassword(userName, password)
                                .setSecurityMode(ConnectionConfiguration.SecurityMode.disabled)
                                .setHost(server)
                                .setResource("Android")
                                .setServiceName(server)
                                .setCustomSSLContext(SSLContext.getInstance("TLS"))
                                .setPort(port)
                                .build();
                        connection = new XMPPTCPConnection(config);
                        connection.connect().login();
//                        throw new IOException("xxx");

                    }
                    subscriber.onNext(connection);
                    subscriber.onCompleted();
                } catch (XMPPException | IOException | SmackException | NoSuchAlgorithmException e) {
                    subscriber.onError(new BusinessException(context.getString(R.string.login_error), e));
                }
            }
        }).subscribeOn(Schedulers.io());
    }
}
