package com.leaf.clips.view;

import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.TextView;

import com.leaf.clips.R;
import com.leaf.clips.presenter.HomeActivity;

public class HomeViewImp implements HomeView, NavigationView.OnNavigationItemSelectedListener {
    HomeActivity homeActivity;
    int layoutId;
    Toolbar toolbar;
    DrawerLayout drawer;
    NavigationView navigationView;
    SearchView searchView;
    TextView buildingAddress;
    TextView buildingName;
    TextView buildingADescription;
    TextView buildingOpeningHours;
    ListView poiCategories;
    FloatingActionButton exploreButton;

    public HomeViewImp(HomeActivity presenter) {
        this.homeActivity = presenter;
        presenter.setContentView(R.layout.activity_home);

        toolbar = (Toolbar) presenter.findViewById(R.id.toolbar);
        presenter.setSupportActionBar(toolbar);

        exploreButton = (FloatingActionButton) presenter.findViewById(R.id.fab);
        if(exploreButton != null){
            exploreButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();
                }
            });
        }

        drawer = (DrawerLayout) presenter.findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                presenter, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        navigationView = (NavigationView) presenter.findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void setBuildingName(String name) {

    }

    @Override
    public void setBuildingDescription(String description) {

    }

    @Override
    public void setBuildingOpeningHours(String hours) {

    }

    @Override
    public void setBuildingAddress(String address) {

    }

    @Override
    public void setPoiCategoryListAdapter(ListAdapter adapter) {

    }

    /**
     *  Gestisce i tap dell'utente nel Drawer: esegue l'azione appropriata rispetto alla voce di
     *  menù scelta dall'utente.
     * @param item: voce del menù scelta dall'utente
     * @return true sse l'evento scatenato dal tap è stato gestito con successo
     */
    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.nav_developer) {
            // Handle the camera action
        }

        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
