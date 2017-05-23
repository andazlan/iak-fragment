package com.kuryotech.myfragment;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private TabLayout tab;
    private ViewPager pager;
    private MainPagerAdapter pagerAdapter;
    private Button showData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /* saya hilangkan elevation pada actionbar/toolbar agar actionbar/toolbar dan tab terkesan menyatu */
        getSupportActionBar().setElevation(0);

        /* init tab dan pager*/

        tab = (TabLayout) findViewById(R.id.tab);
        pager = (ViewPager) findViewById(R.id.pager);
        showData = (Button) findViewById(R.id.btn_show_data);
        pager.setOffscreenPageLimit(5);
        showData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data = "From fragment 1 : " + ListFragment.mWord.getDefautlName() + "\n"
                                + "From fragment 2 : " + LoremIpsumFragment.mTitle + "\n"
                                + "From fragment 3 : " + ImageFragment.mContent;
                Toast.makeText(MainActivity.this, data, Toast.LENGTH_SHORT).show();
            }
        });
        /* buat pager adapter buat viewpager untuk menampilkan isinya */
        pagerAdapter = new MainPagerAdapter(this, getSupportFragmentManager());

        /* jika adapter sudah terbentuk, set ke viewpagernya */
        pager.setAdapter(pagerAdapter);

        /* agar tab dan viewpager sincron, jangan lupa set pager di tabnya */
        tab.setupWithViewPager(pager);
    }
}
