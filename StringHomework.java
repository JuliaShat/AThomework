package com.javacourse.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
            number = Integer.parseInt(str.strip());
        } catch (NumberFormatException e) {
            throw new NumberFormatException ("Неверный формат строки!");
        } return number;
    }

    public static double stringToRealNumber (String str1) {
        double number1 = 0;
        try {
            number1 = Double.parseDouble(str1.strip());
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
        return shortestword;
    }


    public static String [] changeSymbols(String words[], int assignedSize) {
        for(int i = 0; i < words.length; i++) {
            if(words[i].length() == assignedSize) {
                words[i] = words[i].substring(0, words[i].length() - 3) + "$$$";
            }
        }
        return words;
}

    public static String addSpaceAfterPunctuation(String str){
        for (int i = 0; i < str.length() - 1; i++) {
            char chr = str.charAt(i);
            if (((chr >= 33 && chr <= 47) || (chr >= 58 && chr <= 63) && (str.charAt(i + 1) != ' '))) {
                str = str.replace(Character.toString(chr), (chr + " "));
            }
        }
        return str;
    }

    public static String onlyUniqueSymbols(String s) {
        String result = "";
        for(int i = 0; i < s.length(); i++) {
            if (result.indexOf(s.charAt(i)) == - 1) {
                result += s.charAt(i);
            }
        }
        return result;
    }

    public static int quantityOfWords(String str) {
        String[] words = str.split(" ");
        int quantity = 0;
        for (int i = 0; i < words.length; i++) {
            quantity++;
        }
        return quantity;
    }

    public static String deletePart (String string, int startInd, int SizeToDelete){
        return string.replace(string.substring(startInd, (startInd + SizeToDelete)), "");
    }

    public static String stringReverse (String string){
        StringBuilder str = new StringBuilder(string);
        return str.reverse().toString();
    }

    public static String deleteLastWord (String s) {
       int amount = s.length();
        for (int i = amount - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                amount = i;
                break;
            }
        }
        return s.substring(0, amount);
    }

}
