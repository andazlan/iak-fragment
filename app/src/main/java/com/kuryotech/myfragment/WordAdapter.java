package com.kuryotech.myfragment;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by azlan on 4/30/17.
 */

public class WordAdapter extends ArrayAdapter<Word> {

    public WordAdapter(Context context){
        super(context, 0, new ArrayList<Word>());
    }

    public WordAdapter(Context context, ArrayList<Word> words){
        super(context, 0, words);
    }

    //@NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.word_item,
                    parent, false);
        }

        final Word word = getItem(position);
        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.txt_default);
        defaultTextView.setText(word.getDefautlName());


        TextView translation = (TextView) listItemView.findViewById(R.id.txt_translation);
        translation.setText(word.getTranslation());

        if (word.getImage() != null) {
            ImageView image = (ImageView) listItemView.findViewById(R.id.img_image);
            image.setImageDrawable(word.getImage());
        }

        listItemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), word.getDefautlName(), Toast.LENGTH_SHORT).show();
            }
        });

        return listItemView;
    }
}
