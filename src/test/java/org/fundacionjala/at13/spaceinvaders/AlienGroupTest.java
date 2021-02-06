package org.fundacionjala.at13.spaceinvaders;   
import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.Test;

public class AlienGroupTest {
    @Test
    public void shouldFillArrayWithAliens() {
        int numberOfRowsForAliens = 3;
        int numberOfColumnsForAliens = 5;
        // 3 * 5 = 15 aliens
        int numberOfAliensExpected = 15;
        AlienGroup alienGroup = new AlienGroup(numberOfRowsForAliens, numberOfColumnsForAliens);
        assertEquals(numberOfAliensExpected, alienGroup.getAliens().size());
    }
    @Test
    public void shouldReturnArrayOfAliens() {
        AlienGroup alienGroup = new AlienGroup(1, 4);
        assertNotNull(alienGroup.getAliens());
    }
    @Test
    public void shouldCheckIfDidNotGotToSpaceship() {
        //Consider a Space size of 10 height and 15 width.
        AlienGroup alienGroup = new AlienGroup(2, 6);
        assertEquals(false, alienGroup.gotToTheSpaceship());
    }
    @Test
    public void shouldCheckIfGotToSpaceship() {
        //Consider a Space size of 10 height and 15 width.
        AlienGroup alienGroup = new AlienGroup(9, 6);
        assertEquals(true, alienGroup.gotToTheSpaceship());
    }
    @Test
    public void shouldCheckLimitAndMoveDown() {
        AlienGroup alienGroup = new AlienGroup(3, 5);
        alienGroup.setdirectionIsTowardsRight();
        alienGroup.moveAliens();
        assertEquals(3 ,alienGroup.getgroupDownLimit());
    }
}
