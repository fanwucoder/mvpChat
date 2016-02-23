package com.example.mvptodo;

import android.app.Application;

import com.example.mvptodo.injector.component.ApplicationComponent;
import com.example.mvptodo.injector.component.DaggerApplicationComponent;
import com.example.mvptodo.injector.module.ApplicationModule;

/**
 * Created by fan on 2016/2/22.
 */
public class ToDoApplication extends Application {
    private ApplicationComponent mApplicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        initComponent();
    }

    private void initComponent() {

        mApplicationComponent = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .build();

    }

    public ApplicationComponent getApplicationComponent() {
        return mApplicationComponent;
    }
}
