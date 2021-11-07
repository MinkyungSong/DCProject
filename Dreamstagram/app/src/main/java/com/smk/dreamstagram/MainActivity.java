package com.smk.dreamstagram;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;
import com.smk.dreamstagram.fragmnet.HomeFragment;
import com.smk.dreamstagram.fragmnet.ProfileFragment;
import com.smk.dreamstagram.fragmnet.SearchFragment;
import com.smk.dreamstagram.fragmnet.ShopFragment;
import com.smk.dreamstagram.fragmnet.VideoFragment;

public class MainActivity extends AppCompatActivity {

    int selectedFragment = 0;   // 0:home, 1:search, 2:video, 3:shop, 4:profile

    FragmentManager fragmentManager;
    FragmentTransaction fragmentTransaction;

    HomeFragment homeFragment;
    SearchFragment searchFragment;
    VideoFragment videoFragment;
    ShopFragment shopFragment;
    ProfileFragment profileFragment;

    BottomNavigationView bottomNavi_main;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        homeFragment = new HomeFragment();
        searchFragment = new SearchFragment();
        videoFragment = new VideoFragment();
        shopFragment = new ShopFragment();
        profileFragment = new ProfileFragment();

        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.flMain, homeFragment);
        fragmentTransaction.commit();

        bottomNavi_main = findViewById(R.id.bottomNavi_main);
        bottomNavi_main.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                if(item.getItemId() == R.id.mi_home){
                    if(selectedFragment != 0){
                        fragmentTransaction = fragmentManager.beginTransaction();
                        fragmentTransaction.replace(R.id.flMain, homeFragment);
                        fragmentTransaction.commit();
                        selectedFragment = 0;
                    }
                    return true;
                }else if(item.getItemId() == R.id.mi_search){
                    if(selectedFragment != 1){
                        fragmentTransaction = fragmentManager.beginTransaction();
                        fragmentTransaction.replace(R.id.flMain, searchFragment);
                        fragmentTransaction.commit();
                        selectedFragment = 1;
                    }
                    return true;
                }else if(item.getItemId() == R.id.mi_video){
                    if(selectedFragment != 2){
                        fragmentTransaction = fragmentManager.beginTransaction();
                        fragmentTransaction.replace(R.id.flMain, videoFragment);
                        fragmentTransaction.commit();
                        selectedFragment = 2;
                    }
                    return true;
                }else if(item.getItemId() == R.id.mi_shop){
                    if(selectedFragment != 3){
                        fragmentTransaction = fragmentManager.beginTransaction();
                        fragmentTransaction.replace(R.id.flMain, shopFragment);
                        fragmentTransaction.commit();
                        selectedFragment = 3;
                    }
                    return true;
                }else if(item.getItemId() == R.id.mi_profile){
                    if(selectedFragment != 4){
                        fragmentTransaction = fragmentManager.beginTransaction();
                        fragmentTransaction.replace(R.id.flMain, profileFragment);
                        fragmentTransaction.commit();
                        selectedFragment = 4;
                    }
                    return true;
                }

                return false;
            }
        });

    }
}