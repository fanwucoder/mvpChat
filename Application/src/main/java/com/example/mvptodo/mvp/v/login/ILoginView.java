package com.example.mvptodo.mvp.v.login;

import com.example.mvptodo.mvp.IView;

/**
 * Created by fan on 2016/4/18.
 */
public interface ILoginView extends IView {
    void loginSuccess();

    void loginFail(String message);

    void preLogin();
}
