package com.fanwu.chat.mvp.p;

import android.content.Context;

import com.fanwu.chat.mvp.IThemeView;


/**
 * Created by yuyidong on 15/11/22.
 */
public class ThemePresenter {
    private IThemeView mThemeView;

//    private LocalStorageUtils mLocalStorageUtils;

    public ThemePresenter(Context context) {
//        mLocalStorageUtils = LocalStorageUtils.getInstance(context);
    }

    public void attachView(IThemeView iView) {
        mThemeView = iView;
    }

    public void setTheme() {
//        mThemeView.setActivityTheme(mLocalStorageUtils.getThemeColor());
    }

    public void setStatusBar(int layout) {
//        mThemeView.setStatusBarTranslation(mLocalStorageUtils.getStatusBarTranslation(), layout);
    }

}
