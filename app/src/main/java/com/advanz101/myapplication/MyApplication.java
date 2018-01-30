package com.advanz101.myapplication;

import android.app.Application;

import com.facebook.stetho.Stetho;

/**
 * Created by advanz101 on 14/9/17.
 */

public class MyApplication extends Application {
    public void onCreate() {
        super.onCreate();
        Stetho.initializeWithDefaults(this);
    }
}