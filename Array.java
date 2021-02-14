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
            if (element % 2 == 1) {
                result++;
            }
        }
        return result;
    }

    public static int[] getHalfReversedArray(int[] array1) {
        int[] newArray = new int[array1.length];
        int middle = array1.length / 2;
        for (int i = 0; i < array1.length / 2; i++, middle++) {
            newArray[i] = array1[middle];

            for (int n = middle; n <= array1.length - 1; n++) {
                newArray[n] = array1[i];
            } }
        return newArray;

    }
    
     public static int[] getBubbleSorted (int[] array) {
        boolean nextPass = true;
        while(nextPass) {
            nextPass = false;
            for(int i = 1; i < array.length; i++) {
                if(array[i] < array[i - 1]) {
                    int temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                }
            }
        }
        return array;
    }

    public static int[] getSelectionSorted(int[] array) {
        int minIndex, minValue, temp=0;
        for (int i = 0; i < array.length; i++) {
            minIndex = i;
            minValue = array [i];
            for (int j = i; j < array.length; j++) {
                if (array[j] < minValue) {
                    minIndex = j;
                    minValue = array[j];
                }
                else if (minValue< array[j])
                    temp = array [i];
                array [i] = array [minIndex];
                array[minIndex] = temp;
            } }
        return array;
    }


    public static int[] getInsertionSorted(int[] array) {
        int j, key, temp = 0;
        for (int i = 1; i < array.length; i++) {
            key = array [i];
            j = i - 1;
            while (j >= 0 &&  key < array[j]) {
                temp = array [j];
                array[j + 1] = array[j];
                array[j + 1] = temp;
                j--;
            }

        }
        return array;
    }

}
