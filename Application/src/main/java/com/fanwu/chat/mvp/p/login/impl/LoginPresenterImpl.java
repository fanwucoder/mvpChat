package com.fanwu.chat.mvp.p.login.impl;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;

import com.fanwu.chat.injector.ContextLife;
import com.fanwu.chat.rx.RxChart;
import com.fanwu.chat.mvp.IView;
import com.fanwu.chat.mvp.p.login.ILoginPresenter;
import com.fanwu.chat.mvp.v.login.ILoginView;

import javax.inject.Inject;

import rx.android.schedulers.AndroidSchedulers;

/**
 * Created by fan on 2016/4/18.
 */
public class LoginPresenterImpl implements ILoginPresenter {

    private final Activity activity;
    private final Context context;
    private final RxChart rxChart;
    private ILoginView iLoginView;

    @Inject
    public LoginPresenterImpl(@ContextLife("Activity") Context context, Activity activity, RxChart rxChart) {
        this.context = context;
        this.activity = activity;
        this.rxChart = rxChart;

    }

    @Override
    public void attachView(@NonNull IView iView) {
        iLoginView = (ILoginView) iView;
    }

    @Override
    public void detachView() {

    }

    @Override
    public void login(String userName, String password, String serverName) {
        iLoginView.preLogin();
        rxChart.getConnection(userName, password, serverName, 5222)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(connection -> {
                    iLoginView.loginSuccess();
                }, error -> {
                    iLoginView.loginFail(error.getMessage());
                });
    }
}
