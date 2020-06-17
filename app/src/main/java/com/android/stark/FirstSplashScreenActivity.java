package com.android.stark;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
public class FirstSplashScreenActivity extends AppCompatActivity {


    //variables
    Animation topAnim, bottomAnim;
    ImageView splashImage;
    TextView splashText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_first_splash_screen);

        setUpUIViewsSplashScreen();

        setSplashAnimation();

        openSecondSplashActivityFromFirst();


    }

    private void setUpUIViewsSplashScreen() {
        //Animation
        topAnim = AnimationUtils.loadAnimation(this, R.anim.topsplashanimation);
        bottomAnim = AnimationUtils.loadAnimation(this, R.anim.bottomsplashanimation);

        //Hooks
        splashImage = findViewById(R.id.image_splash_first);
        splashText = findViewById(R.id.text_splash_first);
    }

    private void setSplashAnimation() {
        splashImage.setAnimation(topAnim);
        splashText.setAnimation(bottomAnim);
    }

    private void openSecondSplashActivityFromFirst() {
        int FIRST_SPLASH_SCREEN_TIME = 2500;
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent openSecondSplashActivityFromFirst = new Intent(FirstSplashScreenActivity.this, SecondSplashScreenActivity.class);
                startActivity(openSecondSplashActivityFromFirst);
                finish();
            }
        }, FIRST_SPLASH_SCREEN_TIME);
    }


    @Override
    public void onBackPressed() {

    }
}
