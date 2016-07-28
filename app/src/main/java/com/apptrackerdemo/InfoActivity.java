package com.apptrackerdemo;

import android.os.Bundle;
import android.widget.TextView;

public class InfoActivity extends BaseActivity {
    TextView textView;

    @Override
    protected void setUpContentView() {
        setContentView(R.layout.activity_info);
    }

    @Override
    protected void setUpView() {
        textView= (TextView) findViewById(R.id.text);
    }

    @Override
    protected void setUpData(Bundle savedInstanceState) {
        textView.setText(MyApplication.list.get(0));
    }
}
