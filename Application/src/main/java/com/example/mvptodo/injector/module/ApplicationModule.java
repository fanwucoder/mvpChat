package com.example.mvptodo.injector.module;

import android.content.Context;

import com.example.mvptodo.ToDoApplication;
import com.example.mvptodo.injector.ContextLife;
import com.example.mvptodo.model.rx.RxTest;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by yuyidong on 15/11/22.
 */
@Module
public class ApplicationModule {
    private final RxTest mRxTest;
    private ToDoApplication mApplication;
  /*  private RxCategory mRxCategory;
    private RxPhotoNote mRxPhotoNote;
    private RxSandBox mRxSandBox;
    private RxUser mRxUser;
    private LocalStorageUtils mLocalStorageUtils;*/

    public ApplicationModule(ToDoApplication application) {
        mApplication = application;
        mRxTest = new RxTest(mApplication.getApplicationContext());
     /*   mLocalStorageUtils = new LocalStorageUtils(mApplication.getApplicationContext());
        mRxSandBox = new RxSandBox(mApplication.getApplicationContext());
        mRxPhotoNote = new RxPhotoNote(mApplication.getApplicationContext());
        mRxCategory = new RxCategory(mApplication.getApplicationContext());
        mRxUser = new RxUser(mApplication.getApplicationContext());*/
    }

    @Provides
    @Singleton
    @ContextLife("Application")
    public Context provideContext() {
        return mApplication.getApplicationContext();
    }

    @Provides
    @Singleton
    public RxTest provideRxTest() {
        return mRxTest;
    }
/*
    @Provides
    @Singleton
    public RxCategory provideRxCategory() {
        return mRxCategory;
    }

    @Provides
    @Singleton
    public RxPhotoNote provideRxPhotoNote() {
        return mRxPhotoNote;
    }

    @Provides
    @Singleton
    public RxSandBox provideRxSandBox() {
        return mRxSandBox;
    }

    @Provides
    @Singleton
    public RxUser provideRxUser() {
        return mRxUser;
    }

    @Provides
    @Singleton
    public LocalStorageUtils provideLocalStorageUtils() {
        return mLocalStorageUtils;
    }*/
}
