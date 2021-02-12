package com.example.DeliveryService.staticdata;

import com.example.DeliveryService.R;
import com.example.DeliveryService.dataStructure.menuData;

import java.util.ArrayList;
import java.util.List;

public class menuList {
    public static final ArrayList menu= new ArrayList(){
        {
            add(new menuData("한식",R.drawable.rice,menuTag.KOREAN_FOOD));
            add(new menuData("양식",R.drawable.rice,menuTag.WESTERN_FOOD));
            add(new menuData("중식",R.drawable.rice,menuTag.CHINESE_FOOD));
        }
    };


}
