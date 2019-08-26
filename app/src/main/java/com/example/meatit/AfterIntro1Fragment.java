package com.example.meatit;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import pl.droidsonroids.gif.GifDrawable;
import pl.droidsonroids.gif.GifImageView;


/**
 * A simple {@link Fragment} subclass.
 */
public class AfterIntro1Fragment extends Fragment implements View.OnClickListener {

    private int viewID;
    private int loopCount;
    private Button button13; // Start playing
    private Button button15; // Pause playback
    private Button button16; // Set the number of plays
    private Button button17; // Reset
    private Button button18; // Replay
    private EditText editText3;
    private GifImageView gifImageView;
    private GifDrawable gifDrawable;

    public AfterIntro1Fragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_after_intro1, container, false);
        View view = inflater.inflate(R.layout.fragment_after_intro1, container, false);

        button13 = view.findViewById(R.id.button13);
        button15 = view.findViewById(R.id.button15);
        button16 = view.findViewById(R.id.button16);
        button17 = view.findViewById(R.id.button17);
        button18 = view.findViewById(R.id.button18);
        editText3 = view.findViewById(R.id.editText3);
        gifImageView = view.findViewById(R.id.gifImageView);
        gifDrawable = (GifDrawable) gifImageView.getDrawable();

        button13.setOnClickListener(this);
        button15.setOnClickListener(this);
        button16.setOnClickListener(this);
        button17.setOnClickListener(this);
        button18.setOnClickListener(this);

        return view;
    }

    // Return object for use by ViewPagerAdapter
    public static AfterIntro1Fragment newInstance() {
        return new AfterIntro1Fragment();
    }

    @Override
    public void onClick(View view) {
        viewID = view.getId();
        if (viewID == R.id.button13) {
            // Start playing
            gifDrawable.start();
        } else if (viewID == R.id.button15) {
            // Pause playback
            gifDrawable.stop();
        } else if (viewID == R.id.button16) {
            loopCount = Integer.parseInt(editText3.getText().toString());
            gifDrawable.setLoopCount(loopCount);
        } else if (viewID == R.id.button17) {
            // The values are initialized before they are completely reset.
            loopCount = 0;
            editText3.setText("");
            gifDrawable.setLoopCount(loopCount);
            gifDrawable.reset();
        } else if (viewID == R.id.button18) {
            gifDrawable.reset();
        } else {
            //nothing
            Toast.makeText(getActivity(), "nothing", Toast.LENGTH_SHORT).show();
        }
    }
}
