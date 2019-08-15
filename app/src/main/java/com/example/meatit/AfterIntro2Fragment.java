package com.example.meatit;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class AfterIntro2Fragment extends Fragment {


    public AfterIntro2Fragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
//        return inflater.inflate(R.layout.fragment_after_intro2, container, false);
        View view = inflater.inflate(R.layout.fragment_after_intro2, container, false);

        return view;
    }

    //回傳物件，供ViewPagerAdapter使用
    public static AfterIntro2Fragment newInstance() {
        return new AfterIntro2Fragment();
    }

}
