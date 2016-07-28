package com.apptrackerdemo;

import android.app.Application;

import java.util.List;

/**
 * Created by lvzishen on 2016/5/30.
 */
public class MyApplication extends Application {
    public static MyApplication myApplication;
    public static List<String> list;

    @Override
    public void onCreate() {
        super.onCreate();
        myApplication=this;
    }
}
