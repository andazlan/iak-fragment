package com.kuryotech.myfragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by azlan on 5/2/17.
 */

public class ImageFragment extends Fragment {
    private TextView content;
    public static String mContent;

    public static ImageFragment newInstance() {
        ImageFragment fragment = new ImageFragment();
        return fragment;
    }

    public ImageFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.fragment_image, container, false);
        content = (TextView) view.findViewById(R.id.txt_view1);
        mContent = content.getText().toString();
        return  view;
    }
}
