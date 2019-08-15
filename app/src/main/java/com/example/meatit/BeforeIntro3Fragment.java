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
public class BeforeIntro3Fragment extends Fragment implements View.OnClickListener {

    private Button closeBtn;

    public BeforeIntro3Fragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
//        return inflater.inflate(R.layout.fragment_before_intro3, container, false);
        View view = inflater.inflate(R.layout.fragment_before_intro3, container, false);
        getView(view);
        setListener();

        return view;
    }

    @Override
    public void onClick(View view) {
        getActivity().finish();
    }

    private void getView(View view) {
        closeBtn = getViewById(view, R.id.button3);
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

    public static BeforeIntro3Fragment newInstance() {
        BeforeIntro3Fragment fragment = new BeforeIntro3Fragment();
        return fragment;
    }

}
