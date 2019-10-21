package com.hnsamal.mygate.ui.main.tab;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.hnsamal.mygate.R;
import com.hnsamal.mygate.ui.main.tab.ActivityFragment;
import com.hnsamal.mygate.ui.main.tab.CommunityFragment;
import com.hnsamal.mygate.ui.main.tab.HouseHoldFragment;

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

    @StringRes
    private static final int[] TAB_TITLES = new int[]{R.string.tab_text_1, R.string.tab_text_2,R.string.tab_text_3};
    private final Context mContext;

    private static final int ACTIVITY_FRAGMENT = 0;
    private static final int COMMUNITY_FRAGMENT = 1;
    private static final int HOUSE_HOLD_FRAGMENT = 2;

    public SectionsPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        // getItem is called to instantiate the fragment for the given page.
        // Return a PlaceholderFragment (defined as a static inner class below).
        Fragment fragment = null;
        switch (position) {

            case ACTIVITY_FRAGMENT:
                fragment = ActivityFragment.newInstance();
                break;
            case COMMUNITY_FRAGMENT:
                fragment = CommunityFragment.newInstance();
                break;
            case HOUSE_HOLD_FRAGMENT:
                fragment = HouseHoldFragment.newInstance();
                break;

        }
        return fragment;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mContext.getResources().getString(TAB_TITLES[position]);
    }

    @Override
    public int getCount() {
        return TAB_TITLES.length;
    }
}