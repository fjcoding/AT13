package org.fundacionjala.at13.sandbox;

import static org.junit.Assert.*;
import org.junit.Test;

public class ExampleTest {

    @Test
    public void itShouldSumOneAndTwo() {
        Example example = new Example();
        int result = example.sum(1, 2);
        assertEquals(3, result);
    }

    @Test
    public void itShouldSumSixAndSeven() {
        Example example = new Example();
        int result = example.sum(6, 7);
        assertEquals(13, result);
    }
}