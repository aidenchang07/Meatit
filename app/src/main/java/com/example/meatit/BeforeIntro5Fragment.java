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
public class BeforeIntro5Fragment extends Fragment implements View.OnClickListener {

    private Button closeBtn;

    public BeforeIntro5Fragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
//        return inflater.inflate(R.layout.fragment_before_intro5, container, false);
        View view = inflater.inflate(R.layout.fragment_before_intro5, container, false);
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

    public static BeforeIntro5Fragment newInstance() {
        BeforeIntro5Fragment fragment = new BeforeIntro5Fragment();
        return fragment;
    }

}
