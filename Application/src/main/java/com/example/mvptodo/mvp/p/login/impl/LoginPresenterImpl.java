package com.example.mvptodo.mvp.p.login.impl;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;

import com.example.mvptodo.injector.ContextLife;
import com.example.mvptodo.mvp.IView;
import com.example.mvptodo.mvp.p.login.ILoginPresenter;
import com.example.mvptodo.mvp.v.home.ISplashView;
import com.example.mvptodo.mvp.v.login.ILoginView;

import javax.inject.Inject;

/**
 * Created by fan on 2016/4/18.
 */
public class LoginPresenterImpl implements ILoginPresenter {

    private final Activity activity;
    private final Context context;
    private ILoginView iLoginView;

    @Inject
    public LoginPresenterImpl(@ContextLife("Activity") Context context, Activity activity) {
        this.context = context;
        this.activity = activity;
    }
    @Override
    public void attachView(@NonNull IView iView) {
        iLoginView= (ILoginView) iView;
    }

    @Override
    public void detachView() {

    }
}
