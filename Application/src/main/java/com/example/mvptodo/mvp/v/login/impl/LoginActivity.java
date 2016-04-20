package com.example.mvptodo.mvp.v.login.impl;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;

import com.dd.CircularProgressButton;
import com.example.mvptodo.R;
import com.example.mvptodo.mvp.BaseActivity;
import com.example.mvptodo.mvp.p.login.impl.LoginPresenterImpl;
import com.example.mvptodo.mvp.v.login.ILoginView;
import com.rengwuxian.materialedittext.MaterialEditText;

import javax.inject.Inject;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LoginActivity extends BaseActivity implements ILoginView {

    @Inject
    LoginPresenterImpl loginPresenter;
    @Bind(R.id.login_et_user_name)
    MaterialEditText loginEtUserName;
    @Bind(R.id.login_et_password)
    MaterialEditText loginEtPassword;
    @Bind(R.id.login_et_server_name)
    MaterialEditText loginEtServerName;
    @Bind(R.id.bt_login)
    CircularProgressButton btLogin;
    @Bind(R.id.login_tv_register)
    TextView loginTvRegister;
    private Handler handler = new Handler();

    @Override
    public boolean setStatusBar() {
        return false;
    }

    @Override
    public int setContentView() {
        return R.layout.activity_login;
    }

    @Override
    public void initInjector() {
        mActivityComponent.inject(this);
        mIPresenter = loginPresenter;
    }

    @Override
    public void initUiAndListener() {
        loginPresenter.attachView(this);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.bt_login, R.id.login_tv_register})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.bt_login:
                loginPresenter.login(loginEtUserName.getText().toString(),
                        loginEtPassword.getText().toString(),
                        loginEtServerName.getText().toString());
                break;
            case R.id.login_tv_register:
                jump2Register();
                break;
        }
    }

    private void jump2Register() {

    }

    public void preLogin() {
        btLogin.setIndeterminateProgressMode(true); // turn on indeterminate progress
        btLogin.setProgress(50); // set progress > 0 & < 100 to display indeterminate progress
    }

    @Override
    public void loginSuccess() {
        btLogin.setProgress(100); // set progress to 100 or -1 to indicate complete or error state
        handler.postDelayed(() -> {
            btLogin.setProgress(0); // set progress to 0 to switch back to normal state
            finish();
        }, 500);

    }

    @Override
    public void loginFail(String message) {
        btLogin.setErrorText(message);
        btLogin.setProgress(-1);
    }
}
