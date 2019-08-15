package com.example.meatit;


import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class BeforeIntro1Fragment extends Fragment implements View.OnClickListener {

    private Button closeBtn;

    public BeforeIntro1Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
//        return inflater.inflate(R.layout.fragment_before_intro1, container, false);
        View view = inflater.inflate(R.layout.fragment_before_intro1, container, false);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getView(view);
        setListener();
//        closeBtn = view.findViewById(R.id.button);
//        closeBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        getActivity().finish();
    }

    private void getView(View view) {
        closeBtn = getViewById(view, R.id.button);
    }

    private void setListener() {
        setOnClickListener(closeBtn);
    }

    private Button getViewById(View view, int id) {
        return view.findViewById(id);
    }

    private void setOnClickListener(Button button) {
        button.setOnClickListener(this);
    }

    public static BeforeIntro1Fragment newInstance() {
        return new BeforeIntro1Fragment();
    }
}
