package com.negi.peacocksolar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;

public class SplashScreen extends AppCompatActivity {
    LinearLayout layout1,layout2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        layout1=findViewById(R.id.lay1);
        layout2=findViewById(R.id.lay2);

        Animation anim1= AnimationUtils.loadAnimation(SplashScreen.this,R.anim.topdown);
        Animation anim2=AnimationUtils.loadAnimation(SplashScreen.this,R.anim.bottomup);
        layout1.setAnimation(anim1);
        layout2.setAnimation(anim2);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                ManageSession manageSession=new ManageSession(SplashScreen.this);
                manageSession.checkLogin();
            }
        },3000);

    }
}
