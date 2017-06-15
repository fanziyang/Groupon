package com.example.zy.groupon.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.ListFragment;

import com.example.zy.groupon.R;
import com.example.zy.groupon.fragment.AFragment;
import com.example.zy.groupon.fragment.BFragment;
import com.example.zy.groupon.fragment.CFragment;
import com.example.zy.groupon.fragment.DFragment;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tarena on 2017/6/15.
 */

public class MyPagerAdapter extends FragmentPagerAdapter {


    private final List<Fragment> fragments;

    public MyPagerAdapter(FragmentManager fm) {
        super(fm);
        fragments = new ArrayList<Fragment>();
        fragments.add(new AFragment());
        fragments.add(new BFragment());
        fragments.add(new CFragment());
        fragments.add(new DFragment());

    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }
}
