package com.example.whitesnow.dataStructure;

import com.example.whitesnow.R;

public class menuData {
    private String menuName;
    private int menuImage;

    public menuData(String menuName,int menuImage){
        this.menuName=menuName;
        this.menuImage=menuImage;
    }

    public int getMenuImage() {
        return menuImage;
    }

    public String getMenuName() {
        return menuName;
    }
}