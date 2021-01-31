package com.javacourse.cycles;

import java.math.BigInteger;

public class Cycles {
    public static void main(String[] args) {
        System.out.println(evenNumbers1());
calculateSquareRoot3(234);
        System.out.println(checkSimpleNumber2( 20));
    }

    public static String evenNumbers1() {
        int quantity=0; int sum=0;
        String result = "";
        for (int i = 2; i<=99; i+=2) {
            sum += i;
            quantity ++;
            result = "Количество всех чётных чисел: " + quantity + "; " + "Сумма всех чётных чисел: " + sum;
            }

        return result;
    }


        public static String checkSimpleNumber2 ( int n) {
            int i= 2;
            String result = "";
            while (i < n)
            {if (n % i != 0) {
                result = n + " is a simple number.";
            }
            result = n + " is not a simple number.";
               i++;
            } return result;
        }


        public static double calculateSquareRoot3 ( int value){
            double squareRoot = 0;
            while (value > 0) {
                squareRoot = (int) Math.sqrt(value);
                System.out.println(squareRoot);
                break;

            }
            return squareRoot;
        }

        public static BigInteger factorial4 ( int number){
            BigInteger fact = BigInteger.ONE;
            for (int i = 1; i <= number; i++) {
                fact = fact.multiply(BigInteger.valueOf(i));
                System.out.println(fact);
            }
            return fact;
        }


        public static int getSumOfDigits5 ( int number){
            int result = 0;
            while (number > 0) {
                result += (number % 10);
                number /= 10;
            }
            return result;
        }

        public static int mirrorNum6 ( int number){
            int mir = 0;
            while (number != 0) {
                mir = mir * 10 + (number % 10);
                number = number / 10;
            }
            return mir;
        }

        private static int mirrorNum ( int num){
            while (num != 1) {
                System.out.print(num % 10);
                num = num / 10;
            }
            return num;
        }


    }
