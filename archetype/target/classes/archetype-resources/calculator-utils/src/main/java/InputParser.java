#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

public class InputParser {
    public static int[] parseInput(String input) {
        try {
            String[] tokens = input.split("${symbol_escape}${symbol_escape}s+");
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