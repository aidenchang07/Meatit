package com.example.meatit;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class BeforeViewPagerAdapter extends FragmentPagerAdapter {

    private static int NUM_ITEMS = 6;

    public BeforeViewPagerAdapter(FragmentManager fragmentManager){
        super(fragmentManager, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                return BeforeIntro1Fragment.newInstance();
            case 1:
                return BeforeIntro2Fragment.newInstance();
            case 2:
                return BeforeIntro3Fragment.newInstance();
            case 3:
                return BeforeIntro4Fragment.newInstance();
            case 4:
                return BeforeIntro5Fragment.newInstance();
            case 5:
                return BeforeIntro6Fragment.newInstance();
            default:
                return null;
        }

    }

    @Override
    public int getCount() {
        return NUM_ITEMS;
    }

}
