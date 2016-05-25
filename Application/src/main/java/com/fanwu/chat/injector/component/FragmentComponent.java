package com.fanwu.chat.injector.component;

import android.app.Activity;
import android.content.Context;


import com.fanwu.chat.injector.ContextLife;
import com.fanwu.chat.injector.PerFragment;
import com.fanwu.chat.injector.module.FragmentModule;
import com.fanwu.chat.rx.RxChart;
import com.fanwu.chat.rx.RxTest;

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
