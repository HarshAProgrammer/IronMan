package com.android.stark;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;

import com.blogspot.atifsoftwares.animatoolib.Animatoo;

public class SecondSplashScreenActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_second_splash_screen);

        openMainActivityFromSecondSplash();


    }


    private void openMainActivityFromSecondSplash() {
        int SECOND_SPLASH_SCREEN_TIME = 810;
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent openMainActivityFromSecondSplash = new Intent(SecondSplashScreenActivity.this, MainActivity.class);
                startActivity(openMainActivityFromSecondSplash);
                finish();
                Animatoo.animateSlideUp(SecondSplashScreenActivity.this);
            }
        }, SECOND_SPLASH_SCREEN_TIME);
    }


    @Override
    public void onBackPressed() {

    }
}
