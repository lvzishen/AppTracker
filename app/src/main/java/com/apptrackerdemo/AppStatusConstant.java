package com.apptrackerdemo;

/**
 * Created by lvzishen on 2016/5/5.
 *
 * APP状态跟踪器常量码
 */
public class AppStatusConstant {
    public static final int STATUS_FORCE_KILLED=-1; //应用放在后台被强杀了
    public static final int STATUS_KICK_OUT=1;//TOKEN失效或者被踢下线
    public static final int STATUS_NORMAL=2;  //APP正常态
//    public static final int STATUS_LOGOUT=2;//用户注销登录
//    public static final int STATUS_OFFLINE=3;//未登录状态
//    public static final int STATUS_ONLINE=4;//登录状态
    //intent到MainActivity 区分跳转目的
    public static final String KEY_HOME_ACTION="key_home_action";//返回到主页面
    public static final int ACTION_BACK_TO_HOME=6; //默认值
    public static final int ACTION_RESTART_APP=9;//被强杀
    public static final int ACTION_KICK_OUT=10;//被踢出
}
