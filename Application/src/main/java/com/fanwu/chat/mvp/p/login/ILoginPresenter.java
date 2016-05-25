package com.fanwu.chat.mvp.p.login;

import com.fanwu.chat.mvp.IPresenter;

/**
 * Created by fan on 2016/4/18.
 */
public interface ILoginPresenter extends IPresenter {
    void login(String userName, String password, String serverName);
}
