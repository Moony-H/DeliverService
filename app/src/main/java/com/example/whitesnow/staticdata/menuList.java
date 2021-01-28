package com.example.whitesnow.staticdata;

import com.example.whitesnow.R;
import com.example.whitesnow.dataStructure.menuData;
import com.example.whitesnow.dataStructure.pair;

import java.util.ArrayList;
import java.util.List;

public class menuList {
    public static final List<menus> menu= new ArrayList(){
        {
            add(new menus("한식",R.drawable.rice));
            add(new menus("양식",R.drawable.rice));
            add(new menus("중식",R.drawable.rice));
        }
    };

    public static class menus{
        public String menuName;
        public int menuImage;
        public menus(String menuName,int menuImage){
            this.menuName=menuName;
            this.menuImage=menuImage;
        }

    }

}
