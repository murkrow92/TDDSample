package com.company;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MathTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void isPrimaryNumber() {
        boolean result = Math.isPrimaryNumber(0);
        assertFalse(result);

        boolean result2 = Math.isPrimaryNumber(1);
        assertFalse(result2);

        boolean result3 = Math.isPrimaryNumber(2);
        assertTrue(result3);

        boolean result4 = Math.isPrimaryNumber(3);
        assertTrue(result4);

        boolean result5 = Math.isPrimaryNumber(4);
        assertFalse(result5);

        boolean result6 = Math.isPrimaryNumber(5);
        assertTrue(result6);

        boolean result7 = Math.isPrimaryNumber(6);
        assertFalse(result7);

        boolean result8 = Math.isPrimaryNumber(7);
        assertTrue(result8);

        boolean result9 = Math.isPrimaryNumber(27);
        assertFalse(result9);
    }

    @Test
    public void testExponent() {
        int result = Math.exp(0);
        assertEquals(1, result);

        result = Math.exp(1);
        assertEquals(1, result);

        result = Math.exp(2);
        assertEquals(2, result);

        result = Math.exp(3);
        assertEquals(6, result);

        result = Math.exp(9);
        assertEquals(362880, result);
    }

    @Test
    public void testTemperature() {
        boolean result = Math.changeTemperature(16);
        assertTrue(result);

        result = Math.changeTemperature(17);
        assertTrue(result);

        result = Math.changeTemperature(15);
        assertFalse(result);

        result = Math.changeTemperature(32);
        assertTrue(result);

        result = Math.changeTemperature(33);
        assertFalse(result);
    }

    @Test
    public void testLogin() {
        boolean result = Math.login("Ducdt@123", "123456");
        assertTrue(result);

        result = Math.login("  ", "123456");
        assertFalse(result);

        result = Math.login("  ", " ");
        assertFalse(result);

        result = Math.login("ducdt", "");
        assertFalse(result);

        result = Math.login("ducd@t", "123456");
        assertFalse(result);
    }

    @After
    public void tearDown() throws Exception {
    }
}