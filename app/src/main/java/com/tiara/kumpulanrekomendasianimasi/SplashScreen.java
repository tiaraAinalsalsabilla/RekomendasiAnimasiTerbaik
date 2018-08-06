package com.tiara.kumpulanrekomendasianimasi;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

public class SplashScreen extends AppCompatActivity {
    private final int SPLASH_DISPLAY_LENGTH = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(getApplicationContext() ,MainActivity.class );
                SplashScreen.this.startActivity(i);
                SplashScreen.this.finish();
            }
        },SPLASH_DISPLAY_LENGTH);


    }
}
