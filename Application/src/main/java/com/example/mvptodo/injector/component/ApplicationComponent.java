package com.example.mvptodo.injector.component;

import android.content.Context;


import com.example.mvptodo.injector.ContextLife;
import com.example.mvptodo.injector.module.ApplicationModule;
import com.example.mvptodo.model.rx.RxChart;
import com.example.mvptodo.model.rx.RxTest;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by yuyidong on 15/11/22.
 */
@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {
    @ContextLife("Application")
    Context getContext();

    RxTest getRxTest();
    RxChart getRxChart();
 /*   LocalStorageUtils getLocalStorageUtils();

    RxCategory getRxCategory();

    RxPhotoNote getRxPhotoNote();

    RxSandBox getRxSandBox();*/
}
