package com.javacourse.cycles;

import com.javacourse.conditionals.ConditionalStatements;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;

public class CyclesTests {

    @Test
    public void test_task1_evenNumbers() {
        String actual = Cycles.evenNumbers();
        String expected = "Количество всех чётных чисел: 49; Сумма всех чётных чисел: 2450";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_task2_simple_checkSimpleNumber() {
        String actual = Cycles.checkSimpleNumber(47);
        String expected = "47 is a simple number.";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_task2_notSimple_checkSimpleNumber() {
        String actual = Cycles.checkSimpleNumber(60);
        String expected = "60 is not a simple number";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_task2_negative_checkSimpleNumber() {
        String actual = Cycles.checkSimpleNumber(-2);
        String expected = "-2 is not a simple number";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_task3_posIntSqrt_getSqrtStepByStep() {
        int actual = Cycles.getSqrtStepByStep(225);
        int expected = 15;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_task3_posFractionalSqrt_getSqrtStepByStep() {
        int actual = Cycles.getSqrtStepByStep(65);
        int expected = 8;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_task3_negative_getSqrtStepByStep() {
        Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> Cycles.getSqrtStepByStep(-225),
                "Число должно быть положительным");
    }

    @Test
    public void test_task3_posIntSqrt_getSqrtBinary() {
        int actual = Cycles.getSqrtBinary(625);
        int expected = 25;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_task3_posFractionalSqrt_getSqrtBinary() {
        int actual = Cycles.getSqrtBinary(667);
        int expected = 25;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_task3_negative_getSqrtBinary() {
        Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> Cycles.getSqrtBinary(-25),
                "Число должно быть положительным");
    }

    @Test
    public void test_task3_1_getSqrtBinary() {
        int actual = Cycles.getSqrtBinary(1);
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void test_task4_19_getFactorial () {
        long actual = Cycles.getFactorial (19);
        long expected = 121645100408832000L;
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void test_task4_0_getFactorial () {
        long actual = Cycles.getFactorial (0);
        long expected = 1;
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void test_task4_negative_getFactorial () {
        Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> Cycles.getFactorial(-25),
                "Факториал вычисляется только у положительных чисел!");
    }

    @Test
    public void test_task5_4digits_getSumOfDigits () {
        int actual = Cycles.getSumOfDigits (6543);
        int expected = 18;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_task5_negative_getSumOfDigits () {
        int actual = Cycles.getSumOfDigits (-12345);
        int expected = 15;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_task6_pos_getMirroredNum () {
        int actual = Cycles.getMirroredNum (12345);
        int expected = 54321;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_task6_neg_getMirroredNum () {
        int actual = Cycles.getMirroredNum (-987);
        int expected = -789;
        Assertions.assertEquals(expected, actual);
    }
}

