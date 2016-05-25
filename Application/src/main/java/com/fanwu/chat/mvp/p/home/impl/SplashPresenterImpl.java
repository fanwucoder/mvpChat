package com.fanwu.chat.mvp.p.home.impl;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;

import com.fanwu.chat.injector.ContextLife;
import com.fanwu.chat.mvp.IView;
import com.fanwu.chat.mvp.p.home.ISplashPresenter;
import com.fanwu.chat.mvp.v.login.ISplashView;

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
