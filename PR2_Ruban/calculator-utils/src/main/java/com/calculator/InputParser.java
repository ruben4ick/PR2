package com.calculator;

public class InputParser {
    public static int[] parseInput(String input) {
        try {
            String[] tokens = input.split("\\s+");
            int[] numbers = new int[2];
            numbers[0] = Integer.parseInt(tokens[0]);
            numbers[1] = Integer.parseInt(tokens[1]);
            return numbers;
        } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Error");
            return new int[0];
        }
    }
}