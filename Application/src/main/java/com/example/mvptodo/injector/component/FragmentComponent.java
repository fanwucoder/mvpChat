package com.example.mvptodo.injector.component;

import android.app.Activity;
import android.content.Context;


import com.example.mvptodo.injector.ContextLife;
import com.example.mvptodo.injector.PerFragment;
import com.example.mvptodo.injector.module.FragmentModule;
import com.example.mvptodo.model.rx.RxChart;
import com.example.mvptodo.model.rx.RxTest;

import dagger.Component;

/**
 * Created by yuyidong on 15/11/22.
 */
@PerFragment
@Component(modules = FragmentModule.class, dependencies = ApplicationComponent.class)
public interface FragmentComponent {
    @ContextLife("Application")
    Context getContext();

    @ContextLife("Activity")
    Context getActivityContext();

    Activity getActivity();

    RxTest getRxTest();

    RxChart getRxChart();
/*
    RxCategory getRxCategory();

    RxPhotoNote getRxPhotoNote();

    RxSandBox getRxSandBox();

    LocalStorageUtils getLocalStorageUtils();

    void inject(AlbumFragment albumFragment);

    void inject(UserDetailFragment userDetailFragment);

    void inject(DetailFragment detailFragment);*/
}
