package com.example.topnt.androidtablayoutwithfragments1;

import android.support.design.widget.AppBarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private AppBarLayout appBarLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tabLayout = (TabLayout) findViewById(R.id.TabLayout_id);
        appBarLayout = (AppBarLayout) findViewById(R.id.AppBarId);
        viewPager = (ViewPager) findViewById(R.id.viewPaper_id);
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        //Adding Fragments
        adapter.AddFragment(new Fragment_First() ,"FIRST");
        adapter.AddFragment(new Fragment_Second() , "SECOND");
        adapter.AddFragment(new Fragment_Third() , "THIRD");
        //adapter Setup
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);


    }
}
