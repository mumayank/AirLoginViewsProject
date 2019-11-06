package com.mumayank.airloginviews;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class PasswordView extends LinearLayout {
    private String HIDE = "HIDE";
    private String SHOW = "SHOW";

    public EditText passwordET;
    public TextView showHideTV;

    public PasswordView(Context context) {
        this(context, null);
    }

    public PasswordView(Context context, AttributeSet attrs) {
        this(context, attrs,0);
    }

    public PasswordView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public PasswordView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init();
    }

    private void init() {
        inflate(getContext(), R.layout.air_login_views_password_view,this);

        //Get references to text views
        passwordET  = (EditText) findViewById(R.id.passwordET);
        showHideTV = (TextView) findViewById(R.id.showHideTV);

        showHideTV.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (showHideTV.getText().toString().equals(SHOW)) {
                    showHideTV.setText(HIDE);
                    passwordET.setTransformationMethod(null);
                } else {
                    showHideTV.setText(SHOW);
                    passwordET.setTransformationMethod(new PasswordTransformationMethod());
                }
            }
        });
    }
}