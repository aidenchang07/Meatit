package com.example.meatit;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class Intro2Fragment extends Fragment implements View.OnClickListener {

    private Button closeBtn;

    public Intro2Fragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
//        return inflater.inflate(R.layout.fragment_intro2, container, false);
        View view = inflater.inflate(R.layout.fragment_intro2, container, false);
        getView(view);
        setListener();
//        closeBtn = view.findViewById(R.id.button2);
//        closeBtn.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View view) {
        getActivity().finish();
    }

    private void getView(View view) {
        closeBtn = getViewById(view, R.id.button2);
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

    public static Intro2Fragment newInstance() {
        Intro2Fragment fragment = new Intro2Fragment();
        return fragment;
    }
}
