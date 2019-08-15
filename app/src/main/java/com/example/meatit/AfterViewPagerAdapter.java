package com.example.meatit;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class AfterViewPagerAdapter extends FragmentPagerAdapter {

    private static int NUM_ITEMS = 2;

    public AfterViewPagerAdapter(FragmentManager fragmentManager){
        super(fragmentManager, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return AfterIntro1Fragment.newInstance();
            case 1:
                return AfterIntro2Fragment.newInstance();
            case 2:
//                return AfterIntro3Fragment.newInstance();
            case 3:
//                return AfterIntro4Fragment.newInstance();
            case 4:
//                return AfterIntro5Fragment.newInstance();
            case 5:
//                return AfterIntro6Fragment.newInstance();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return NUM_ITEMS;
    }
}
