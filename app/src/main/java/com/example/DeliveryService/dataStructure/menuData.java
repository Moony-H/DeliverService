package com.example.DeliveryService.dataStructure;

public class menuData {
    private String menuName;
    private int menuImage;
    private int menuTag;

    public menuData(String menuName,int menuImage,int menuTag){
        this.menuName=menuName;
        this.menuImage=menuImage;
        this.menuTag=menuTag;
    }

    public int getMenuImage() {
        return menuImage;
    }

    public String getMenuName() {
        return menuName;
    }

    public int getMenuTag(){return menuTag;}
}
