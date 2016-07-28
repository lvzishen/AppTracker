package com.apptrackerdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends BaseActivity {
    Button button;
    @Override
    protected void setUpContentView() {
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void setUpView() {
        button= (Button) findViewById(R.id.activity_main_btn);
    }

    @Override
    protected void setUpData(Bundle savedInstanceState) {
        MyApplication.list=new ArrayList<>();
        MyApplication.list.add("我从MAINACTIVITY来");
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, InfoActivity.class));
            }
        });
    }


    @Override
    protected void protectApp() {
        Toast.makeText(getApplicationContext(),"应用被回收重启走流程",Toast.LENGTH_LONG).show();
        startActivity(new Intent(this, SplashActivity.class));
        finish();
    }
    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        int action = intent.getIntExtra(AppStatusConstant.KEY_HOME_ACTION, AppStatusConstant.ACTION_BACK_TO_HOME);
        switch (action) {
            case AppStatusConstant.ACTION_RESTART_APP:
                protectApp();
                break;
            case AppStatusConstant.ACTION_KICK_OUT:
                break;
            case AppStatusConstant.ACTION_BACK_TO_HOME:
                break;
        }
    }

}
