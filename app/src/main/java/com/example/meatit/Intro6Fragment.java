package com.example.meatit;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class Intro6Fragment extends Fragment implements View.OnClickListener {

    private Button gotItBtn;
    private Button closeBtn;
    private int viewID;

    public Intro6Fragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
//        return inflater.inflate(R.layout.fragment_intro6, container, false);
        View view = inflater.inflate(R.layout.fragment_intro6, container, false);
        getView(view);
        setListener();
        return view;
    }

    @Override
    public void onClick(View view) {
        viewID = view.getId();
        if (viewID == R.id.button_gotit) {
            Intent loginActivityIntent = new Intent(getActivity(), LoginActivity.class);
            startActivity(loginActivityIntent);
        } else if (viewID == R.id.button6) {
            getActivity().finish();
        }
    }

    private void setListener() {
        setOnClickListener(gotItBtn);
        setOnClickListener(closeBtn);
    }

    private void setOnClickListener(Button button) {
        button.setOnClickListener(this);
    }

    private void getView(View view) {
        gotItBtn = getViewById(view, R.id.button_gotit);
        closeBtn = getViewById(view, R.id.button6);
    }

    private Button getViewById(View view, int id) {
        return view.findViewById(id);
    }

    public static Intro6Fragment newInstance() {
        Intro6Fragment fragment = new Intro6Fragment();
        return fragment;
    }



}
