package com.example.lenovo.demo1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

/**
 * Created by Lenovo on 2018/9/18.
 */
public class LifeCycleActivityTest extends Activity {
    Button b_startNormalActivity;
    Button b_startDialogActivity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.life_cycle_activity_test);

        initMemberVariable();
        addOnClickListener();

        Log.d("TAG", "LifeCycleActivityTest-->onCreate(Bundle savedInstanceState)");
    }

    private void addOnClickListener() {
        b_startNormalActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LifeCycleActivityTest.this, NormalActivity.class);
                startActivity(intent);
            }
        });
        b_startDialogActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LifeCycleActivityTest.this, ChatScreenActivity.class);
                startActivity(intent);
            }
        });
    }

    private void initMemberVariable() {
        b_startNormalActivity = (Button) findViewById(R.id.b_startNormalActivity);
        b_startDialogActivity = (Button) findViewById(R.id.b_startDialogActivity);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("TAG", "LifeCycleActivityTest-->onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("TAG", "LifeCycleActivityTest-->onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("TAG", "LifeCycleActivityTest-->onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("TAG", "LifeCycleActivityTest-->onStop()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("TAG", "LifeCycleActivityTest-->onRestart()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("TAG", "LifeCycleActivityTest-->onDestroy()");
    }
}
