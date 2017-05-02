package com.kuryotech.myfragment;

import android.graphics.drawable.Drawable;

/**
 * Created by azlan on 4/30/17.
 */

public class Word {
    private String mDefautlName, mTranslation;
    private Drawable mImage;

    public Word() {
        mDefautlName = null;
        mTranslation = null;
        mImage = null;
    }

    public Word(String defautlName, String translation, Drawable image) {
        this.mDefautlName = defautlName;
        this.mTranslation = translation;
        this.mImage = image;
    }

    public String getDefautlName() {
        return mDefautlName;
    }

    public void setDefautlName(String defautlName) {
        this.mDefautlName = defautlName;
    }

    public String getTranslation() {
        return mTranslation;
    }

    public void setTranslation(String translation) {
        this.mTranslation = translation;
    }

    public Drawable getImage() {
        return mImage;
    }

    public void setImage(Drawable image) {
        this.mImage = image;
    }
}
