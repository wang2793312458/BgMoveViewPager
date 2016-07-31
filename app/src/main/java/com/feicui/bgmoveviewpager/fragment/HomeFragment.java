package com.feicui.bgmoveviewpager.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.feicui.bgmoveviewpager.R;

/**
 * Created by AAAAA on 2016/7/31.
 */
public class HomeFragment extends Fragment {
    private View contentView;

    private ImageView btnLeft, btnRight, btnBottom;

    private View.OnClickListener mListener;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        contentView = inflater.inflate(R.layout.fragment_home, null);
        return contentView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        iniView();
    }

    private void iniView() {
        btnLeft = (ImageView) contentView.findViewById(R.id.btn_left);
        btnLeft.setOnClickListener(mListener);
        btnRight = (ImageView) contentView.findViewById(R.id.btn_right);
        btnRight.setOnClickListener(mListener);
        btnBottom = (ImageView) contentView.findViewById(R.id.btn_bottom);
        btnBottom.setOnClickListener(mListener);
    }

    public void setPagerOnClickListener(View.OnClickListener listener) {
        mListener = listener;
    }

}
