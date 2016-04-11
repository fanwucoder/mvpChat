package com.example.mvptodo.injector.component;

import android.app.Activity;
import android.content.Context;

import com.example.mvptodo.injector.ContextLife;
import com.example.mvptodo.injector.PerActivity;
import com.example.mvptodo.injector.module.ActivityModule;
import com.example.mvptodo.model.rx.RxTest;
import com.example.mvptodo.mvp.v.home.impl.HomeActivity;
import com.example.mvptodo.mvp.v.home.impl.SplashActivity;

import dagger.Component;

/**
 * Created by yuyidong on 15/11/22.
 */
@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = {ActivityModule.class})
public interface ActivityComponent {

    @ContextLife("Activity")
    Context getActivityContext();

    @ContextLife("Application")
    Context getApplicationContext();

    Activity getActivity();

    void inject(HomeActivity homeActivity);

    void inject(SplashActivity splashActivity);

    RxTest getRxTest();
    /*RxCategory getRxCategory();

    RxPhotoNote getRxPhotoNote();

    RxSandBox getRxSandBox();

    LocalStorageUtils getLocalStorageUtils();

    void inject(HomeActivity homeActivity);

    void inject(IntroduceActivity introduceActivity);

    void inject(SplashActivity splashActivity);

    void inject(LoginActivity loginActivity);

    void inject(UserCenterActivity userCenterActivity);

    void inject(DetailActivity detailActivity);

    void inject(MapActivity mapActivity);

    void inject(EditTextActivity editTextActivity);

    void inject(ZoomActivity zoomActivity);

    void inject(AboutAppActivity aboutAppActivity);

    void inject(EditCategoryActivity editCategoryActivity);

    void inject(FeedbackActivity feedbackActivity);

    void inject(SettingActivity settingActivity);*/

}
