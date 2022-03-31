package com.example.bismillah;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import com.google.android.material.card.MaterialCardView;

public class SplashActivity extends AppCompatActivity {

    Animation logo_anim, name_anim;
    MaterialCardView materialCardView, materialCardView2;
    PreferenceData data;
    String b;
    int c = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        setContentView(R.layout.activity_splash);

        logo_anim = AnimationUtils.loadAnimation(this,R.anim.logo_anim);
        name_anim = AnimationUtils.loadAnimation(this,R.anim.name_anim);
        initViews();
        data = new PreferenceData(this);
        b = data.getShared("isFirst");
        materialCardView.setAnimation(logo_anim);
        materialCardView2.setAnimation(name_anim);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if (data.getShared("isFirst").equals("")){
                    Intent intent = new Intent(SplashActivity.this, LoginActivity.class);
                    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(intent);

                    finish();
                }else {
                    startActivity(new Intent(SplashActivity.this, MainActivity.class));




                }

            }
        },3300);

    }

    private void initViews() {
        materialCardView = findViewById(R.id.logmtr);
        materialCardView2 = findViewById(R.id.namemtr);
    }
}