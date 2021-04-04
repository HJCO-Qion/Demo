package com.example.lenovo.demo1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class IntentActivityTestOther3 extends Activity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.intent_test5);

        textView = this.findViewById(R.id.textView);
        Button button = this.findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = IntentActivityTestOther3.this.getIntent();
                String data = intent.getStringExtra("extra_data");
                IntentActivityTestOther3.this.textView.setText(data);
            }
        });
    }
}
