package com.fanwu.chat.injector.component;

import android.app.Activity;
import android.content.Context;

import com.fanwu.chat.injector.ContextLife;
import com.fanwu.chat.injector.PerActivity;
import com.fanwu.chat.injector.module.ActivityModule;
import com.fanwu.chat.rx.RxChart;
import com.fanwu.chat.rx.RxTest;
import com.fanwu.chat.mvp.v.home.impl.HomeActivity;
import com.fanwu.chat.mvp.v.login.impl.SplashActivity;
import com.fanwu.chat.mvp.v.login.impl.LoginActivity;

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


    void inject(LoginActivity loginActivity);

    RxTest getRxTest();

    RxChart getRxChart();
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
