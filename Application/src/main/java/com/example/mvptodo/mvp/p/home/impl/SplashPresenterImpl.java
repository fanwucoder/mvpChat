package com.example.mvptodo.mvp.p.home.impl;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;

import com.example.mvptodo.injector.ContextLife;
import com.example.mvptodo.mvp.IView;
import com.example.mvptodo.mvp.p.home.ISplashPresenter;
import com.example.mvptodo.mvp.v.home.ISplashView;

import javax.inject.Inject;

/**
 * Created by fan on 2016/4/10.
 */
public class SplashPresenterImpl implements ISplashPresenter {
    private final Activity activity;
    private final Context context;
    private ISplashView splashView;

    @Inject
    public SplashPresenterImpl(@ContextLife("Activity") Context context, Activity activity) {
        this.context = context;
        this.activity = activity;
    }

    @Override
    public void attachView(@NonNull IView iView) {
        splashView = (ISplashView) iView;
    }

    @Override
    public void detachView() {

    }
}
