package com.example.DeliveryService.activity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import com.example.DeliveryService.R;


import static com.example.DeliveryService.manager.StaticUtils.setFullScreenMode;

public class IntroActivity extends AppCompatActivity {
    @Override
    public void onBackPressed() {
        //super.onBackPressed();
        ActivityCompat.finishAffinity(this);
        System.exit(0);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);



        //풀 스크린 모드 활성화
        setFullScreenMode(this);

        //애니메이션 활성화
        View view=findViewById(R.id.loading_circle);
        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.loading_animation);
        view.startAnimation(animation);

        //3초후 넘어감.
        Handler mHandler = new Handler();
        mHandler.postDelayed(this::finish, 3000);
    }
}
