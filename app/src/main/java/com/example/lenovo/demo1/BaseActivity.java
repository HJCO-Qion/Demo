package com.example.lenovo.demo1;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class BaseActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("BaseActivity", this.getClass().getSimpleName());//2.6.1：通过此方法知晓是在哪一个活动。
        ActivityCollector.addActivity(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ActivityCollector.removeActivity(this);
//        android.os.Process.killProcess(android.os.Process.myPid());//2.6.3：杀死当前程序的进程，保证程序的完全退出。
    }
}
