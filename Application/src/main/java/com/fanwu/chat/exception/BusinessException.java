package com.fanwu.chat.exception;

import android.annotation.TargetApi;
import android.os.Build;

/**
 * Created by fan on 2016/4/20.
 */
public class BusinessException extends Throwable {
    public BusinessException() {
    }

    public BusinessException(String detailMessage) {
        super(detailMessage);
    }

    public BusinessException(String detailMessage, Throwable cause) {
        super(detailMessage, cause);
    }

    public BusinessException(Throwable cause) {
        super(cause);
    }

    @TargetApi(Build.VERSION_CODES.KITKAT)
    public BusinessException(String detailMessage, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(detailMessage, cause, enableSuppression, writableStackTrace);
    }
}
