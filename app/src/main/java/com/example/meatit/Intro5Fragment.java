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
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class Intro5Fragment extends Fragment implements View.OnClickListener {

    private Button closeBtn;

    public Intro5Fragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
//        return inflater.inflate(R.layout.fragment_intro5, container, false);
        View view = inflater.inflate(R.layout.fragment_intro5, container, false);
        getView(view);
        setListener();

        return view;
    }

    @Override
    public void onClick(View view) {
        getActivity().finish();
    }

    private void getView(View view) {
        closeBtn = getViewById(view, R.id.button5);
    }

    private Button getViewById(View view, int p) {
        return view.findViewById(p);
    }

    private void setListener() {
        setOnClickListener(closeBtn);
    }

    private void setOnClickListener(Button button) {
        button.setOnClickListener(this);
    }

    public static Intro5Fragment newInstance() {
        Intro5Fragment fragment = new Intro5Fragment();
        return fragment;
    }

}
