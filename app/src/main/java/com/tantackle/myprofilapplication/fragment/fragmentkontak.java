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

public class fragmentkontak extends Fragment{
    public fragmentkontak() { }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_kontak, container, false);

        return view;
    }
}
