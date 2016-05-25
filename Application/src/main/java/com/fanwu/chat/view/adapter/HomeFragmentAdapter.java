package com.fanwu.chat.view.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by fan on 2016/5/24.
 */

public class HomeFragmentAdapter extends FragmentPagerAdapter {
    public HomeFragmentAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return null;
        }
        return null;

    }

    @Override
    public int getCount() {
        return 4;
    }
}
