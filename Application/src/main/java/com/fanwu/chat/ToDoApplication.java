package com.fanwu.chat;

import android.app.Application;

import com.fanwu.chat.injector.component.ApplicationComponent;
import com.fanwu.chat.injector.component.DaggerApplicationComponent;
import com.fanwu.chat.injector.module.ApplicationModule;

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
