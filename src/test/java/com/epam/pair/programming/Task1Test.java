package com.epam.pair.programming;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class Task1Test {

    Task1 test;
    @BeforeEach
    void setUp() {
        test = new Task1();
    }

    @ParameterizedTest
    @ValueSource(ints=5040)
    void factorial(int num) {
        assertEquals(test.factorial(7), num);
    }

    @Test
    @Disabled
    void multiplication() throws IOException {
        assertEquals(27, test.multiplication());
    }

    @Test
    void division() {
        assertThrows(ArithmeticException.class, () -> {
            test.division(2, 0);
        });
    }
}