package com.javacourse.functions;

public class Functions {



    public static String getDayNameByNumber(int number) {
        if(number < 1 || number > 7) {
            throw new IllegalArgumentException("Day number doesn't exist");
        }
        String day = "";
        switch(number) {
            case 2: day = "Monday"; break;
            case 3: day ="Tuesday"; break;
            case 4:day = "Wednesday"; break;
            case 5:day = "Thursday"; break;
            case 6:day ="Friday"; break;
            case 7:day = "Saturday"; break;
            default:day =  "Sunday";
        } return day;
    }

    public static double getDistanceBetweenTwoPoints(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }
}