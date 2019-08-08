package com.example.meatit;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class IntroActivity extends AppCompatActivity {

    FragmentPagerAdapter adapterViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        final RadioGroup radioGroup = findViewById(R.id.radioGroup);
        final RadioButton radioButton = findViewById(R.id.radioButton);
        final RadioButton radioButton2 = findViewById(R.id.radioButton2);
        final RadioButton radioButton3 = findViewById(R.id.radioButton3);
        final RadioButton radioButton4 = findViewById(R.id.radioButton4);
        final RadioButton radioButton5 = findViewById(R.id.radioButton5);
        final RadioButton radioButton6 = findViewById(R.id.radioButton6);
        radioButton.setChecked(true);

        final ViewPager vpPager = findViewById(R.id.viewPager);
        adapterViewPager = new ViewPagerAdapter(getSupportFragmentManager());
        vpPager.setAdapter(adapterViewPager);
        vpPager.setPageTransformer(true, new DepthPageTransformer());
        vpPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                if (position == 0){
                    radioButton.setChecked(true);
                }else if (position == 1){
                    radioButton2.setChecked(true);
                }else if (position == 2){
                    radioButton3.setChecked(true);
                }else if (position == 3){
                    radioButton4.setChecked(true);
                }else if (position == 4){
                    radioButton5.setChecked(true);
                }else if (position == 5){
                    radioButton6.setChecked(true);
                }else{

                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedID) {
                if (checkedID == radioButton.getId()){
                    vpPager.setCurrentItem(0);
                } else if (checkedID == radioButton2.getId()){
                    vpPager.setCurrentItem(1);
                }else if (checkedID == radioButton3.getId()){
                    vpPager.setCurrentItem(2);
                }else if (checkedID == radioButton4.getId()){
                    vpPager.setCurrentItem(3);
                }else if (checkedID == radioButton5.getId()){
                    vpPager.setCurrentItem(4);
                }else if (checkedID == radioButton6.getId()){
                    vpPager.setCurrentItem(5);
                }
            }
        });

    }
}
