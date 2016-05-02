package com.leaf.clips.presenter;

import android.os.Bundle;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;

import com.leaf.clips.R;
import com.leaf.clips.view.HomeView;
import com.leaf.clips.view.HomeViewImp;

public class HomeActivity extends AppCompatActivity {
    HomeView homeView;
    /**
     *  TODO
        InformationManager informationManager;
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        homeView = new HomeViewImp(this);
    }

    /**
     * Chiude il Drawer se utente esegue tap sul tasto Back.
     */
    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout_home);
        if(drawer != null){
            if (drawer.isDrawerOpen(GravityCompat.START)) {
                drawer.closeDrawer(GravityCompat.START);
            } else {
                super.onBackPressed();
            }
        }
    }
}
