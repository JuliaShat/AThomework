package com.javacourse.arrays;

import com.javacourse.cycles.Cycles;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArraysTests {

    @Test
    public void test_task1and2_allPos_getMinAndMaxElements() {
        int[] array = new int[]{1, 0, 67, 8, 11};
        String actual = Array.getMinAndMaxElements( array);
        String expected = "минимальный элемент массива это 0; максимальный элемент массива это 67";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_task1and2_neg_getMinAndMaxElements() {
        int[] array = new int[]{1, -50, 901, 8};
        String actual = Array.getMinAndMaxElements( array);
        String expected = "минимальный элемент массива это -50; максимальный элемент массива это 901";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_task3and4_allPos_getIndexOfMinAndMax() {
        int[] array = new int[]{1, 0, 67, 8, 11};
        String actual = Array.getIndexOfMinAndMax( array);
        String expected = "Index of Max: 2; Index of Min: 1";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_task3and4_negPos_getIndexOfMinAndMax() {
        int[] array = new int[]{-3, 8, 5, 35, 11};
        String actual = Array.getIndexOfMinAndMax( array);
        String expected = "Index of Max: 3; Index of Min: 0";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_task5_allPos_getSumOfElementsWithUnevenIndex() {
        int[] array = new int[]{1, 0, 67, 8, 11, 3};
        int actual = Array.getSumOfElementsWithUnevenIndex( array);
        int expected = 11;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_task5_neg_getSumOfElementsWithUnevenIndex() {
        int[] array = new int[]{1, -3, 67, -8, 11, 3};
        int actual = Array.getSumOfElementsWithUnevenIndex( array);
        int expected = -8;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_task6_evenAmount_getReversedArray() {
        int[] array = new int[] {1, 2, 3, 4};
        int [] actual = Array.getReversedArray(array);
        int [] expected = {4, 3, 2, 1};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test_task6_oddAmount_getReversedArray() {
        int[] array = new int[] {1, 2, 6, 3, 4};
        int [] actual = Array.getReversedArray(array);
        int [] expected = {4, 3, 6, 2, 1};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test_task7_getQuantityOfUnevenElements() {
        int[] array = new int[]{1, 0, 67, 8, 11, 3, 5, 10};
        int actual = Array.getQuantityOfUnevenElements(array);
        int expected = 5;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_task8_evenAmount_getHalfReversedArray() {
        int[] array = new int[] {1, 2, 3, 4};
        int [] actual = Array.getHalfReversedArray(array);
        int [] expected = {3, 4, 1, 2};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test_task8_oddAmount_getHalfReversedArray() {
        int[] array = new int[] {1, 2, 6, 3, 4};
        int [] actual = Array.getHalfReversedArray(array);
        int [] expected = {3, 4, 6, 1, 2};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test_task9_getBubbleSorted() {
        int[] array = new int[] {1, 3, 6, 2, 4};
        int [] actual = Array.getBubbleSorted(array);
        int [] expected = {1, 2, 3, 4, 6};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test_task9_getSelectionSorted() {
        int[] array = new int[] {7, -1, 8, 6, 1, 4};
        int [] actual = Array.getSelectionSorted(array);
        int [] expected = {-1, 1, 4, 6, 7, 8};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test_task9_getInsertionSorted() {
        int[] array = new int[] {5, -1, 8, 6, 1, 0};
        int [] actual = Array.getInsertionSorted(array);
        int [] expected = {-1, 0, 1, 5, 6, 8};
        Assertions.assertArrayEquals(expected, actual);
    }
}
