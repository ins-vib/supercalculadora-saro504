package org.yourcompany.calculadora;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TestCalculadora {
    @Test
    public void test1() {
        assertEquals(3,Calculadora.nombreDigits(123));
        assertEquals(1,Calculadora.nombreDigits(3143));
        assertEquals(1,Calculadora.nombreDigits(0));
        assertEquals(3,Calculadora.nombreDigits(466547));
    }

    @Test
    public void test2() {

    }

}