package com.javacourse.conditionals;

public class ConditionalStatements {
    public static void main(String[] args) {
    }

    public static int sumOrMultiply1 (int num1, int num2) {
        return (num1 % 2 == 0) ? num1 * num2 : num1 + num2;
    }

    public static String defineQuarterByCoordinates2 (double x, double y) {
        String result = "";
        if (x > 0 && y > 0) {
            result = "точка лежит в I четверти";
        } else if (x < 0 && y > 0) {
            result = "точка лежит во II четверти";
        } else if (x < 0 && y < 0) {
            result = "точка лежит в III четверти";
        } else if (x > 0 && y < 0) {
            result = "точка лежит в IV четверти";
        } else if (x > 0 && y == 0) {
            result = "точка лежит на положительной части оси х";
        } else if (x < 0 && y == 0) {
            result = "точка лежит на отрицательной части оси х";
        } else if (x == 0 && y > 0) {
            result = "точка лежит на положительной части оси y";
        } else if (x == 0 && y < 0) {
            result = "точка лежит на отрицательной части оси y";
        } else {
            result = "origin";
        }
        return result;
    }

    public static int getSumOnlyPositiveNumbers3 (int a, int b, int c) {
        int result = 0;
        if ( a > 0) {
            result += a;
        }
        if (b > 0) {
            result += b;
        }
        if (c > 0) {
            result += c;
        }
        return result;
    }


    public static int sumOrMultiply (int a, int b, int c) {
        int sum = a + b + c;
        int multiply = a * b * c;
        if (sum > multiply) {
            return sum + 3;
        } else {
            return multiply + 3;
        }
    }


        public static char getMarkByPoints ( int points){
            if (points < 0 || points > 100) {
                throw new IllegalArgumentException("rate can not be valued");
            }
            if (points <= 19) {
                return 'F';
            } else if (points <= 39) {
                return 'E';
            } else if (points <= 59) {
                return 'D';
            } else if (points <= 74) {
                return 'C';
            } else if (points <= 89) {
                return 'B';
            }
            return 'A';


        }
    }