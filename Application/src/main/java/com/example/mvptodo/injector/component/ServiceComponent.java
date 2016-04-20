package com.example.mvptodo.injector.component;

import android.content.Context;


import com.example.mvptodo.injector.ContextLife;
import com.example.mvptodo.injector.PerService;
import com.example.mvptodo.injector.module.ServiceModule;
import com.example.mvptodo.model.rx.RxChart;
import com.example.mvptodo.model.rx.RxTest;

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
