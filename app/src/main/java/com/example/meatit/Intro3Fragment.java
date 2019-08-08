package com.example.meatit;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class Intro3Fragment extends Fragment {


    public Intro3Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
//        return inflater.inflate(R.layout.fragment_intro3, container, false);
        View view = inflater.inflate(R.layout.fragment_intro3, container, false);
        return view;
    }

    public static Intro3Fragment newInstance() {
        Intro3Fragment fragment = new Intro3Fragment();
        return fragment;
    }

}
