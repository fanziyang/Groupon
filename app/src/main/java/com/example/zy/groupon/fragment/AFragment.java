package com.example.zy.groupon.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.zy.groupon.R;
import com.example.zy.groupon.ui.MainActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class AFragment extends BaseFragment {
    @BindView(R.id.tv_fragment_skip)
    TextView tvSkip;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_a,container,false);
        ButterKnife.bind(this,view);

        skip(tvSkip);
        return view ;
    }

}
