package com.example.meatit;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;


/**
 * A simple {@link Fragment} subclass.
 */
public class BeforeIntro6Fragment extends Fragment implements View.OnClickListener {

    private int viewID;
    private Button gotItBtn;
    private Button closeBtn;
    private CheckBox dtsChBox;
    private CheckBox dtsChBox2;

    public BeforeIntro6Fragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
//        return inflater.inflate(R.layout.fragment_before_intro6, container, false);
        View view = inflater.inflate(R.layout.fragment_before_intro6, container, false);
        //for button
        getView(view);
        setListener();
        //for checkbox
        dtsChBox = view.findViewById(R.id.checkBox);
        dtsChBox2 = view.findViewById(R.id.checkBox2);
        dtsChBox.setOnClickListener(this);
        dtsChBox2.setOnClickListener(this);

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
        } else if (viewID == R.id.checkBox2) {
            if (!dtsChBox.isChecked()) {
                dtsChBox.setChecked(true);
            } else {
                dtsChBox.setChecked(false);
            }
        } else {
            //nothing
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

    public static BeforeIntro6Fragment newInstance() {
        BeforeIntro6Fragment fragment = new BeforeIntro6Fragment();
        return fragment;
    }



}
