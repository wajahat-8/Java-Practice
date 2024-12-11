package calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdvancedCalculator extends JFrame implements ActionListener {
    // Components of the calculator
    private JTextField display;
    private double num1 = 0, num2 = 0, result = 0;
    private char operator;

    public AdvancedCalculator() {
        // Set up the frame
        setTitle("Advanced Calculator");
        setSize(400, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Display field
        display = new JTextField();
        display.setFont(new Font("Arial", Font.BOLD, 24));
        display.setHorizontalAlignment(JTextField.RIGHT);
        display.setEditable(false);
        add(display, BorderLayout.NORTH);

        // Button panel
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(5, 4, 10, 10));

        // Buttons
        String[] buttons = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", ".", "=", "+",
            "C", "√", "^", "%"
        };

        for (String text : buttons) {
            JButton button = new JButton(text);
            button.setFont(new Font("Arial", Font.BOLD, 20));
            button.addActionListener(this);
            buttonPanel.add(button);
        }

        add(buttonPanel, BorderLayout.CENTER);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        try {
            switch (command) {
                case "C":
                    display.setText("");
                    num1 = num2 = result = 0;
                    operator = '\0';
                    break;
                case "=":
                    num2 = Double.parseDouble(display.getText());
                    calculate();
                    display.setText(String.valueOf(result));
                    operator = '\0';
                    break;
                case "√":
                    num1 = Double.parseDouble(display.getText());
                    result = Math.sqrt(num1);
                    display.setText(String.valueOf(result));
                    break;
                case "^":
                    num1 = Double.parseDouble(display.getText());
                    display.setText("");
                    operator = '^';
                    break;
                case "%":
                    num1 = Double.parseDouble(display.getText());
                    result = num1 / 100;
                    display.setText(String.valueOf(result));
                    break;
                case "+":
                case "-":
                case "*":
                case "/":
                    num1 = Double.parseDouble(display.getText());
                    operator = command.charAt(0);
                    display.setText("");
                    break;
                default:
                    // Append numbers or decimal point
                    display.setText(display.getText() + command);
            }
        } catch (Exception ex) {
            display.setText("Error");
        }
    }

    private void calculate() {
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    display.setText("Error");
                }
                break;
            case '^':
                result = Math.pow(num1, num2);
                break;
        }
    }

    public static void main(String[] args) {
        new AdvancedCalculator();
    }
}
