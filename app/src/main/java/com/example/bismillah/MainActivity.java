package com.example.bismillah;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.Switch;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        getSupportFragmentManager().beginTransaction().replace(R.id.main_container, new HomeFragment()).commit();
        bottomNavigationView.setSelectedItemId(R.id.home_frag);
        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment fragment = null;
                switch(item.getItemId()){
                    case R.id.home_frag:
                        fragment = new HomeFragment();
                        break;
                    case R.id.search_frag:
                        fragment = new SearchFragment();
                        break;
                    case R.id.cart_frag:
                        fragment = new CartFragment();
                        break;
                    case R.id.profile_frag:
                        fragment = new ProfileFragment();
                        break;
                }
                getSupportFragmentManager().beginTransaction().replace(R.id.main_container, fragment).commit();



                return true;
            }
        });
    }

    private void initViews() {
    bottomNavigationView = findViewById(R.id.bnv);
    }
}