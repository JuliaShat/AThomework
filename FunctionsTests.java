package com.javacourse.functions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FunctionsTests {
    @Test
    public void task1_1_getDayNameByNumber() {
        String actual = Functions.getDayNameByNumber(1);
        String expected = "Sunday";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void task1_2_getDayNameByNumber() {
        String actual = Functions.getDayNameByNumber(2);
        String expected = "Monday";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void task1_3_getDayNameByNumber() {
        String actual = Functions.getDayNameByNumber(3);
        String expected = "Tuesday";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void task1_4_getDayNameByNumber() {
        String actual = Functions.getDayNameByNumber(4);
        String expected = "Wednesday";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void task1_5_getDayNameByNumber() {
        String actual = Functions.getDayNameByNumber(5);
        String expected = "Thursday";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void task1_6_getDayNameByNumber() {
        String actual = Functions.getDayNameByNumber(6);
        String expected = "Friday";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void task1_7_getDayNameByNumber() {
        String actual = Functions.getDayNameByNumber(7);
        String expected = "Saturday";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void task1_0day_getDayNameByNumber() {
        Assertions.assertThrows(IllegalArgumentException.class,
                ()->Functions.getDayNameByNumber(0),
                "Day number doesn't exist");
    }

    @Test
    public void task1_8day_getDayNameByNumber() {
        Assertions.assertThrows(IllegalArgumentException.class,
                ()->Functions.getDayNameByNumber(8),
                "Day number doesn't exist");
    }

    @Test
    public void task2_positive_getDistanceBetweenTwoPoints() {
        double actual = Functions.getDistanceBetweenTwoPoints(6, 1, 1, 7);
        double expected = 7.810249675906654;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void task2_negative_getDistanceBetweenTwoPoints() {
        double actual = Functions.getDistanceBetweenTwoPoints(-1, -3, -2, -1);
        double expected = 2.23606797749979;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void task3_6_getStringFromNumber() {
        String actual = Functions.getStringFromNumber(6);
        String expected = "шесть";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void task3_15_getStringFromNumber() {
        String actual = Functions.getStringFromNumber(15);
        String expected = "пятнадцать";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void task3_71_getStringFromNumber() {
        String actual = Functions.getStringFromNumber(71);
        String expected = "семьдесят один";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void task3_369_getStringFromNumber() {
        String actual = Functions.getStringFromNumber(769);
        String expected = "семьсот шестьдесят девять";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void task3_1000_getStringFromNumber() {
        String actual = Functions.getStringFromNumber(1000);
        String expected = "Число должно быть в диапазоне от 0 до 999";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void task4_0_getNumberFromString() {
        int actual = Functions.getNumberFromString("ноль");
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void task4_7_getNumberFromString() {
       int actual = Functions.getNumberFromString("семь");
        int expected = 7 ;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void task4_14_getNumberFromString() {
        int actual = Functions.getNumberFromString("четырнадцать");
        int expected = 14 ;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void task4_56_getNumberFromString() {
        int actual = Functions.getNumberFromString("пятьдесят шесть");
        int expected = 56 ;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void task4_987_getNumberFromString() {
        int actual = Functions.getNumberFromString("девятьсот восемьдесят семь");
        int expected = 987 ;
        Assertions.assertEquals(expected, actual);
    }
}
