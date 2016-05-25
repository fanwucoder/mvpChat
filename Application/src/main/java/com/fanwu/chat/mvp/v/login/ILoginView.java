package com.fanwu.chat.mvp.v.login;

import com.fanwu.chat.mvp.IView;

/**
 * Created by fan on 2016/4/18.
 */
public interface ILoginView extends IView {
    void loginSuccess();

    void loginFail(String message);

    void preLogin();
}
