package com.example.lenovo.demo1;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.lenovo.demo1.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class AnotherRightFragment extends Fragment {
    public AnotherRightFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_another_right, container, false);

        View view = inflater.inflate(R.layout.fragment_another_right, container, false);
        return view;
    }
}
