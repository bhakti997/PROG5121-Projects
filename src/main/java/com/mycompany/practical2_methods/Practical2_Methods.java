package com.mycompany.practical2_methods;

import javax.swing.JOptionPane;

/**
 * ICE Task 2 - Working with Methods in Java
 * @author Bhakti
 */
public class Practical2_Methods {

    // Method that accepts two integers and returns their sum
    public static int calculateSum(int number1, int number2) {
        return number1 + number2;
    }

    // Method that accepts two integers and returns their average
    // Returns a double so decimals are kept (e.g. 15.5)
    public static double calculateAverage(int number1, int number2) {
        return (number1 + number2) / 2.0;
    }

    public static void main(String[] args) {

        // Prompt the user and store the values entered
        String input1 = JOptionPane.showInputDialog(null, "Enter the first number");
        String input2 = JOptionPane.showInputDialog(null, "Enter the second number");

        // Convert the String input into integers
        int firstNum = Integer.parseInt(input1);
        int secondNum = Integer.parseInt(input2);

        // Call calculateSum and display the result
        int sum = calculateSum(firstNum, secondNum);
        JOptionPane.showMessageDialog(null, "The sum is: " + sum);

        // Call calculateAverage and display the result
        double average = calculateAverage(firstNum, secondNum);
        JOptionPane.showMessageDialog(null, "The average is: " + average);
    }
}