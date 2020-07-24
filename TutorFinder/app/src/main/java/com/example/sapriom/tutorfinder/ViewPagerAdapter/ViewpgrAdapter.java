package com.example.sapriom.tutorfinder.ViewPagerAdapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

/**
 * Created by SA Priom on 2/26/2018.
 */

public class ViewpgrAdapter extends FragmentPagerAdapter {

    ArrayList<Fragment> fragmentArrayList = new ArrayList<>();
    ArrayList<String> tabtitleList = new ArrayList<>();
    public ViewpgrAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentArrayList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentArrayList.size();
    }

    @Override

    public String getPageTitle(int position)
    {
        return tabtitleList.get(position);
    }

    public void addFragment (Fragment fragment, String title)
    {
        fragmentArrayList.add(fragment);
        tabtitleList.add(title);
    }
}
