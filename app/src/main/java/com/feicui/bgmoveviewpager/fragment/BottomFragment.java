package com.feicui.bgmoveviewpager.fragment;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.feicui.bgmoveviewpager.R;
import com.feicui.bgmoveviewpager.interfaces.IViewPagerCurrent;

/**
 * Created by AAAAA on 2016/7/31.
 */
public class BottomFragment extends Fragment implements View.OnClickListener {
    private View contentView;
    private ImageView btnTop;

    private IViewPagerCurrent mViewPagerListener;

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        mViewPagerListener = (IViewPagerCurrent) activity;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        contentView=inflater.inflate(R.layout.fragment_bottom,null);
        return contentView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView();
    }

    private void initView() {
        btnTop = (ImageView) contentView.findViewById(R.id.btn_bottom_top);
        btnTop.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        mViewPagerListener.setCurrentPager(0);
    }
}
