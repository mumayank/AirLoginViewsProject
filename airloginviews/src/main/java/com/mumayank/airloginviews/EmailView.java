package com.mumayank.airloginviews;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class EmailView extends LinearLayout {
    public EditText emailET;
    public TextView clearTV;

    public EmailView(Context context) {
        this(context, null);
    }

    public EmailView(Context context, AttributeSet attrs) {
        this(context, attrs,0);
    }

    public EmailView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public EmailView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init();
    }

    private void init() {
        inflate(getContext(), R.layout.air_login_views_email_view,this);

        //Get references to text views
        emailET  = (EditText) findViewById(R.id.emailET);
        clearTV = (TextView) findViewById(R.id.clearTV);

        clearTV.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                emailET.setText("");
                emailET.requestFocus();
            }
        });
    }
}
