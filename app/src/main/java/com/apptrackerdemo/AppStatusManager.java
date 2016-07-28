package com.apptrackerdemo;

import android.app.Application;

/**
 * Created by lvzishen on 2016/5/31.
 */
public class AppStatusManager {

    public int appStatus= AppStatusConstant.STATUS_FORCE_KILLED;        //APP状态 初始值为没启动 不在前台状态

    public static AppStatusManager appStatusManager;

    private AppStatusManager() {

    }


    public static AppStatusManager getInstance() {
        if (appStatusManager == null) {
            appStatusManager = new AppStatusManager();
        }
        return appStatusManager;
    }

    public int getAppStatus() {
        return appStatus;
    }

    public void setAppStatus(int appStatus) {
        this.appStatus = appStatus;
    }
}
