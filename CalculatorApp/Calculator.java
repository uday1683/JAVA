package CalculatorApp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class Calculator extends JFrame implements ActionListener {
    JTextField display;
    double num1 = 0, num2 = 0;
    String operator = "";

    public Calculator() {
        // Set up the window
        setTitle("Calculator");
        setSize(250, 350);
        setLayout(new BorderLayout());

        // Display area
        display = new JTextField();
        add(display, BorderLayout.NORTH);

        // Buttons panel
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4));

        // Buttons for calculator
        String[] buttons = {
            "7", "8", "9", "+",
            "4", "5", "6", "-",
            "1", "2", "3", "*",
            "0", "C", "=", "/"
        };

        for (String text : buttons) {
            JButton btn = new JButton(text);
            btn.addActionListener(this);
            panel.add(btn);
        }

        add(panel, BorderLayout.CENTER);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String input = e.getActionCommand();

        if (input.matches("[0-9]")) {
            display.setText(display.getText() + input);
        } else if (input.matches("[+\\-*/]")) {
            num1 = Double.parseDouble(display.getText());
            operator = input;
            display.setText("");
        } else if (input.equals("=")) {
            num2 = Double.parseDouble(display.getText());
            double result = 0;
            switch (operator) {
                case "+": result = num1 + num2; break;
                case "-": result = num1 - num2; break;
                case "*": result = num1 * num2; break;
                case "/": result = (num2 != 0) ? num1 / num2 : 0; break;
            }
            display.setText(String.valueOf(result));
        } else if (input.equals("C")) {
            display.setText("");
            num1 = 0;
            num2 = 0;
            operator = "";
        }
    }

    public static void main(String[] args) {
        new Calculator();
    }
}
