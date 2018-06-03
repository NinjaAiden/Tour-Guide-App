package com.example.android.tourguideapp;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Aiden on 21/04/2018.
 */

public class CategoryAdapter extends FragmentPagerAdapter {

    private Context mContext;

    private int PAGE_COUNT = 4;

    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new ShoppingFragment();
        } else if (position == 1) {
            return new HistoryFragment();
        } else if (position == 2) {
            return new FoodFragment();
        } else {
            return new EventsFragment();
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.shopping_category);
        } else if (position == 1) {
            return mContext.getString(R.string.history_category);
        } else if (position == 2) {
            return mContext.getString(R.string.food_category);
        } else {
            return mContext.getString(R.string.events_category);
        }
    }
}
