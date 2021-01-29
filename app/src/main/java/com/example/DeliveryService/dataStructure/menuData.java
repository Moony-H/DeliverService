package com.example.DeliveryService.dataStructure;

public class menuData {
    private String menuName;
    private int menuImage;
    private int test;
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
