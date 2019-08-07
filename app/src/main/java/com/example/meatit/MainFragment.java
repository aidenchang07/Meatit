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
    private RadioButton radioButton2;
    private RadioButton radioButton3;
    private RadioButton radioButton4;
    private RadioButton radioButton5;
    private RadioButton radioButton6;

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

        radioButton = view.findViewById(R.id.radioButton);
        radioButton2 = view.findViewById(R.id.radioButton2);
        radioButton3 = view.findViewById(R.id.radioButton3);
        radioButton4 = view.findViewById(R.id.radioButton4);
        radioButton5 = view.findViewById(R.id.radioButton5);
        radioButton6 = view.findViewById(R.id.radioButton6);


        setRadioButtonImg();

    }


    private void setRadioButtonImg() {
        Drawable radioButtonDrawable = getResources().getDrawable(R.drawable.radiobutton_intro);

        radioButtonDrawable.setBounds(0, 0,70 ,70);//参数从左到右依次是距左右边距离，距上下边距离，图片长度,图片宽度

//        radioButton.setCompoundDrawables(radioButtonDrawable, null, null, null);
//        radioButton2.setCompoundDrawables(radioButtonDrawable, null, null, null);
//        radioButton3.setCompoundDrawables(radioButtonDrawable, null, null, null);
//        radioButton4.setCompoundDrawables(radioButtonDrawable, null, null, null);
//        radioButton5.setCompoundDrawables(radioButtonDrawable, null, null, null);
//        radioButton6.setCompoundDrawables(radioButtonDrawable, null, null, null);

//        radioButton.setButtonDrawable(First);
    }

}
