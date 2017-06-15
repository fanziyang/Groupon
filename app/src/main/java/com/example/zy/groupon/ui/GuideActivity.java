package com.example.zy.groupon.ui;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.view.View;

import com.example.zy.groupon.R;
import com.example.zy.groupon.adapter.MyPagerAdapter;
import com.viewpagerindicator.CirclePageIndicator;
import com.viewpagerindicator.PageIndicator;

import butterknife.BindView;
import butterknife.ButterKnife;

public class GuideActivity extends FragmentActivity {

    @BindView(R.id.vp_guide)
    ViewPager viewPager;
    MyPagerAdapter adapter;

    @BindView(R.id.indicator)
    CirclePageIndicator indicator;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guide);
        ButterKnife.bind(this);
        initiaUI();
    }


    private void initiaUI() {
        adapter=new MyPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);

        indicator = (CirclePageIndicator)findViewById(R.id.indicator);
        indicator.setViewPager(viewPager);

        final float density = getResources().getDisplayMetrics().density;

        indicator.setFillColor(0xffFE7E51);
        indicator.setStrokeColor(0xFFaaaaaa);
        indicator.setStrokeWidth(2 * density);
        indicator.setRadius(8* density);

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                if (position==3){
                    indicator.setVisibility(View.INVISIBLE);
                }else {
                    indicator.setVisibility(View.VISIBLE);
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

}
