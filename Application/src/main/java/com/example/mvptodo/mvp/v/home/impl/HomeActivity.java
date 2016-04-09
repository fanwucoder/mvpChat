package com.example.mvptodo.mvp.v.home.impl;

import android.widget.TextView;

import com.example.mvptodo.R;
import com.example.mvptodo.mvp.BaseActivity;
import com.example.mvptodo.mvp.p.home.impl.HomePresenterImpl;
import com.example.mvptodo.mvp.v.home.IHomeView;

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
        findViewById(R.id.sayHello).setOnClickListener(view -> mHomePresenter.sayHello());
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mHomePresenter.detachView();
    }

    @Override
    public void showHello(String text) {
        ((TextView) findViewById(R.id.greet_view)).setText(text);
    }
}
