package com.smk.dreamstagram;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.graphics.drawable.shapes.Shape;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.google.android.material.tabs.TabLayout;
import com.smk.dreamstagram.fragmnet.JoinByEmailFragment;
import com.smk.dreamstagram.fragmnet.JoinByPhoneFragment;

public class JoinActivity extends AppCompatActivity {

    TabLayout tabLayout_join;
    FragmentManager fragmentManager;
    FragmentTransaction fragmentTransaction;

    JoinByPhoneFragment joinByPhoneFragment = new JoinByPhoneFragment();
    JoinByEmailFragment joinByEmailFragment = new JoinByEmailFragment();

    Button btnBackToLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_join);

        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.flJoin, joinByPhoneFragment);
        fragmentTransaction.commit();   // transaction 작업이 끝났다는 것을 명시

        tabLayout_join = findViewById(R.id.tabLayout_join);
        tabLayout_join.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {

                if(tab.getPosition() == 0){
                    fragmentTransaction = fragmentManager.beginTransaction();
                    fragmentTransaction.replace(R.id.flJoin, joinByPhoneFragment);
                    fragmentTransaction.commit();
                }else if(tab.getPosition() == 1){
                    fragmentTransaction = fragmentManager.beginTransaction();
                    fragmentTransaction.replace(R.id.flJoin, joinByEmailFragment);
                    fragmentTransaction.commit();   // transaction 작업이 끝났다는 것을 명시
                }

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });



    }
}