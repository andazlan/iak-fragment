package com.kuryotech.myfragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by azlan on 5/2/17.
 */

public class LoremIpsumFragment extends Fragment {
    private TextView title;
    public static String mTitle = null;
    public static LoremIpsumFragment newInstance() {
        LoremIpsumFragment fragment = new LoremIpsumFragment();
        return fragment;
    }

    public LoremIpsumFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.fragment_lipsum, container, false);
        title = (TextView) view.findViewById(R.id.txt_title);
        mTitle = title.getText().toString();
        return  view;
    }
}
