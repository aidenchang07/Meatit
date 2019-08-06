package com.example.meatit;


import android.graphics.drawable.Drawable;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;


/**
 * A simple {@link Fragment} subclass.
 */
public class MainFragment extends Fragment {

    private RadioButton radioButton;

    public MainFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Button goToAccountBtn = view.findViewById(R.id.goToAccountBtn);
        goToAccountBtn.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.toAccountFragment));

//        setRadioButtonImg();

    }


//    private void setRadioButtonImg() {
//        Drawable First = getResources().getDrawable(R.drawable.img_circle_white);
//        First.setBounds(0, 0,40 ,40);//参数从左到右依次是距左右边距离，距上下边距离，图片长度,图片宽度
//        radioButton.setCompoundDrawables(First, null, null, null);//mainData.rgMainListenbook是控件id
//
//    }

}
