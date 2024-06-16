package com.calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Виберіть операцію: add, subtract, multiply, divide, sqrt, factorial або 'exit' для виходу:");
            String operation = scanner.nextLine().trim();

            if (operation.equals("exit")) {
                System.out.println("Вихід...");
                break;
            }

            if (operation.equals("sqrt")) {
                System.out.println("Введіть число для обчислення квадратного кореня:");
                int number = Integer.parseInt(scanner.nextLine().trim());
                try {
                    System.out.println("Квадратний корінь: " + calculator.sqrt(number));
                } catch (IllegalArgumentException e) {
                    System.out.println("Помилка: " + e.getMessage());
                }
                continue;
            }

            if (operation.equals("factorial")) {
                System.out.println("Введіть число для обчислення факторіалу:");
                int number = Integer.parseInt(scanner.nextLine().trim());
                try {
                    System.out.println("Факторіал: " + calculator.factorial(number));
                } catch (IllegalArgumentException e) {
                    System.out.println("Помилка: " + e.getMessage());
                }
                continue;
            }

            System.out.println("Введіть два числа (через пробіл):");
            String input = scanner.nextLine().trim();
            int[] numbers = InputParser.parseInput(input);

            if (numbers.length != 2) {
                System.out.println("Помилка введення. Введіть два числа.");
                continue;
            }

            int a = numbers[0];
            int b = numbers[1];

            try {
                switch (operation) {
                    case "add":
                        System.out.println("Результат: " + calculator.add(a, b));
                        break;
                    case "subtract":
                        System.out.println("Результат: " + calculator.subtract(a, b));
                        break;
                    case "multiply":
                        System.out.println("Результат: " + calculator.multiply(a, b));
                        break;
                    case "divide":
                        System.out.println("Результат: " + calculator.divide(a, b));
                        break;
                    default:
                        System.out.println("Невідома операція.");
                        break;
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Помилка: " + e.getMessage());
            }
        }

        scanner.close();
    }
}
