package com.smk.dreamstagram.fragmnet;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.smk.dreamstagram.R;

public class HomeFragment extends Fragment {

    Toolbar toolbarHome;

    public HomeFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        toolbarHome = view.findViewById(R.id.toolbarHome);
        ((AppCompatActivity)getActivity()).setSupportActionBar(toolbarHome);    //fragment에서 setSupportedActionBar 사용하는 방법, 굳이 없어도...?




        return view;
    }
}