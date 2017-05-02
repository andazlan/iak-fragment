package com.kuryotech.myfragment;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 *
 * Created by azlan on 5/2/17.
 */

public class MainPagerAdapter extends FragmentPagerAdapter {
    private Context mContext;

    /**
     * construcktor menggunakan 2 parameter, yaitu context dan fragmentmanager, setiap aktivity pasti punya fragmentmanager
      * @param context, fragmentmanager
     * @param fm
     */
    public MainPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    /**
     * Setiap page akan diisi oleh fragment, pager akan menampilkan fragment berdasarkan posisinya
     *
     * @param position
     * @return Fragment
     */
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return ListFragment.newInstance();
            case 1:
                return LoremIpsumFragment.newInstance();
            case 2:
                return ImageFragment.newInstance();
            default:
                return null;
        }
    }

    /**
     * jumlah halaman, saya ambil berdasarkan judul tab
     * @return int count
     */
    @Override
    public int getCount() {
        return getArrTitle().length;
    }

    /**
     * mengembalikan judul tab
     *
     * @param position
     * @return
     */
    @Override
    public CharSequence getPageTitle(int position) {
        return getArrTitle()[position];
    }

    /**
     * generate judul tab
     * @return String[]
     */
    public String[] getArrTitle(){
        String[] title = {
                mContext.getString(R.string.label_list),
                mContext.getString(R.string.label_paragraph),
                mContext.getString(R.string.label_image)
        };
        return title;
    }
}
