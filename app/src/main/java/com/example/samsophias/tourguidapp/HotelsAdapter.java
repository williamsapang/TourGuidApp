package com.example.samsophias.tourguidapp;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

public class HotelsAdapter extends FragmentPagerAdapter {

    HotelsAdapter(FragmentManager fm) {
        super(fm);
    }

    // Assign the number of fragments
    @Override
    public int getCount() {
        return 2;
    }

    // Get necessary fragment according to its position
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                ArrayList<List> budget = new ArrayList<>();
                budget.add(new List(R.drawable.hotels1, R.string.indra, R.string.hotelsbudgetdesc1));
                budget.add(new List(R.drawable.hotels2, R.string.misliana, R.string.hotelsbudgetdesc2));
                budget.add(new List(R.drawable.hotels3, R.string.heritage, R.string.hotelsbudgetdesc3));
                budget.add(new List(R.drawable.indosela, R.string.indoselaname, R.string.hotelsbudgetdesc4));

                return BudgetFragment.newInstance(budget);

            case 1:
                ArrayList<List> costly = new ArrayList<>();
                costly.add(new List(R.drawable.marante, R.string.marante, R.string.hotelscostlydesc1));
                costly.add(new List(R.drawable.luta, R.string.lutaname, R.string.hotelscostlydesc2));
                costly.add(new List(R.drawable.negandeng, R.string.negandeng, R.string.hotelscostlydesc2));


                return ExpensiveFragment.newInstance(costly);
        }
        return null;
    }

    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "Budget";
            case 1:
                return "Expensive";
        }
        return null;
    }
}
