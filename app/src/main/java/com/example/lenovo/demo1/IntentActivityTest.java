package com.example.lenovo.demo1;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Lenovo on 2018/9/11.
 */
public class IntentActivityTest extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        this.setContentView(R.layout.intent_test1);
        Button button = (Button)this.findViewById(R.id.button);
        Button button1 = this.findViewById(R.id.button1);
        Button button2 = this.findViewById(R.id.button2);
        Button button3 = this.findViewById(R.id.button3);
        Button button4 = this.findViewById(R.id.button4);

        //2.3.1：显式Intent测试。
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(IntentActivityTest.this, IntentActivityTestOther.class);
                IntentActivityTest.this.startActivity(intent);
            }
        });

        //2.3.2：隐式Intent测试。
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("com.example.lenovo.demo1.MY_ACTION");//要与AndroidManifest.xml文件中的对应的Activity配置相同。
                intent.addCategory("com.example.lenovo.demo1.MY_CATEGORY");//要与AndroidManifest.xml文件中的对应的Activity配置相同。
                IntentActivityTest.this.startActivity(intent);
            }
        });

        //2.3.3：转到系统浏览器界面，或是转到本Demo1自带的浏览页面。
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://www.baidu.com"));
                IntentActivityTest.this.startActivity(intent);
            }
        });

        //2.3.3：转到系统拨号界面
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:10086"));
                IntentActivityTest.this.startActivity(intent);
            }
        });

        //2.3.4：向下一个活动传递数据
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(IntentActivityTest.this, IntentActivityTestOther3.class);
                intent.putExtra("extra_data", "Hello SecondActivity");
                IntentActivityTest.this.startActivity(intent);
            }
        });
    }
}
