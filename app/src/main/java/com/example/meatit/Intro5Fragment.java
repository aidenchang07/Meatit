package com.example.meatit;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class Intro5Fragment extends Fragment {


    public Intro5Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
//        return inflater.inflate(R.layout.fragment_intro5, container, false);
        View view = inflater.inflate(R.layout.fragment_intro5, container, false);
        return view;
    }

    public static Intro5Fragment newInstance() {
        Intro5Fragment fragment = new Intro5Fragment();
        return fragment;
    }

}
