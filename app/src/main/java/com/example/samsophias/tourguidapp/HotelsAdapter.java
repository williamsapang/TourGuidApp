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
                budget.add(new List(R.drawable.budgetcaf2, R.string.cafe_kanaan, R.string.budget_desc2));
                budget.add(new List(R.drawable.budgetcaf3, R.string.rimiko_restaurant, R.string.budget_desc3));

                return BudgetFragment.newInstance(budget);

            case 1:
                ArrayList<List> costly = new ArrayList<>();
                costly.add(new List(R.drawable.costlycaf1, R.string.house_bistro, R.string.costly_desc1));
                costly.add(new List(R.drawable.costlycaf2, R.string.pong_buri, R.string.costly_desc2));
                costly.add(new List(R.drawable.costlycaf3, R.string.saruran, R.string.costly_desc3));
                costly.add(new List(R.drawable.costlycaf3, R.string.saruran, R.string.costly_desc3));

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
