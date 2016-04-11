package com.example.mvptodo.mvp.v.home.impl;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.mvptodo.R;
import com.example.mvptodo.mvp.BaseActivity;

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
