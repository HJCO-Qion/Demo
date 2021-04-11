package com.example.lenovo.demo1;

import android.app.Activity;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;

public class LeftFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
//        TextView textView = new TextView(getActivity());
//        textView.setText(R.string.hello_blank_fragment);
//        return textView;


//        DynamicFragmentLayout dynamicFragmentLayout = (DynamicFragmentLayout)getActivity();
//        Button button = dynamicFragmentLayout.findViewById(R.id.button);
//        this.getActivity().get
//        Toast.makeText(getActivity(), ""+button, Toast.LENGTH_SHORT).show();
//        button.setText(button.getText() + "（Fragment追加字段）");
//        this.get

        View view = inflater.inflate(R.layout.left_fragment, container, false);
        return view;
    }

    @Override
    public void onStart() {
        super.onStart();
        //4.2.4：碎片和活动之间进行通讯：Fragment-->Activity：
        DynamicFragmentLayout dynamicFragmentLayout = (DynamicFragmentLayout)getActivity();
        dynamicFragmentLayout.dynamicFragmentLayoutTest();
    }

    public void leftFragmentTest() {
        //方法一：
//        LeftFragment leftFragment = (LeftFragment) this.getFragmentManager().findFragmentById(R.id.left_fragment);
//        Activity activity = leftFragment.getActivity();
//        Button button1 = activity.findViewById(R.id.button);
//        button1.setText(button1.getText() + "（Activity调用了Fragment）")
        //方法二：
        Activity activity = this.getActivity();
        Button button1 = activity.findViewById(R.id.button);
        button1.setText(button1.getText() + "（Activity调用了Fragment）");


        TextView textView = activity.findViewById(R.id.textView);
        FrameLayout frameLayout = activity.findViewById(R.id.right_layout);
        Toast.makeText(getActivity(), ""+textView + frameLayout, Toast.LENGTH_SHORT).show();
    }
}
