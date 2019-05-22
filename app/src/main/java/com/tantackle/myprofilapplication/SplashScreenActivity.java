package com.tantackle.myprofilapplication;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;



//tanggal pengeerjaan : 21-05-2019
//nim  : 10116557
//nama : Hari Darmawan
//kelas: IF 13

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        new Handler().postDelayed (new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent (SplashScreenActivity.this, OnBoardingActivity.class);
                startActivity(i);
                finish ();
            }
        }, 3000);
    }
}
