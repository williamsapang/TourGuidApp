package com.example.samsophias.tourguidapp;

import android.support.design.widget.NavigationView;

import android.support.v4.app.FragmentManager;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;


public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    PlaceFragment places;
    TabFragment tabFragments;
    NavigationView navigationView;
    FragmentManager fragManager;
    SouvenirFragment souvenir;
    HotelsFragment hotels;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        setTitle("Places");
        places = new PlaceFragment();
        fragManager = getSupportFragmentManager();
        fragManager.beginTransaction().replace(R.id.frame, places).commit();

    }

     @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

       if (id == R.id.iconic_places) {
           setTitle("Places");
           places = new PlaceFragment();
           fragManager = getSupportFragmentManager();
           fragManager.beginTransaction().replace(R.id.frame, places).commit();
           item.setChecked(true);
       } else if (id == R.id.hotels) {
           setTitle("Hotels");
           hotels = new HotelsFragment();
           fragManager = getSupportFragmentManager();
           fragManager.beginTransaction().replace(R.id.frame, hotels).commit();
       }else if (id == R.id.restaurants) {
           setTitle("Restaurants");
           tabFragments = new TabFragment();
           fragManager = getSupportFragmentManager();
           fragManager.beginTransaction().replace(R.id.frame, tabFragments).commit();
       }else if (id == R.id.souvenir_centers) {
           setTitle("Souvenir Centers");
           souvenir = new SouvenirFragment();
           fragManager = getSupportFragmentManager();
           fragManager.beginTransaction().replace(R.id.frame, souvenir).commit();
       }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
