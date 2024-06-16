#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.add(2, 3));
        assertEquals(-1, calculator.add(-2, 1));
        assertEquals(0, calculator.add(0, 0));
    }

    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        assertEquals(1, calculator.subtract(3, 2));
        assertEquals(-3, calculator.subtract(-2, 1));
        assertEquals(0, calculator.subtract(0, 0));
    }

    @Test
    public void testMultiply() {
        Calculator calculator = new Calculator();
        assertEquals(6, calculator.multiply(2, 3));
        assertEquals(-2, calculator.multiply(-1, 2));
        assertEquals(0, calculator.multiply(0, 3));
    }

    @Test
    public void testDivide() {
        Calculator calculator = new Calculator();
        assertEquals(2.0, calculator.divide(6, 3), 0.001);
        assertEquals(-2.5, calculator.divide(-5, 2), 0.001);

        // Test for division by zero
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calculator.divide(1, 0);
        });
        assertEquals("Division by zero is not allowed.", exception.getMessage());
    }
}