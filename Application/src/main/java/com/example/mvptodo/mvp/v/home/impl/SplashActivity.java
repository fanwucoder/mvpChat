package com.example.mvptodo.mvp.v.home.impl;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.LayoutRes;

import com.example.mvptodo.R;
import com.example.mvptodo.mvp.BaseActivity;
import com.example.mvptodo.mvp.p.home.impl.SplashPresenterImpl;
import com.example.mvptodo.mvp.v.home.ISplashView;

import javax.inject.Inject;

public class SplashActivity extends BaseActivity implements ISplashView {

    //此处应该注入接口
    @Inject
    SplashPresenterImpl splashPresenter;

    @Override
    public boolean setStatusBar() {
        return false;
    }

    @Override
    @LayoutRes
    public int setContentView() {
        return R.layout.activity_splash_view;
    }

    @Override
    public void initInjector() {
        mActivityComponent.inject(this);
        mIPresenter = splashPresenter;
    }

    @Override
    public void initUiAndListener() {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        jumpToMain();//此处先跳到主页
    }

    @Override
    public void jumpToAlbum() {
        Intent intent = new Intent(this, AlbumActivity.class);
        startActivity(intent);
        finish();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        splashPresenter.detachView();
    }

    @Override
    public void jumpToIntroduce() {
        finish();
    }

    public void jumpToMain() {
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
        finish();
    }
}
