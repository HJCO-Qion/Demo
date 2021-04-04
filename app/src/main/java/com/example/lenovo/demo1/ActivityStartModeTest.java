package com.example.lenovo.demo1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Lenovo on 2018/9/25.
 */
public class ActivityStartModeTest extends Activity {
    String className;
    Activity thisActivity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_start_mode_test);

        className = this.getClass().getSimpleName();
        thisActivity = this;

        TextView tv_showActivityAddress = (TextView) findViewById(R.id.tv_showActivityAddress);
        tv_showActivityAddress.setText(this.toString());

        Log.e("TAG", this.toString());
        Log.d("TAG", className + "-->onCreate(Bundle savedInstanceState)");

    }


    public void addOnClickListener(View v) {
        switch (v.getId()) {
            case R.id.b_openStandardActivity:
                Intent intent1 = new Intent(thisActivity, ActivityStartModeTest.class);
                startActivity(intent1);
                break;
            case R.id.b_openSingleTopActivity:
                Intent intent2 = new Intent(thisActivity, SingleTopActivityTest.class);
                startActivity(intent2);
                break;
            case R.id.b_openSingleTaskActivity:
                Intent intent3 = new Intent(thisActivity, SingleTaskActivityTest.class);
                startActivity(intent3);
                break;
            case R.id.b_openSingleInstanceActivity:
                Intent intent4 = new Intent(thisActivity, SingleInstanceActivityTest.class);
                startActivity(intent4);
                break;

            default:
                break;
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("TAG", className + "-->onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("TAG", className + "-->onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("TAG", className + "-->onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("TAG", className + "-->onStop()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("TAG", className + "-->onRestart()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("TAG", className + "-->onDestroy()");
    }
}
