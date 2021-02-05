package org.fundacionjala.at13.spaceinvaders;   
import static org.junit.Assert.*;
import org.junit.Test;

public class AlienGroupTest {
    @Test
    public void shouldFillArrayWithAliens() {
        /**
         * GroupLeftLimit = 5
         * GroupRightLimit = 9
         * Group left limit = 2
         * Group top limit = 0
         * size of the group = 3 rows from 0 to 2
         *                      5 columns from 5 to 9
         * 3*5 = 15 Aliens
         */
        int numberOfAliensExpected = 30;
        AlienGroup alienGroup = new AlienGroup();
        alienGroup.addAliens();
        assertEquals(numberOfAliensExpected, alienGroup.getAliens().size());
    }
}