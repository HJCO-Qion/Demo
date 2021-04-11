package com.example.lenovo.demo1;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class DynamicFragmentLayout extends Activity {
    Button button;

//    onCreate
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dynamic_fragment_layout);

        button = findViewById(R.id.button);
        button.setText("点我改变右边的布局");
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.button:
                        DynamicFragmentLayout.this.replaceFragment(new AnotherRightFragment());
                        break;
                }
            }
        });
        replaceFragment(new RightFragment());

        //4.2.4：碎片和活动之间进行通讯：Activity-->Fragment：
        LeftFragment leftFragment = (LeftFragment) this.getFragmentManager().findFragmentById(R.id.left_fragment);
        leftFragment.leftFragmentTest();
    }

    public void replaceFragment(Fragment fragment) {
        FragmentManager fragmentManager = this.getFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();//transaction交易、业务、事务。
        transaction.replace(R.id.right_layout, fragment);
        //4.2.3：在碎片中模拟返回栈。
        transaction.addToBackStack(null);//将碎片当成Activity进行入栈一样的操作，当点击返回键时，会一层层退出。
        transaction.commit();
    }

    public void dynamicFragmentLayoutTest() {
        button.setText(button.getText() + "（Fragment调用了Activity）");
    }
}
