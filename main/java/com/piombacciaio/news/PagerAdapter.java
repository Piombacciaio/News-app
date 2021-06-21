package com.piombacciaio.news;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class PagerAdapter extends FragmentPagerAdapter {

    int tabcount;

    public PagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
        tabcount=behavior;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position)
        {
            case 0:
                return new mainfragment();

            case 1:
                return new techfragment();

            case 2:
                return new sciencefragment();

            default:
                return new sciencefragment();
        }
    }

    @Override
    public int getCount() {
        return tabcount;
    }
}
