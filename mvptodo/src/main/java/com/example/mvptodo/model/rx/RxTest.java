package com.example.mvptodo.model.rx;

import android.content.Context;

import com.example.mvptodo.bean.TestBean;
import com.example.mvptodo.injector.ContextLife;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Singleton;

import rx.Observable;
import rx.Subscriber;
import rx.functions.Func1;
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
        Integer[] a = {1, 1, 1, 1, 1, 2, 3, 3, 3, 4, 4, 5, 2, 5, 4, 5, 1, 5, 6, 78, 5, 3, 5, 7, 8, 4, 6, 74,};
        return Observable.from(a)
                .subscribeOn(Schedulers.io())
                .map(integer -> new TestBean(name + integer, Thread.currentThread().getId() + ":" + msg + integer));
    }
}
