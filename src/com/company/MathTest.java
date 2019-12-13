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
    }

    @After
    public void tearDown() throws Exception {
    }
}