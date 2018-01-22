package com.epam.pair.programming;

import com.epam.pair.programming.task2.Range;
import com.epam.pair.programming.task2.RangeImpl;
import jdk.nashorn.internal.ir.annotations.Ignore;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class RangeImplTest {

    private static RangeImpl testRange;
    private static Range otherRange;
    private static List<Long> testValues;

    @BeforeAll
    static void setUp() {
        testRange = new RangeImpl(1, 5);
        otherRange = new RangeImpl(7, 9);
        testValues = Arrays.asList(1L, 2L, 3L, 4L, 5L);
    }

    @BeforeEach
    @DisplayName("Sout method before eache test method")
    void beforeSignal() {
        System.out.println("test method starts.");
    }

    @AfterEach
    @DisplayName("Sout method after eache test method")
    void afterSignal() {
        System.out.println("After test method starts.");
    }

    @Test
    @DisplayName("isBefore mathod in RangeImplTest class starts.")
    void isBefore() {
        assertTrue(testRange.isBefore(otherRange));
        System.out.println("\n");
    }

    @Test
    @DisplayName("isAfter mathod in RangeImplTest class starts.")
    void isAfter() {
        assertFalse(testRange.isAfter(otherRange));
        System.out.println("\n");

    }

    @Test
    @DisplayName("isConcurrent method starts in RangeImplTest class starts.")
    void isConcurrent() {
        assertFalse(testRange.isConcurrent(otherRange));
        System.out.println("\n");

    }

    @Test
    @DisplayName("getLowerBound method in RangeImplTest.")
    void getLowerBound() {
        assertEquals(1, testRange.getLowerBound());
        System.out.println("\n");

    }

    @Test
    @DisplayName("getUpperBound method in RangeImplTest.")
    void getUpperBound() {
        assertEquals(5, testRange.getUpperBound());
        System.out.println("\n");

    }

    @Test
    @DisplayName("contains method in RangeImplTest.")
    void contains() {
        assertTrue(testRange.contains(3));
        System.out.println("\n");

    }

    @Test
    @DisplayName("asList method in RangeImplTest.")
    void asList() {
        assertEquals(testValues, testRange.asList());
        System.out.println("\n");

    }

    @Test
    @Disabled
    @DisplayName("asIterator method in RangeImplTest.")
    void asIterator() {
        assertFalse(testRange.asIterator().hasNext());
        System.out.println("\n");

    }

    @Test
    @DisplayName("asIteratorWithInitList method in RangeImplTest.")
    void asIteratorWithInitList() {
        testRange.asList();
        Iterator<Long> iterator = testRange.asIterator();
        assertTrue(iterator.hasNext());
        while (iterator.hasNext())
            System.out.println(iterator.next());
        System.out.println("\n");

    }
}