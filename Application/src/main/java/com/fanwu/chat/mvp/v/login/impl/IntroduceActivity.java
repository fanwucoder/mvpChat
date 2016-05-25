package com.fanwu.chat.mvp.v.login.impl;

import android.os.Bundle;

import com.fanwu.chat.R;
import com.fanwu.chat.mvp.BaseActivity;

public class IntroduceActivity extends BaseActivity {

    @Override
    public boolean setStatusBar() {
        return false;
    }

    @Override
    public int setContentView() {
        return R.layout.activity_introduce;
    }

    @Override
    public void initInjector() {

    }

    @Override
    public void initUiAndListener() {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
}
