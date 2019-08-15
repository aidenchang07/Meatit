package com.example.meatit;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class BeforeIntroActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private FragmentPagerAdapter adapterViewPager;

    private RadioButton radioButton;
    private RadioButton radioButton2;
    private RadioButton radioButton3;
    private RadioButton radioButton4;
    private RadioButton radioButton5;
    private RadioButton radioButton6;
    private RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_before_intro);

        getView();
        radioButton.setChecked(true);

        adapterViewPager = new BeforeViewPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapterViewPager);
        viewPager.setPageTransformer(true, new DepthPageTransformer());
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            //滑到該頁面，即選中該圓圈
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
        //點底下圓圈即跳轉該頁面
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedID) {
                if (checkedID == radioButton.getId()){
                    viewPager.setCurrentItem(0);
                } else if (checkedID == radioButton2.getId()){
                    viewPager.setCurrentItem(1);
                }else if (checkedID == radioButton3.getId()){
                    viewPager.setCurrentItem(2);
                }else if (checkedID == radioButton4.getId()){
                    viewPager.setCurrentItem(3);
                }else if (checkedID == radioButton5.getId()){
                    viewPager.setCurrentItem(4);
                }else if (checkedID == radioButton6.getId()){
                    viewPager.setCurrentItem(5);
                }
            }
        });

    }

    private void getView(){
        viewPager = findViewById(R.id.viewPager);
        radioGroup = findViewById(R.id.radioGroup);
        radioButton = findViewById(R.id.radioButton);
        radioButton2 = findViewById(R.id.radioButton2);
        radioButton3 = findViewById(R.id.radioButton3);
        radioButton4 = findViewById(R.id.radioButton4);
        radioButton5 = findViewById(R.id.radioButton5);
        radioButton6 = findViewById(R.id.radioButton6);
    }
}
