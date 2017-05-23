package com.kuryotech.myfragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by azlan on 5/2/17.
 */

public class ListFragment extends Fragment {
    private ListView listWord;
    public static Word mWord = null;
    public static ListFragment newInstance() {
        ListFragment fragment = new ListFragment();
        return fragment;
    }

    public ListFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.fragment_list, container, false);
        listWord = (ListView) view.findViewById(R.id.lsv_words);

        ArrayList<Word> arrayWord = new ArrayList<>();

        //Word word = new Word("One", "Satu", getDrawable(R.mipmap.ic_launcher));
        arrayWord.add(new Word("One", "Satu", ContextCompat.getDrawable(getContext(), R.drawable.number_one)));
        arrayWord.add(new Word("Two", "Dua", ContextCompat.getDrawable(getContext(), R.drawable.number_two)));
        arrayWord.add(new Word("Three", "Tiga", ContextCompat.getDrawable(getContext(), R.drawable.number_three)));
        arrayWord.add(new Word("Four", "Empat", ContextCompat.getDrawable(getContext(), R.drawable.number_four)));
        arrayWord.add(new Word("Five", "Lima", ContextCompat.getDrawable(getContext(), R.drawable.number_five)));
        arrayWord.add(new Word("Six", "Enam", ContextCompat.getDrawable(getContext(), R.drawable.number_six)));
        arrayWord.add(new Word("Seven", "Tujuh", ContextCompat.getDrawable(getContext(), R.drawable.number_seven)));
        arrayWord.add(new Word("Eight", "Delapan", ContextCompat.getDrawable(getContext(), R.drawable.number_eight)));
        arrayWord.add(new Word("Nine", "Sembilan", null));
        arrayWord.add(new Word("Ten", "Sepuluh", ContextCompat.getDrawable(getContext(), R.drawable.number_ten)));

        WordAdapter wordAdapter = new WordAdapter(getContext(), arrayWord);
        listWord.setAdapter(wordAdapter);

        mWord = wordAdapter.getItem(1);

        return  view;
    }
}
