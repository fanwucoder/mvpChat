package com.example.mvptodo.model.rx;

import android.content.Context;

import com.example.mvptodo.bean.TestBean;
import com.example.mvptodo.injector.ContextLife;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Singleton;

import rx.Observable;
import rx.Subscriber;
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
        return Observable.create(new Observable.OnSubscribe<TestBean>() {
            @Override
            public void call(Subscriber<? super TestBean> subscriber) {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                subscriber.onNext(new TestBean(name, Thread.currentThread().getId() + ":" + msg + ":线程睡了5s"));

                subscriber.onCompleted();
            }
        }).subscribeOn(Schedulers.io());
    }
}
