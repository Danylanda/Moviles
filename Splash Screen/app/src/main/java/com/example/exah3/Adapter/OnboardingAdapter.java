package com.example.exah3.Adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.exah3.Onboarding.tres;
import com.example.exah3.Onboarding.dos;
import com.example.exah3.Onboarding.WelcomeFragment;

public class OnboardingAdapter extends FragmentPagerAdapter {

    public OnboardingAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        switch (position){
            case 0:
                return new WelcomeFragment();
            case 1:
                return new dos();
            case 2:
                return new tres();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 3;
    }
}