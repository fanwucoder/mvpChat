package com.fanwu.chat.injector.component;

import android.content.Context;


import com.fanwu.chat.injector.ContextLife;
import com.fanwu.chat.injector.PerService;
import com.fanwu.chat.injector.module.ServiceModule;
import com.fanwu.chat.rx.RxChart;
import com.fanwu.chat.rx.RxTest;

import dagger.Component;

/**
 * Created by yuyidong on 15/11/22.
 */
@PerService
@Component(dependencies = ApplicationComponent.class, modules = {ServiceModule.class})
public interface ServiceComponent {

    @ContextLife("Service")
    Context getServiceContext();

    @ContextLife("Application")
    Context getApplicationContext();

    RxTest getRxTest();

    RxChart getRxChart();
/*
    RxCategory getRxCategory();

    RxPhotoNote getRxPhotoNote();

    RxSandBox getRxSandBox();

    LocalStorageUtils getLocalStorageUtils();

    void inject(CameraService cameraService);

    void inject(CheckService checkService);

    void inject(SandBoxService sandBoxService);*/
}
