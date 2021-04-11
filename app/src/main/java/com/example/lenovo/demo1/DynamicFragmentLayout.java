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
        button.setText("���Ҹı��ұߵĲ���");
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

        //4.2.4����Ƭ�ͻ֮�����ͨѶ��Activity-->Fragment��
        LeftFragment leftFragment = (LeftFragment) this.getFragmentManager().findFragmentById(R.id.left_fragment);
        leftFragment.leftFragmentTest();
    }

    public void replaceFragment(Fragment fragment) {
        FragmentManager fragmentManager = this.getFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();//transaction���ס�ҵ������
        transaction.replace(R.id.right_layout, fragment);
        //4.2.3������Ƭ��ģ�ⷵ��ջ��
        transaction.addToBackStack(null);//����Ƭ����Activity������ջһ���Ĳ�������������ؼ�ʱ����һ����˳���
        transaction.commit();
    }

    public void dynamicFragmentLayoutTest() {
        button.setText(button.getText() + "��Fragment������Activity��");
    }
}
