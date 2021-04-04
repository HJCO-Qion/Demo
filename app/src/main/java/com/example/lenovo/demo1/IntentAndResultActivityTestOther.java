package com.example.lenovo.demo1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by Lenovo on 2018/9/13.
 */
public class IntentAndResultActivityTestOther extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        this.setContentView(R.layout.intent_and_result_othre);
        Button button = (Button) this.findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.putExtra("data_return", "Hello FirstActivity");
                IntentAndResultActivityTestOther.this.setResult(IntentAndResultActivityTestOther.this.RESULT_OK, intent);
                IntentAndResultActivityTestOther.this.finish();
            }
        });
    }

    @Override
    public void onBackPressed() {
//        super.onBackPressed();//此句不要添加，会影响下列代码。

        Intent intent = new Intent();
        intent.putExtra("data_return", "Hello FirstActivity");
        IntentAndResultActivityTestOther.this.setResult(IntentAndResultActivityTestOther.this.RESULT_OK, intent);
        IntentAndResultActivityTestOther.this.finish();
    }
}
