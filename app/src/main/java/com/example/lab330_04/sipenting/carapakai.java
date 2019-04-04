package com.example.lab330_04.sipenting;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class carapakai extends AppCompatActivity {
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carapakai);

        viewPager = (ViewPager) findViewById(R.id.viewPager);

        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(this);

        viewPager.setAdapter(viewPagerAdapter);
        //tombol back
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        //title action bar
        getSupportActionBar().setTitle("Cara Menggunakan Aplikasi");
    }
}