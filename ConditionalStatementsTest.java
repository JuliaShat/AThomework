package com.javacourse.conditionals;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class ConditionalStatementsTest {
    @Test
    public void test_evenNumber_getSumOrMultiply() {
        int actual = ConditionalStatements.getSumOrMultiply(12, 3);
        int expected = 36;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_oddNumber_getSumOrMultiply() {
        int actual = ConditionalStatements.getSumOrMultiply(11, 6);
        int expected = 5;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_negativeNumber_getSumOrMultiply() {
        int actual = ConditionalStatements.getSumOrMultiply(-11, 4);
        int expected = -7;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_firstZero_getSumOrMultiply() {
        int actual = ConditionalStatements.getSumOrMultiply(0, 6);
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_firstQuarter_getQuarterByCoordinates() {
        String actual = ConditionalStatements.getQuarterByCoordinates(11.1, 6.6);
        String expected = "точка лежит в I четверти";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_throwException_1_getMarkByRate() {
        Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> ConditionalStatements.getMarkByPoints(-1),
                "rate should be ...");
    }

    @Test
    public void test_throwException_2_getMarkByRate() {
        Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> ConditionalStatements.getMarkByPoints(101),
                "rate should be ...");
    }

}
