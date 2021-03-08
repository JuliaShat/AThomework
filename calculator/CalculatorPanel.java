package com.javacourse.calculator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorPanel extends JPanel {
    private JLabel num1, num2, operation, result;
    private JTextField number1, number2, calculation, answer;
    private JButton button;
    private Calculator calculator;

    public CalculatorPanel (Calculator calculator) {
        constructAll();
        this.calculator = calculator;
    }

    private void constructAll() {
        setLayout(null);
        constructTextFields();
        constructLabels ();
        constructButton();
    }


    private void constructTextFields() {
        number1 = new JTextField();
        number1.setBounds(150, 50, Constants.TEXT_FIELD_WIDTH, Constants.TEXT_FIELD_HEIGHT);
       add(number1);
        number2 = new JTextField();
        number2.setBounds(150, 110, Constants.TEXT_FIELD_WIDTH, Constants.TEXT_FIELD_HEIGHT);
       add(number2);
        calculation = new JTextField();
        calculation.setBounds(150, 170, Constants.TEXT_FIELD_WIDTH, Constants.TEXT_FIELD_HEIGHT);
        add(calculation);
        answer = new JTextField();
        answer.setBounds(150, 290, Constants.TEXT_FIELD_WIDTH, Constants.TEXT_FIELD_HEIGHT);
       add(answer);
    }

    private void constructLabels() {
        num1 = new JLabel("Operand 1");
        num1.setBounds(45, 50, Constants.LABEL_WIDTH, Constants.LABEL_HEIGHT);
        add(num1);
        num2 = new JLabel("Operand 2");
        num2.setBounds(45, 110, Constants.LABEL_WIDTH, Constants.LABEL_HEIGHT);
        add(num2);
        operation = new JLabel("Math operation");
        operation.setBounds(45, 170, Constants.LABEL_WIDTH, Constants.LABEL_HEIGHT);
        add(operation);
        result = new JLabel("Result");
        result.setBounds(45, 290, Constants.LABEL_WIDTH, Constants.LABEL_HEIGHT);
        add(result);
    }

    private void constructButton() {
        button = new JButton("=");
        button.setBounds(45, 230, 295, 40);
        add(button);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent ae){

                calculator.getResult();
            }
        });}

    public String getNumber1() {
        return number1.getText();
    }

    public String getNumber2() {
        return number2.getText();
    }

    public String getCalculation() {
        return calculation.getText();
    }

    public JTextField getAnswer() {
        return answer;
    }



}
