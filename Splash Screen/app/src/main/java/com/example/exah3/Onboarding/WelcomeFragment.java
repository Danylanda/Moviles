package com.example.exah3.Onboarding;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.exah3.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class WelcomeFragment extends Fragment {

    private TextView textNext;
    private ViewPager viewPager;
    private View view;

    public WelcomeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        initializeInflater(inflater, container);
        initializeComponents();
        eventClickNext();

        return view;
    }

    public void initializeInflater(LayoutInflater inflater, ViewGroup container) {
        view = inflater.inflate(R.layout.fragment_welcome, container, false);
    }

    public void initializeComponents() {
        viewPager = getActivity().findViewById(R.id.viewPagerContainer);
        textNext = view.findViewById(R.id.textPrevIns);
    }

    public void eventClickNext() {
        textNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(1);
            }
        });
    }
}