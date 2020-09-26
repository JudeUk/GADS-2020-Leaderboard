package com.example.gadsleaderboard2020;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class FragAdapt extends FragmentStatePagerAdapter {

    int mNumOfTabs;

    public FragAdapt(@NonNull FragmentManager fm, int NumOfTabs) {
        super(fm,NumOfTabs);
        this.mNumOfTabs = NumOfTabs;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        switch (position){
        case 0: return new TabFragment1();
        case 1: return new TabFragment2();
        default: return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}
