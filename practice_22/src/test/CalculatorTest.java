package test;


import main.my_package.Calculater;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    @Test
    void testSimplePlus() {
        Assertions.assertEquals(5.0, Calculater.start("2 3 +"), 1e-9);
    }

    @Test
    void testTwoCalculate() {
        assertEquals(26, Calculater.start("2 3 * 4 5 * +"), 1e-9);
    }

    @Test
    void testFourCalculate() {
        assertEquals(-0.06451612903226, Calculater.start("2 3 4 5 6 * + - /"), 1e-9);
    }

    @Test
    void testException() {
        ArithmeticException ex = assertThrows(
                ArithmeticException.class,
                () -> Calculater.start("")
        );
        assertTrue(ex.getMessage().contains("Пустое выражение"));
    }

    @Test
    void testExceptionNotFoundSymbol() {
        ArithmeticException ex = assertThrows(
                ArithmeticException.class,
                () -> Calculater.start("2 3 $")
        );
        assertTrue(ex.getMessage().contains("Нет такого числа/символа"));
    }
}
