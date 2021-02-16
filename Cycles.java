package com.javacourse.cycles;

import java.math.BigInteger;

public class Cycles {
    public static void main(String[] args) {

    }

    public static String evenNumbers() {
        int quantity = 0;
        int sum = 0;
        String result = "";
        for (int i = 2; i <= 99; i += 2) {
            sum += i;
            quantity++;
            result = "Количество всех чётных чисел: " + quantity + "; " + "Сумма всех чётных чисел: " + sum;
        }

        return result;
    }


    public static String checkSimpleNumber(int n) {
        String result = "";
        if (n <= 1) {
            result = n + " is not a simple number";
        }
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                result = n + " is not a simple number";
            } else {
                result = n + " is a simple number.";
            }

        }
        return result;
    }


    public static int getSqrtStepByStep(int num) {
            int result = 0;
        if (num < 0) {
            throw new IllegalArgumentException("Число должно быть положительным");}
            for (int i = 1; i <= num / 2; i++) {
                if (i * i <= num && (i + 1) * (i + 1) > num) {
                    result =  i;
                    break;
                }
            }
            return result;
        }


        public static int getSqrtBinary ( int num) {
            if (num < 0) {
                throw new IllegalArgumentException("Число должно быть положительным");
            }
            if (num == 0 || num == 1) {
                return num;
            }
            int start = 1, end = num / 2;
            int result=num;
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (mid == num / mid) {
                    result = mid;
                    break;
                }
                if (mid < num / mid) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
                result = start - 1;

            }return result;
        }


        public static long getFactorial ( int number){
            if(number < 0) {
                throw new IllegalArgumentException("Факториал вычисляется только у положительных чисел!");
            }
        if(number == 0) {
                return 1;
            }

            long fact = 1 ;
        for (int i = 1; i <= number; i++) {
                fact *= i;
            }
            return fact;
        }


        public static int getSumOfDigits ( int number){
            int result = 0;
            number = Math.abs(number);
            while (number > 0) {
                result += (number % 10);
                number /= 10;
            }
            return result;
        }

        public static int getMirroredNum ( int number){
            int mir = 0;
            while (number != 0) {
                mir = mir * 10 + (number % 10);
                number = number / 10;
            }
            return mir;
        }



    }
