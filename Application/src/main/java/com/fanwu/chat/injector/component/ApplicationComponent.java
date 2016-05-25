package com.fanwu.chat.injector.component;

import android.content.Context;


import com.fanwu.chat.injector.ContextLife;
import com.fanwu.chat.injector.module.ApplicationModule;
import com.fanwu.chat.rx.RxChart;
import com.fanwu.chat.rx.RxTest;

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
