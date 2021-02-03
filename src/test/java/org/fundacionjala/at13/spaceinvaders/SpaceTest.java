package org.fundacionjala.at13.spaceinvaders;

import static org.junit.Assert.*;
import static org.fundacionjala.at13.spaceinvaders.Space.EMPTY;

import org.junit.Test;

public class SpaceTest {

    @Test
    public void itShouldShowEmptySpace() {
        int height = 5;
        int width = 10;
        Space space = new Space(height, width);
        String[][] spacePrint = space.show();
        String[][] expected = {
            {EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY},
            {EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY},
            {EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY},
            {EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY},
            {EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY}
        };
        assertArrayEquals(expected, spacePrint);
    }
}
