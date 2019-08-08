package com.example.meatit;


import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class Intro1Fragment extends Fragment {

    public Intro1Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
//        return inflater.inflate(R.layout.fragment_intro1, container, false);
        View view = inflater.inflate(R.layout.fragment_intro1, container, false);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
//        Button goToAccountBtn = view.findViewById(R.id.goToAccountBtn);
//        goToAccountBtn.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.toAccountFragment));
    }

    public static Intro1Fragment newInstance() {
        Intro1Fragment fragment = new Intro1Fragment();
        return fragment;
    }

}
