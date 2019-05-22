package com.tantackle.myprofilapplication;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

import com.tantackle.myprofilapplication.fragment.fragmentkontak;
import com.tantackle.myprofilapplication.fragment.fragmentprofil;
import com.tantackle.myprofilapplication.fragment.fragmentteman;


//tanggal pengeerjaan : 21-05-2019
//nim  : 10116557
//nama : Hari Darmawan
//kelas: IF 13

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadFragment(new fragmentprofil());

        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom_navigation_bar);
        bottomNavigationView.setOnNavigationItemSelectedListener(listenerBottom);
    }

    private BottomNavigationView.OnNavigationItemSelectedListener listenerBottom = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment f = new fragmentprofil();
            loadFragment(f);
            switch (item.getItemId()) {
                case R.id.home_menu:
                    f = new fragmentprofil();
                    loadFragment(f);
                    return true;
                case R.id.contact_menu:
                    f = new fragmentkontak();
                    loadFragment(f);
                    return true;
                case R.id.friend_menu:
                    f = new fragmentteman();
                    loadFragment(f);
                    return true;
            }
            return false;
        }
    };

    private void loadFragment(Fragment f) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.fragment_layout, f);
        transaction.addToBackStack(null);
        transaction.commit();
    }
}

