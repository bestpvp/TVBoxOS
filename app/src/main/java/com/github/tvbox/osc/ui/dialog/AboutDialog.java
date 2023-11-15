package com.github.tvbox.fengchu.ui.dialog;

import android.content.Context;

import androidx.annotation.NonNull;

import com.github.tvbox.fengchu.R;

import org.jetbrains.annotations.NotNull;

public class AboutDialog extends BaseDialog {

    public AboutDialog(@NonNull @NotNull Context context) {
        super(context);
        setContentView(R.layout.dialog_about);
    }
}