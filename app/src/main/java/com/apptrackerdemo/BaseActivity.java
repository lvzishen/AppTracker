package com.apptrackerdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;



/**
 * Created by lvzishen on 2016/5/5.
 */
public abstract class BaseActivity extends AppCompatActivity {
    /**
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        switch (AppStatusManager.getInstance().getAppStatus()) {
            /**
             * 应用被强杀
             */
            case AppStatusConstant.STATUS_FORCE_KILLED:
                //跳到主页,主页lauchmode SINGLETASK
                protectApp();
                break;
            /**
             * 用户被踢或者TOKEN失效
             */
            case AppStatusConstant.STATUS_KICK_OUT:
                //弹出对话框,点击之后跳到主页,清除用户信息,运行退出登录逻辑
//                Intent intent=new Intent(this,MainActivity.class);
//                startActivity(intent);
                break;
            case AppStatusConstant.STATUS_NORMAL:
                setUpContentView();
                setUpView();
                setUpData(savedInstanceState);
                break;
        }


    }

    /**
     * 加载布局
     */
    protected abstract void setUpContentView();

    /**
     * view初始化
     */
    protected abstract void setUpView();

    /**
     * 加载数据
     */
    protected abstract void setUpData(Bundle savedInstanceState);

    protected void protectApp() {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra(AppStatusConstant.KEY_HOME_ACTION, AppStatusConstant.ACTION_RESTART_APP);
        startActivity(intent);
    }

    @Override
    public void onBackPressed() {
        // 返回默认结束当前页面
        finish();
    }


}
