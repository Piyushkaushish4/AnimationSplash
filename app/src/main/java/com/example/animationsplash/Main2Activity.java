package com.example.animationsplash;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class Main2Activity extends AppCompatActivity {
  ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        //to hide Main2Activity above screen we use
        getSupportActionBar().hide();
        //for animation in res/ right click new/DIRECTORY create anim your choice

        //on created anim create new xml anim/animationresourcefile give name of your choice
        imageView=findViewById(R.id.imageView);
        Animation animation =AnimationUtils.loadAnimation(getApplicationContext(),R.anim.splash_actitity);
        imageView.setAnimation(animation);
        animation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                finish();
                startActivities(new Intent[]{new Intent(Main2Activity.this, BottomActivity.class)});

            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });




    }
}
