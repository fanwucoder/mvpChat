package com.example.mvptodo.injector.module;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;


import com.example.mvptodo.injector.ContextLife;
import com.example.mvptodo.injector.PerFragment;

import dagger.Module;
import dagger.Provides;

/**
 * Created by yuyidong on 15/11/22.
 */
@Module
public class FragmentModule {
    private Fragment mFragment;

    public FragmentModule(Fragment fragment) {
        mFragment = fragment;
    }

    @Provides
    @PerFragment
    @ContextLife("Activity")
    public Context provideContext() {
        return mFragment.getActivity();
    }

    @Provides
    @PerFragment
    public Activity provideActivity() {
        return mFragment.getActivity();
    }

    @Provides
    @PerFragment
    public Fragment provideFragment() {
        return mFragment;
    }
}
