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
    
     public static String getStringFromNumber(int number) {
        String units[] =
                {" ", "один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять"};
        String tens[] =
                {" ", "десять", "двадцать", "тридцать", "сорок", "пятьдесят", "шестьдесят",
                        "семьдесят", "восемьдесят", "девяносто"};
        String hundreds[] =
                {" ", "сто", "двести", "триста", "четыреста", "пятьсот", "шестьсот", "семьсот",
                        "восемьсот", "девятьсот"};
        String secondten[] =
                {" ", "одиннадцать", "двенадцать", "тринадцать", "четырнадцать", "пятнадцать",
                        "шестнадцать", "семнадцать", "восемнадцать", "девятнадцать"};

        while (true) {
            if (number < 0 || number > 1000) {
                System.out.println("Число должно быть в диапазоне от 0 до 999");
                continue;
            }
            String text = "";

            switch (number) {
                case 0:
                    text = "ноль";
                    break;
                case 10:
                    text = "десять";
                    break;
                case 100:
                    text = "сто";
                    break;
            }

            if (number < 10) {
                return units[number];
            }
            if (number > 10 && number < 20) {
                return secondten[number];
            }
            if (number > 20 && number < 100) {
                int high = number / 10;
                int low = number % 10;
                text = tens[high];
                if (low != 0)
                    text = text + " " + units[low];
                return text;
            }

            if (number > 100 && number < 1000) {
                int beginning = number / 100;
                int middle = (number / 10) % 10;
                int end = number % 10;
                int decades  = number % 100;

                if (end != 0 && decades >20) {
                    text = hundreds[beginning] + " " + tens[middle] + " " + units[end];}
                 else if (end==0) { text = hundreds[beginning] + " " + tens[middle];}
                 else if  (decades  > 10 && decades < 20) {
                     int i = decades%10;
                     text = hundreds[beginning] + " " + secondten[i];

                }
                return text;
            }
        }
    }
    
    
}
