package com.example.vikasrapaka.firebase;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Home extends AppCompatActivity {

    private static int SPLASH_TIMEM_OUT=1000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent homeIntent = new Intent(Home.this,WelcomePage.class);
                startActivity(homeIntent);
                finish();
            }
        },SPLASH_TIMEM_OUT);
    }
}
