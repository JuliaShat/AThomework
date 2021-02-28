package com.javacourse.strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringHomework {

    public static void lowerCaseAlphabet () {
        for (char i = 'a'; i <= 'z'; i++) {
            System.out.print(i + " ");
        }
    }
    public static void upperCaseAlphabet () {
        for (char i = 'A'; i <= 'Z'; i++) {
            System.out.print(i + " ");
        }
    }

    public static void russianAlphabet () {
        for (char i = 'а'; i <= 'я'; i++) {
            System.out.print(i + " ");
        }
    }

    public static void decimalDigits () {
        for (char i = '0'; i <= '9'; i++) {
            System.out.print(i + " ");
        }
    }

    public static void areaFromASCII () {
        for (char i = 32; i <= 126; i++) {
            System.out.print(i + " ");
        }
    }

    public static String intToString (int a) {
        return Integer.toString(a);
    }

    public static String doubleToString (double d) {
        return String.valueOf(d);
    }

    public static int stringToNumber (String str) {
        int number = 0;
        try {
            number = Integer.parseInt(str.trim());
        } catch (NumberFormatException e) {
            throw new NumberFormatException ("Неверный формат строки!");
        } return number;
    }

    public static double stringToRealNumber (String str1) {
        double number1 = 0;
        try {
            number1 = Double.parseDouble(str1.trim());
        } catch (NumberFormatException e) {
            System.err.println("Неверный формат строки!");
        } return number1;
    }

    public static int getLengthOfShortestWord (String sentence) {
        int shortestword = 0;
        String[] words = sentence.replaceAll("\\p{Punct}", "").trim().split("\\s+");
        for(int i = 0; i < words.length - 1; i++) {
            if (words[i+1].length() > words[i].length()){
                shortestword = words[i].length();
            }
        }
        return shortestword; //
    }




}
