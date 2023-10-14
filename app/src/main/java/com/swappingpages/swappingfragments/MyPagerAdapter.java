package com.swappingpages.swappingfragments;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class MyPagerAdapter extends FragmentPagerAdapter {

    public MyPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new HomeFragment(); // Replace with the actual fragment class
            case 1:
                return new FavoritesFragment(); // Replace with the actual fragment class
            case 2:
                return new SearchFragment(); // Replace with the actual fragment class
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 3; // The number of fragments you have
    }
}
