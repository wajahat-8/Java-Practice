package calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdvancedCalculator extends JFrame implements ActionListener {
    private JTextField display;
    private String currentOperator;
    private double result;
    private boolean isNewInput = true;

    public AdvancedCalculator() {
        setTitle("Advanced Calculator");
        setSize(400, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Display Panel
        display = new JTextField("0");
        display.setFont(new Font("Arial", Font.BOLD, 30));
        display.setHorizontalAlignment(JTextField.RIGHT);
        display.setEditable(false);
        add(display, BorderLayout.NORTH);

        // Button Panel
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(5, 4, 5, 5));

        String[] buttons = {
            "7", "8", "9", "/", 
            "4", "5", "6", "*", 
            "1", "2", "3", "-", 
            "0", ".", "=", "+",
            "C", "sqrt", "x²", "%"
        };

        for (String text : buttons) {
            JButton button = new JButton(text);
            button.setFont(new Font("Arial", Font.BOLD, 20));
            button.addActionListener(this);
            buttonPanel.add(button);
        }

        add(buttonPanel, BorderLayout.CENTER);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        try {
            if ("0123456789.".contains(command)) {
                if (isNewInput) {
                    display.setText(command);
                    isNewInput = false;
                } else {
                    display.setText(display.getText() + command);
                }
            } else if ("+-*/".contains(command)) {
                result = Double.parseDouble(display.getText());
                currentOperator = command;
                isNewInput = true;
            } else if (command.equals("=")) {
                double secondOperand = Double.parseDouble(display.getText());
                switch (currentOperator) {
                    case "+" -> result += secondOperand;
                    case "-" -> result -= secondOperand;
                    case "*" -> result *= secondOperand;
                    case "/" -> result /= secondOperand;
                }
                display.setText(String.valueOf(result));
                isNewInput = true;
            } else if (command.equals("C")) {
                display.setText("0");
                result = 0;
                currentOperator = null;
                isNewInput = true;
            } else if (command.equals("sqrt")) {
                result = Math.sqrt(Double.parseDouble(display.getText()));
                display.setText(String.valueOf(result));
                isNewInput = true;
            } else if (command.equals("x²")) {
                result = Math.pow(Double.parseDouble(display.getText()), 2);
                display.setText(String.valueOf(result));
                isNewInput = true;
            } else if (command.equals("%")) {
                result = Double.parseDouble(display.getText()) / 100;
                display.setText(String.valueOf(result));
                isNewInput = true;
            }
        } catch (Exception ex) {
            display.setText("Error");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            AdvancedCalculator calculator = new AdvancedCalculator();
            calculator.setVisible(true);
        });
    }
}
