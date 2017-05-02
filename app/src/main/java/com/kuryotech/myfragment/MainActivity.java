package com.kuryotech.myfragment;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TableLayout;

public class MainActivity extends AppCompatActivity {
    private TabLayout tab;
    private ViewPager pager;
    private MainPagerAdapter pagerAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /* saya hilangkan elevation pada actionbar/toolbar agar actionbar/toolbar dan tab terkesan menyatu */
        getSupportActionBar().setElevation(0);

        /* init tab dan pager*/
        tab = (TabLayout) findViewById(R.id.tab);
        pager = (ViewPager) findViewById(R.id.pager);

        /* buat pager adapter buat viewpager untuk menampilkan isinya */
        pagerAdapter = new MainPagerAdapter(this, getSupportFragmentManager());

        /* jika adapter sudah terbentuk, set ke viewpagernya */
        pager.setAdapter(pagerAdapter);

        /* agar tab dan viewpager sincron, jangan lupa set pager di tabnya */
        tab.setupWithViewPager(pager);
    }
}
