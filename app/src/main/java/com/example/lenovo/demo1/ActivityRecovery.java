package com.example.lenovo.demo1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ActivityRecovery extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        this.setContentView(R.layout.activity_recovery);

        Button button = this.findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityRecovery.this, ActivityStartModeTest.class);
                ActivityRecovery.this.startActivity(intent);
            }
        });

        if (savedInstanceState != null){
            String tempData = savedInstanceState.getString("data_key");
            Toast.makeText(this, tempData, Toast.LENGTH_LONG).show();
        }
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        String tempData = "Something you just typed.活被回收时保存的数据。";
        outState.putString("data_key", tempData);
    }
}
