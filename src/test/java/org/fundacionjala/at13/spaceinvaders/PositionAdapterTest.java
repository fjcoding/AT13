package org.fundacionjala.at13.spaceinvaders;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PositionAdapterTest {

    @Test
    public void itShouldAdaptX0Y0Toi9j0() {
        int posX = 0;
        int posY = 0;
        int matrixHeight = 10;

        PositionAdapter adapter = new PositionAdapter();
        PositionElement result = adapter.adaptPosition(posX, posY, matrixHeight);
        assertEquals(result.getIndexi(), 9);
        assertEquals(result.getIndexj(), 0);
    }

    @Test
    public void itShouldAdaptX9Y4Toi0j9() {
        int posX = 9;
        int posY = 4;
        int matrixHeight = 5;

        PositionAdapter adapter = new PositionAdapter();
        PositionElement result = adapter.adaptPosition(posX, posY, matrixHeight);
        assertEquals(result.getIndexi(), 0);
        assertEquals(result.getIndexj(), 9);
    }

    @Test
    public void itShouldAdaptX4Y0Toi4j4() {
        int posX = 4;
        int posY = 0;
        int matrixHeight = 5;

        PositionAdapter adapter = new PositionAdapter();
        PositionElement result = adapter.adaptPosition(posX, posY, matrixHeight);
        assertEquals(result.getIndexi(), 4);
        assertEquals(result.getIndexj(), 4);
    }
}
