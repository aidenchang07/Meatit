package com.example.meatit;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class Intro2Fragment extends Fragment {


    public Intro2Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
//        return inflater.inflate(R.layout.fragment_intro2, container, false);
        View view = inflater.inflate(R.layout.fragment_intro2, container, false);
        return view;
    }

    public static Intro2Fragment newInstance() {
        Intro2Fragment fragment = new Intro2Fragment();
        return fragment;
    }

}
