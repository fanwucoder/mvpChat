package com.example.mvptodo.injector.module;

import android.app.Service;
import android.content.Context;


import com.example.mvptodo.injector.ContextLife;
import com.example.mvptodo.injector.PerService;

import dagger.Module;
import dagger.Provides;

/**
 * Created by yuyidong on 15/11/22.
 */
@Module
public class ServiceModule {
    private Service mService;

    public ServiceModule(Service service) {
        mService = service;
    }

    @Provides
    @PerService
    @ContextLife("Service")
    public Context provideContext() {
        return mService;
    }
}
