package com.example.meatit;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class AfterIntroActivity extends AppCompatActivity {

    private ViewPager viewPager1;
    private FragmentPagerAdapter adapterViewPager;

    private RadioButton radioButton14;
    private RadioButton radioButton15;
    private RadioButton radioButton16;
    private RadioButton radioButton17;
    private RadioButton radioButton18;
    private RadioButton radioButton19;
    private RadioGroup radioGroup1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_after_intro);

        getview();
        radioButton14.setChecked(true);

        adapterViewPager = new AfterViewPagerAdapter(getSupportFragmentManager());
        viewPager1.setAdapter(adapterViewPager);
        viewPager1.setPageTransformer(true, new DepthPageTransformer());
        viewPager1.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            //滑到該頁面，即選中該圓圈
            @Override
            public void onPageSelected(int position) {
                if (position == 0){
                    radioButton14.setChecked(true);
                }else if (position == 1){
                    radioButton15.setChecked(true);
                }else if (position == 2){
                    radioButton16.setChecked(true);
                }else if (position == 3){
                    radioButton17.setChecked(true);
                }else if (position == 4){
                    radioButton18.setChecked(true);
                }else if (position == 5){
                    radioButton19.setChecked(true);
                }else{
                    //nothing
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

        radioGroup1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedID) {
                if (checkedID == radioButton14.getId()){
                    viewPager1.setCurrentItem(0);
                } else if (checkedID == radioButton15.getId()){
                    viewPager1.setCurrentItem(1);
                }else if (checkedID == radioButton16.getId()){
                    viewPager1.setCurrentItem(2);
                }else if (checkedID == radioButton17.getId()){
                    viewPager1.setCurrentItem(3);
                }else if (checkedID == radioButton18.getId()){
                    viewPager1.setCurrentItem(4);
                }else if (checkedID == radioButton19.getId()){
                    viewPager1.setCurrentItem(5);
                }
            }
        });

    }

    private void getview() {
        viewPager1 = findViewById(R.id.viewPager);
        radioGroup1 = findViewById(R.id.radioGroup1);
        radioButton14 = findViewById(R.id.radioButton14);
        radioButton15 = findViewById(R.id.radioButton15);
        radioButton16 = findViewById(R.id.radioButton16);
        radioButton17 = findViewById(R.id.radioButton17);
        radioButton18 = findViewById(R.id.radioButton18);
        radioButton19 = findViewById(R.id.radioButton19);
    }
}
