package com.example.lenovo.demo1;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ActivityCollectorTest extends BaseActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("ActivityCollectorTest", "Task id is " + this.getTaskId());
        setContentView(R.layout.activity_collector_test);

        textView = this.findViewById(R.id.textView);
        Intent intent = this.getIntent();
        String param1 = intent.getStringExtra("param1");
        String param2 = intent.getStringExtra("param2");
        textView.setText("param1 = " + param1 + ", param2 = " + param2);

        Button button = this.findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ActivityCollector.finishAll();//销毁所有活动。
            }
        });

        Button button1 = this.findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ActivityCollectorTest.this.actionStart(ActivityCollectorTest.this, "data1", "data2");
            }
        });
    }
    public void actionStart(Context context, String data1, String data2) {//2.6.3：这样写可以使要传输给其他Activity的数据一目了然。
        Intent intent = new Intent(context, ActivityCollectorTest.class);
        intent.putExtra("param1", data1);
        intent.putExtra("param2", data2);
        context.startActivity(intent);
    }
}
