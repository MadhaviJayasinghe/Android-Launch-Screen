package com.example.androidlaunchscreen;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        View mCustomView = getLayoutInflater().inflate(R.layout.custom_actionbar, null);
        TextView mTitle = (TextView) mCustomView.findViewById(R.id.title);
        mToolBar.addView(mCustomView);
        mTitle.setText("Home");
        Toolbar parent = (Toolbar) mCustomView.getParent();
        parent.setPadding(0, 0, 0, 0);//for tab otherwise give space in tab
        parent.setContentInsetsAbsolute(0, 0);
    }
}
