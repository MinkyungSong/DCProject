package com.smk.dreamstagram.fragmnet;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.navigation.NavigationView;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.smk.dreamstagram.R;
import com.smk.dreamstagram.adapter.PagerHomeAdapter;

public class HomeFragment extends Fragment {

    Toolbar toolbarHome;
    DrawerLayout drawerLayoutHome;
    NavigationView homeNavi;

    TabLayout tabHome;
    ViewPager2 viewPagerHome;
    PagerHomeAdapter pagerHomeAdapter;

    MyClassFragment myClassFragment = new MyClassFragment();
    NoticeFragment noticeFragment = new NoticeFragment();

    public HomeFragment() {

    }

    @Override
    public void onCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);
        inflater.inflate(R.menu.menu_home, menu);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        toolbarHome = view.findViewById(R.id.toolbarHome);
        ((AppCompatActivity)getActivity()).setSupportActionBar(toolbarHome);    //fragment에서 setSupportedActionBar 사용하는 방법, 굳이 없어도...?
        ((AppCompatActivity)getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        ((AppCompatActivity)getActivity()).getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_menu);
        setHasOptionsMenu(true);    //fragment에서 toolbar에 메뉴 사용하려면 꼭 필요한 코드

        drawerLayoutHome = view.findViewById(R.id.drawerLayoutHome);
        homeNavi = view.findViewById(R.id.homeNavi);

        viewPagerHome = view.findViewById(R.id.viewPagerHome);
        tabHome = view.findViewById(R.id.tabHome);

        setTabLayoutWithPager();



        return view;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if (item.getItemId() == android.R.id.home) {  // 안드로이드에서 기본으로 제공하는 home 버튼 (toolbar에 생기는 버튼)
            drawerLayoutHome.openDrawer(GravityCompat.START);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    void setTabLayoutWithPager(){

        pagerHomeAdapter = new PagerHomeAdapter((AppCompatActivity)getActivity());
        pagerHomeAdapter.addFragment(myClassFragment);
        pagerHomeAdapter.addFragment(noticeFragment);
        viewPagerHome.setAdapter(pagerHomeAdapter);

        String[] arrTabTitle = {"MyClass", "Notice"};

        // mediator
        new TabLayoutMediator(tabHome, viewPagerHome, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                tab.setText(arrTabTitle[position]);
            }
        }).attach();

    }


}