package es.ieslosmontecillos;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    @DisplayName("Add two numbers")
    void add() {
        assertEquals(4, Calculator.add(2, 2));
    }

    @Test
    @DisplayName("Multiply two numbers")
    void multiply() {
        assertAll(() -> assertEquals(4, Calculator.multiply(2, 2)),
                () -> assertEquals(-4, Calculator.multiply(2, -2)),
                () -> assertEquals(4, Calculator.multiply(-2, -2)),
                () -> assertEquals(0, Calculator.multiply(1, 0)));
    }

    @Test
    @DisplayName("Max value from an array")
    void max(){
        // Estandar
        int[] a = {3, 4, 5};
        // Orden cambiado
        int[] b = {5, 3, 4};
        // Solo un número
        int[] c = {6};
        // Números negativos
        int[] d = {-9, -1, -3};
        // Array vacío
        int[] e = {};
        // Array null
        int[] f = null;

        assertAll(() -> assertEquals(5, Calculator.max(a)),
                () -> assertEquals(5, Calculator.max(b)),
                () -> assertEquals(6, Calculator.max(c)),
                () -> assertEquals(-1, Calculator.max(d)),
                () -> assertThrows(ArrayIndexOutOfBoundsException.class, () -> Calculator.max(e)),
                () -> assertThrows(NullPointerException.class, () -> Calculator.max(f)));
    }
}