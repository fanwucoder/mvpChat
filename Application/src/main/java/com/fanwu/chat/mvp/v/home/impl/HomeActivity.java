package com.fanwu.chat.mvp.v.home.impl;

import android.content.Intent;

import com.fanwu.chat.R;
import com.fanwu.chat.mvp.BaseActivity;
import com.fanwu.chat.mvp.p.home.impl.HomePresenterImpl;
import com.fanwu.chat.mvp.v.home.IHomeView;
import com.fanwu.chat.mvp.v.login.impl.LoginActivity;

import javax.inject.Inject;

public class HomeActivity extends BaseActivity implements IHomeView {
    @Inject
    HomePresenterImpl mHomePresenter;

    @Override
    public boolean setStatusBar() {
        return false;
    }

    @Override
    public int setContentView() {
        return R.layout.activity_main;
    }

    @Override
    public void initInjector() {
        mActivityComponent.inject(this);
        mIPresenter = mHomePresenter;
    }

    @Override
    public void initUiAndListener() {
        mHomePresenter.attachView(this);
        jump2Login();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mHomePresenter.detachView();
    }

    public void jump2Login() {
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }

    @Override
    public void showHello(String text) {
       // ((TextView) findViewById(R.id.greet_view)).setText(text);
    }
}
