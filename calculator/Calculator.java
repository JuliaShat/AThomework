package com.javacourse.calculator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {
    private CalculatorPanel calculatorPanel;

    public Calculator() {
        calculatorPanel = new CalculatorPanel(this);
       new CalculatorFrame(calculatorPanel);
    }


    void getResult() {
        double num1 = 0, num2 = 0;
        char mathOperation = ' ';
        try {
            num1 = Double.parseDouble(calculatorPanel.getNumber1());
            num2 = Double.parseDouble(calculatorPanel.getNumber2());
            mathOperation = calculatorPanel.getCalculation().charAt(0);
        } catch (NullPointerException e) {
            calculatorPanel.getAnswer().setText("Enter number 1 and number 2");
            throw new NullPointerException();
        } catch (NumberFormatException e) {
            calculatorPanel.getAnswer().setText("Incorrect data");
            throw new NumberFormatException();
        }

        double result;
        if (mathOperation == ' ') {
            calculatorPanel.getAnswer().setText("Enter symbols to chose math operation: *, /, +, -");
        } else if (mathOperation == '/' && num2 == 0) {
            calculatorPanel.getAnswer().setText("Can not be divided by 0!");
        } else {
            result = API.mathOperation (num1, num2, mathOperation);
            String string = String.valueOf(result);
            calculatorPanel.getAnswer().setText(string);
        }
    }

}



