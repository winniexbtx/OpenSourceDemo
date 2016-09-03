package com.xiong.app.ui.dialog;

import android.app.ProgressDialog;

/**
 * Created by xiong on 2016/9/2.
 */
public interface DialogControl {
    public  abstract void hideWaitDialog();
    public abstract ProgressDialog showWaitDialog();

    public abstract ProgressDialog showWaitDialog(int resid);

    public abstract ProgressDialog showWaitDialog(String text);
}
