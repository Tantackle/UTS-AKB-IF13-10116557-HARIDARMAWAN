package com.tantackle.myprofilapplication.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.tantackle.myprofilapplication.R;


//tanggal pengeerjaan : 21-05-2019
//nim  : 10116557
//nama : Hari Darmawan
//kelas: IF 13

public class fragmentprofil extends Fragment {
    public fragmentprofil() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_profil, container, false);
    }
}
