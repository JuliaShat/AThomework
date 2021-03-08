package com.javacourse.calculator;

public class API {
    public static double mathOperation (double num1, double num2, char operation) {
        double result = 0;
        switch (operation) {
            case '+': result = num1 + num2; break;
            case '-': result = num1 - num2; break;
            case '*': result = num1 * num2; break;
            case '/': result = num1 / num2;

        }
        return result;
    }
}
