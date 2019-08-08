package com.example.meatit;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class ViewPagerAdapter extends FragmentPagerAdapter {

    private static int NUM_ITEMS = 6;

    public ViewPagerAdapter(FragmentManager fragmentManager){
        super(fragmentManager, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
    }

    @Override
    public int getCount() {
        return NUM_ITEMS;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                return Intro1Fragment.newInstance();
            case 1:
                return Intro2Fragment.newInstance();
            case 2:
                return Intro3Fragment.newInstance();
            case 3:
                return Intro4Fragment.newInstance();
            case 4:
                return Intro5Fragment.newInstance();
            case 5:
                return Intro6Fragment.newInstance();
            default:
                return null;
        }

    }

}
