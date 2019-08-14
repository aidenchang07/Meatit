package com.example.meatit;


import android.os.Build;
import android.os.Bundle;

import androidx.core.widget.TextViewCompat;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class Intro4Fragment extends Fragment implements View.OnClickListener {

    private Button closeBtn;

    public Intro4Fragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
//        return inflater.inflate(R.layout.fragment_intro4, container, false);
        View view = inflater.inflate(R.layout.fragment_intro4, container, false);
        getView(view);
        setListener();

        return view;
    }

    private void getView(View view) {
        closeBtn = getViewById(view, R.id.button4);
    }

    private Button getViewById(View view, int id) {
        return view.findViewById(id);
    }

    private void setListener() {
        setOnClickListener(closeBtn);
    }

    private void setOnClickListener(Button button) {
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        getActivity().finish();
    }

    public static Intro4Fragment newInstance() {
        Intro4Fragment fragment = new Intro4Fragment();
        return fragment;
    }

}
