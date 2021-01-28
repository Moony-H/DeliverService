package com.example.whitesnow.manager;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.WindowManager;

import com.example.whitesnow.dataStructure.pair;

import java.util.List;

public class StaticUtils {

    public static void intentManager(Context now, Class next){
        Intent intent= new Intent(now,next);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        now.startActivity(intent);
    }

    public static void intentManager(Context now, Class next, List<pair<String,String>> putEx){
        Intent intent= new Intent(now,next);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        for(int i=0; i<putEx.size();i++){
            intent.putExtra(putEx.get(i).First(),putEx.get(i).Second());

        }
        now.startActivity(intent);
    }
    public static void setFullScreenMode(Activity activity){
        activity.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

    }
}
