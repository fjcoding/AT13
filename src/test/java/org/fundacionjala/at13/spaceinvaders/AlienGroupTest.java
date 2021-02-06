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
    public void shouldCheckLeftLimitAndMoveDown() {
        AlienGroup alienGroup = new AlienGroup(3, 5);
        alienGroup.setdirectionIsTowardsRight();
        alienGroup.moveAliens();
        assertEquals(3 ,alienGroup.getgroupDownLimit());
    }
    @Test
    public void shouldCheckLeftLimitAndMoveLeft() {
        AlienGroup alienGroup = new AlienGroup(3, 5);
        alienGroup.moveAliens();
        alienGroup.setdirectionIsTowardsRight();
        alienGroup.moveAliens();
        assertEquals(0 ,alienGroup.getGroupLeftLimit());
    }
    @Test
    public void shouldCheckRightLimitAndMoveDown() {
        AlienGroup alienGroup = new AlienGroup(3, 15);
        alienGroup.moveAliens();
        assertEquals(3 ,alienGroup.getgroupDownLimit());
    }
    @Test
    public void shouldCheckRightLimitAndMoveRight() {
        AlienGroup alienGroup = new AlienGroup(3, 5);
        //Initial rightlimit = 4;
        alienGroup.moveAliens();
        //rightlimit should be 5 after a move;
        assertEquals(5 ,alienGroup.getGroupRightLimit());
    }
    public void shouldCheckIfGroupReachTheSpaceship() {
        //Consider a Space size of 10 height and 15 width.
        AlienGroup alienGroup = new AlienGroup(9, 5);
        int currentDownLimit = alienGroup.getgroupDownLimit();
        alienGroup.moveAliens();
        assertEquals(currentDownLimit, alienGroup.getgroupDownLimit());
    
}
