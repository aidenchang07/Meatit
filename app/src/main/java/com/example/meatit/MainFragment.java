package com.example.meatit;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class MainFragment extends Fragment {

    public MainFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Button goToAccountBtn = view.findViewById(R.id.goToAccountBtn);
        Button goToSettingBtn = view.findViewById(R.id.goToSettingBtn);
        goToAccountBtn.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.toAccountFragment));
        goToSettingBtn.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.toSettingFragment));
    }
}
