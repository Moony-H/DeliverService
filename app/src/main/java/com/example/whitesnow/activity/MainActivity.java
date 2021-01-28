package com.example.whitesnow.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import com.example.whitesnow.R;

import static com.example.whitesnow.manager.StaticUtils.intentManager;
import static com.example.whitesnow.manager.StaticUtils.setFullScreenMode;

public class MainActivity extends AppCompatActivity {

    private long BackPressedTime=0;

    @Override
    public void onBackPressed() {
        //super.onBackPressed();
        if(System.currentTimeMillis()>BackPressedTime+1000)
        {
            BackPressedTime=System.currentTimeMillis();
            Toast toast=Toast.makeText(this,"뒤로가기 버튼을 한번 더 누르시면 종료됩니다.",Toast.LENGTH_SHORT);
            toast.show();
        }
        else
        {
            ActivityCompat.finishAffinity(this);
            System.exit(0);
        }


    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 풀 스크린 모드
        setFullScreenMode(this);

        //로딩 화면
        intentManager(getBaseContext(),IntroActivity.class);



    }
}
