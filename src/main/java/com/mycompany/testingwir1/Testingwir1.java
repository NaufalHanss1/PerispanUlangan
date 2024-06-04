/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.testingwir1;

/**
 *
 * @author oyest
 */




    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Auto Calculator");
            System.out.println("Enter first number: ");
            double num1 = scanner.nextDouble();

            System.out.println("Enter an operator (+, -, *, /): ");
            char operator = scanner.next().charAt(0);

            System.out.println("Enter second number: ");
            double num2 = scanner.nextDouble();

            double result;

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
                        System.out.println("Error: Division by zero is not allowed.");
                        continue;
                    }
                    break;
                default:
                    System.out.println("Error: Invalid operator.");
                    continue;
            }

            System.out.println("Result: " + result);

            System.out.println("Do you want to perform another calculation? (yes/no): ");
            String continueCalculation = scanner.next();

            if (!continueCalculation.equalsIgnoreCase("yes")) {
                break;
            }
        }

        scanner.close();
        System.out.println("Calculator closed.");
    }
    }
}
