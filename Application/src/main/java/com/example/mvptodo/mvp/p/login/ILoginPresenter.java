package com.example.mvptodo.mvp.p.login;

import com.example.mvptodo.mvp.IPresenter;

/**
 * Created by fan on 2016/4/18.
 */
public interface ILoginPresenter extends IPresenter {
    void login(String userName, String password, String serverName);
}
