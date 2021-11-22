package com.smk.dreamstagram.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import java.util.ArrayList;

public class PagerHomeAdapter extends FragmentStateAdapter {

    ArrayList<Fragment> listFragment = new ArrayList<>();


    public PagerHomeAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        return listFragment.get(position);
    }

    @Override
    public int getItemCount() {
        return listFragment.size();
    }

    // Fragment
    public void addFragment(Fragment fragment){
        listFragment.add(fragment);
        notifyDataSetChanged();
    }
}
