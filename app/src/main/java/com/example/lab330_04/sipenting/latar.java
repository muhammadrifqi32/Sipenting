package com.example.lab330_04.sipenting;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class latar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_latar);
        //tombol back
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        //title action bar
        getSupportActionBar().setTitle("Latar Belakang Aplikasi");
    }
}
