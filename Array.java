package com.javacourse.arrays;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {

    }

    public static String getMinAndMaxElements (int [] array) {
        String answer = "";
        int max = array[0];
        int min = array[0];
        for(int i = 0; i < array.length; i ++){
            if(array[i] > max){
                max = array[i];
            }
            if(array[i] < min){
                min = array[i];
            }
            answer = "минимальный элемент массива это " + min + "; " + "максимальный элемент массива это " + max;
        }
        return answer;

    }

    public static String getIndexOfMinAndMax(int [] array) {
        String answer = "";
        int indexOfMax = 0;
        int indexOfMin = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > array[indexOfMax]) {
                indexOfMax = i;
            } else if (array[i] < array[indexOfMin]) {
                indexOfMin = i;
            } answer = "Index of Max: " + indexOfMax + "; " + "Index of Min: " + indexOfMin;
        } return answer;

    }

    public static int getSumOfElementsWithUnevenIndex (int [] someArray){
        int sum = 0;
        for (int i = 1; i < someArray.length; i += 2) {
            sum += someArray [i];
        }
        return sum;
    }

    public static int [] getReversedArray (int [] arr) {
        int [] newArr = new int [arr.length];
        int count = 0;
        for (int i = arr.length-1; i>=0; i-- ) {
            newArr [count++] = arr [i];
        }
        return newArr;
    }

    public static int getQuantityOfUnevenElements(int[] array1) {
        int result = 0;
        for (int element : array1) {
            if (element % 2 != 0) {
                result++;
            }
        }
        return result;
    }

    public static int[] getHalfReversedArray(int[] array1) {
        int middle = 0;
        if(array1.length %2 == 0) {
            middle = array1.length / 2;
        }
        else {
            middle = array1.length / 2 + 1;
        }
        for (int i = 0; i < array1.length / 2; i++) {
                int temp = array1[i];
            array1[i] = array1[middle+i];
                array1[middle+i] = temp;}
        return array1;

    }

    public static int[] getBubbleSorted (int[] array) {
        boolean nextPass = false;
        while(!nextPass) {
            nextPass = true;
            for(int i = 0; i < array.length - 1; i++) {
                if(array[i] > array[i + 1]) {
                    nextPass = false;
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
            }
        }

    } return array;}

    public static int[] getSelectionSorted(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int minIndex = i;
            int min = array[i];
            for (int j = i+1; j < array.length; j++) {
                if (array[minIndex] > array[j]) {
                    minIndex = j;
                    min = array[j];
                }
            }
            array[minIndex] = array[i];
            array[i] = min;
        }
        return array;
    }


    public static int[] getInsertionSorted(int[] array) {
        int j, key, temp = 0;
        for (int i = 1; i < array.length; i++) {
            key = array [i];
            j = i - 1;
            while (j >= 0 &&  key < array[j]) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
        return array;
    }


}
