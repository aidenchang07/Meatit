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

    private Button gotitBtn;

    public Intro6Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
//        return inflater.inflate(R.layout.fragment_intro6, container, false);
        View view = inflater.inflate(R.layout.fragment_intro6, container, false);
        gotitBtn = view.findViewById(R.id.button_gotit);
        gotitBtn.setOnClickListener(this);
        return view;
    }

    public static Intro6Fragment newInstance() {
        Intro6Fragment fragment = new Intro6Fragment();
        return fragment;
    }

    @Override
    public void onClick(View view) {
        Intent loginActivityIntent = new Intent(getActivity(), LoginActivity.class);
        startActivity(loginActivityIntent);
    }
}
