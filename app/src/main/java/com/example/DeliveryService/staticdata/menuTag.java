package com.example.DeliveryService.staticdata;

public class menuTag {
    public final static int KOREAN_FOOD=0;
    public final static int WESTERN_FOOD=1;
    public final static int CHINESE_FOOD=2;
    public final static int JAPANESE_FOOD=3;

    public final static int SNACK_FOOD=4;
    public final static int ONE_SERVING=5;
    public final static int FAST_FOOD=6;



    public static String getMenuNameWithTag(int tag){
        switch (tag){
            case 0 :
                return "Korean Food";
            case 1 :
                return "Western Food";
            case 2 :
                return "Chinese Food";
            case 3 :
                return "Japanese Food";
            case 4 :
                return "Snack Food";
            case 5 :
                return "One Serving";
            case 6 :
                return "Fast Food";
            default:
                return "No Tag";

        }
    }

    public static String getMenuNameOfKoreanWithTag(int tag){
        switch (tag){
            case 0 :
                return "한식";
            case 1 :
                return "양식";
            case 2 :
                return "중식";
            case 3 :
                return "일식";
            case 4 :
                return "분식";
            case 5 :
                return "1인분";
            case 6 :
                return "패스트 푸드";
            default:
                return "태그 없음";

        }
    }
}
