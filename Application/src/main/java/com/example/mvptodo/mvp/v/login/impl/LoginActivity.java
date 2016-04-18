package com.example.mvptodo.mvp.v.login.impl;

import android.os.Bundle;

import com.example.mvptodo.R;
import com.example.mvptodo.mvp.BaseActivity;
import com.example.mvptodo.mvp.p.login.impl.LoginPresenterImpl;

import javax.inject.Inject;

public class LoginActivity extends BaseActivity {

    @Inject
    LoginPresenterImpl loginPresenter;

    @Override
    public boolean setStatusBar() {
        return false;
    }

    @Override
    public int setContentView() {
        return R.layout.activity_login;
    }

    @Override
    public void initInjector() {
        mActivityComponent.inject(this);
        mIPresenter = loginPresenter;
    }

    @Override
    public void initUiAndListener() {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
}
