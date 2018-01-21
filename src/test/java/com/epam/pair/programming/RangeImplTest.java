package com.epam.pair.programming;

import com.epam.pair.programming.task2.Range;
import com.epam.pair.programming.task2.RangeImpl;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class RangeImplTest {

    Range testRange;
    Range otherRange;
    List<Long> testValues;

    @BeforeAll
    void setUp() {
        testRange = new RangeImpl(1, 5);
        otherRange = new RangeImpl(7, 9);
        testValues = Arrays.asList(1L,2L,3L,4L,5L);
    }

    @Test
    void isBefore() {
        assertTrue(testRange.isBefore(otherRange));
    }

    @Test
    void isAfter() {
        assertFalse(testRange.isAfter(otherRange));
    }

    @Test
    void isConcurrent() {
        assertFalse(testRange.isConcurrent(otherRange));
    }

    @Test
    void getLowerBound() {
        assertEquals(1, testRange.getLowerBound());
    }

    @Test
    void getUpperBound() {
        assertEquals(5, testRange.getUpperBound());
    }

    @Test
    void contains() {
        assertTrue(testRange.contains(3));
    }

    @Test
    void asList() {
        assertEquals(testValues, testRange.asList());
    }

    @Test
    void asIterator() {
        assertFalse(testRange.asIterator().hasNext());
    }

    @Test
    void asIteratorWithInitList() {
        testRange.asList();
        Iterator<Long> iterator = testRange.asIterator();
        assertTrue(iterator.hasNext());
        while (iterator.hasNext())
            System.out.println(iterator.next());
    }

}