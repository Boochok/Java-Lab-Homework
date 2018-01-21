package com.epam.pair.programming;

import org.junit.jupiter.api.*;
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
    @ValueSource(ints = 5040)
    @DisplayName("Factorial method exec in Task1Test")
    void factorial(int num) {
        assertEquals(test.factorial(7), num);
    }

    @Test
    @Disabled
    @DisplayName("Disabled multiplication method exec in Task1Test")
    void multiplication() throws IOException {
        assertEquals(27, test.multiplication());
    }

    @Test
    @DisplayName("Division method exec in Task1Test")
    void division() {
        assertThrows(ArithmeticException.class, () -> {
            test.division(2, 0);
        });
    }
    @AfterEach
    public void tearDown(){
        test = null;
    }
}