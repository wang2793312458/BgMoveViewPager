package com.feicui.bgmoveviewpager.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.feicui.bgmoveviewpager.R;


/**
 * Created by liuz on 16/6/17.
 */
public class LeftFragment extends Fragment {

    private View contentView;
    private ImageView btnRight;
    private View.OnClickListener mListener;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        contentView = inflater.inflate(R.layout.fragment_left, null);
        return contentView;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView();
    }

    private void initView(){
        btnRight = (ImageView) contentView.findViewById(R.id.btn_left_right);
        btnRight.setOnClickListener(mListener);
    }

    public void setPagerOnClickListener(View.OnClickListener listener) {
        mListener = listener;
    }

}
