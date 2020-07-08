package com.android.stark;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;
import android.widget.TextView;

import com.blogspot.atifsoftwares.animatoolib.Animatoo;


public class DetailActivity extends AppCompatActivity {
    TextView productDescription;
    ImageView productImage;
    private Typeface detailDescriptionFont;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        setUpUIViewsDetailActivity();
        setTransitionDialogue();

        getInformationFromMain();


    }

    private void setUpUIViewsDetailActivity() {
        productDescription = (TextView) findViewById(R.id.tvDetailDescription);
        productImage = (ImageView) findViewById(R.id.ivDetailImage);
        detailDescriptionFont = Typeface.createFromAsset(this.getAssets(), "fonts/Roboto-Regular.ttf");
        productDescription.setTypeface(detailDescriptionFont);
    }

    private void setTransitionDialogue() {
        final TransitionDialogue transitionDialogue = new TransitionDialogue(DetailActivity.this);
        transitionDialogue.startTransitionDialogue();
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                transitionDialogue.dismissDialogue();
            }
        }, 2000);
    }


    private void getInformationFromMain() {
        Bundle mBundle = getIntent().getExtras();
        if (mBundle != null) {
            productDescription.setText(mBundle.getString("Description"));
            productImage.setImageResource(mBundle.getInt("Image"));


        }
    }

    @Override
    public void onBackPressed() {
        Intent openMainActivityFromDetail = new Intent(DetailActivity.this, MainActivity.class);
        startActivity(openMainActivityFromDetail);
        finish();
        Animatoo.animateSwipeRight(this);
    }
}
