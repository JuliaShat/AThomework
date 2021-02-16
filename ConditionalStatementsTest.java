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
    public void test_task2_secondQuarter_getQuarterByCoordinates() {
        String actual = ConditionalStatements.getQuarterByCoordinates(-3.4, 5.0);
        String expected = "точка лежит во II четверти";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_task2_thirdQuarter_getQuarterByCoordinates() {
        String actual = ConditionalStatements.getQuarterByCoordinates(-9.1, -4.6);
        String expected = "точка лежит в III четверти";
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void test_task2_fourthQuarter_getQuarterByCoordinates() {
        String actual = ConditionalStatements.getQuarterByCoordinates(10, -7.7);
        String expected = "точка лежит в IV четверти";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_task2_origin_getQuarterByCoordinates() {
        String actual = ConditionalStatements.getQuarterByCoordinates(0, 0);
        String expected = "точка лежит в начале координат";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_task2_positiveAxisX_getQuarterByCoordinates() {
        String actual = ConditionalStatements.getQuarterByCoordinates(8.1, 0);
        String expected = "точка лежит на положительной части оси х";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_task2_negativeAxisX_getQuarterByCoordinates() {
        String actual = ConditionalStatements.getQuarterByCoordinates(-16.2, 0);
        String expected = "точка лежит на отрицательной части оси х";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_task2_positiveAxisY_getQuarterByCoordinates() {
        String actual = ConditionalStatements.getQuarterByCoordinates(0, 4.5);
        String expected = "точка лежит на положительной части оси y";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_task2_negativeAxisY_getQuarterByCoordinates() {
        String actual = ConditionalStatements.getQuarterByCoordinates(0, -6.7);
        String expected = "точка лежит на отрицательной части оси y";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_task3_allPositive_getSumOfOnlyPositiveNumbers() {
        int actual = ConditionalStatements.getSumOfOnlyPositiveNumbers(1, 3, 6);
        int expected = 10;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_task3_oneNegative_getSumOfOnlyPositiveNumbers() {
        int actual = ConditionalStatements.getSumOfOnlyPositiveNumbers(1, -3, 6);
        int expected = 7;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_task3_allZero_getSumOfOnlyPositiveNumbers() {
        int actual = ConditionalStatements.getSumOfOnlyPositiveNumbers(0, 0, 0);
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_task3_allNegative_getSumOfOnlyPositiveNumbers() {
        int actual = ConditionalStatements.getSumOfOnlyPositiveNumbers(-1, -3, -6);
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_task4_returnMultiply_sumOrMultiply() {
        int actual = ConditionalStatements.sumOrMultiply(2, 3, 5);
        int expected = 33;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_task4_returnSum_sumOrMultiply() {
        int actual = ConditionalStatements.sumOrMultiply(1, 1, 2);
        int expected = 7;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_task4_negativeNumbers_sumOrMultiply() {
        int actual = ConditionalStatements.sumOrMultiply(-2, -2, -1);
        int expected = -1;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_task5_F_getMarkByPoints() {
        int actual = ConditionalStatements.getMarkByPoints(1);
        int expected = 'F';
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_task5_E_getMarkByPoints() {
        int actual = ConditionalStatements.getMarkByPoints(39);
        int expected = 'E';
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_task5_D_getMarkByPoints() {
        int actual = ConditionalStatements.getMarkByPoints(50);
        int expected = 'D';
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_task5_C_getMarkByPoints() {
        int actual = ConditionalStatements.getMarkByPoints(74);
        int expected = 'C';
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_task5_B_getMarkByPoints() {
        int actual = ConditionalStatements.getMarkByPoints(89);
        int expected = 'B';
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_task5_A_getMarkByPoints() {
        int actual = ConditionalStatements.getMarkByPoints(95);
        int expected = 'A';
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_task5_throwException1_getMarkByPoints() {
        Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> ConditionalStatements.getMarkByPoints(-1),
                "rate can not be valued");
    }

    @Test
    public void test_task5_throwException2_getMarkByPoints() {
        Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> ConditionalStatements.getMarkByPoints(101),
                "rate can not be valued");
    }

}
