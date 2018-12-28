package com.example.androidlaunchscreen;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

public abstract class BaseActivity extends AppCompatActivity {
    protected Toolbar mToolBar;

    public static BaseActivity baseActivity = null;

    @Override
    public void setContentView(int layoutResID) {
        super.setContentView(layoutResID);
        getActionBarToolbar();
        baseActivity = this;
    }

    protected Toolbar getActionBarToolbar() {
        if (mToolBar == null) {
            mToolBar = (Toolbar) findViewById(R.id.toolbar);
            if (mToolBar != null) {
                setSupportActionBar(mToolBar);
                ActionBar mActionBar = BaseActivity.this.getSupportActionBar();
                mActionBar.setDisplayShowHomeEnabled(false);
                mActionBar.setDisplayShowTitleEnabled(false);
                mActionBar.setDisplayShowCustomEnabled(true);

                // remove previously created actionbar
                mActionBar.invalidateOptionsMenu();

                /** remove actionbar unnecessary left margin */
                mToolBar.setContentInsetsAbsolute(0, 0);
            }
        }
        return mToolBar;
    }
}