package com.javacourse.calculator;

import javax.swing.*;

public class CalculatorFrame extends JFrame {

    public CalculatorFrame(JPanel panel) {
        constructFrame(panel);
    }


    private void constructFrame(JPanel panel) {
       setSize(400, 500);
       setVisible(true);
       add(panel);
       setTitle("CALCULATOR");
       setResizable(false);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
