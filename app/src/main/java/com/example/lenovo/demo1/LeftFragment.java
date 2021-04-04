package com.example.lenovo.demo1;

import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
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
//        button.setText(button.getText() + "£¨Fragment×·¼Ó×Ö¶Î£©");
//        this.get

        DynamicFragmentLayout dynamicFragmentLayout = (DynamicFragmentLayout)getActivity();
        dynamicFragmentLayout.dynamicFragmentLayoutTest();

        View view = inflater.inflate(R.layout.left_fragment, container, false);
        return view;
    }
    public void leftFragmentTest() {
        Toast.makeText(getActivity(), "ss", Toast.LENGTH_SHORT).show();
    }
}
