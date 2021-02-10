package org.fundacionjala.at13.spaceinvaders;   
import static org.junit.Assert.*;
import org.junit.Test;

public class AlienGroupTest {
    @Test
    public void shouldFillArrayWithAliens() {
        int numberOfRowsForAliens = 3;
        int numberOfColumnsForAliens = 5;
        /**
         * Number of aliens:
         * 3 * 5 = 15 aliens
         */
        int numberOfAliensExpected = 15;
        AlienGroup alienGroup = new AlienGroup(numberOfRowsForAliens, numberOfColumnsForAliens);
        assertNotNull(alienGroup.getAliens());
        assertEquals(numberOfAliensExpected, alienGroup.getAliens().size());
    }
    @Test
    public void shouldCheckIfDidNotGotToSpaceship() {
        /**
         * The aliens get to ship if they reach a defined limit: 
         * SPACE_SIZE_HEIGHT = 30 
         * SPACESHIP_ROW_LIMIT = 3
         */
        AlienGroup alienGroup = new AlienGroup(2, 6);
        assertEquals(false, alienGroup.gotToTheSpaceship());
    }
    @Test
    public void shouldCheckIfGotToSpaceship() {
        /**
         * The aliens get to ship if they reach a defined limit: 
         * SPACE_SIZE_HEIGHT = 30 
         * SPACESHIP_ROW_LIMIT = 3
         */
        AlienGroup alienGroup = new AlienGroup(30, 6);
        assertEquals(true, alienGroup.gotToTheSpaceship());
    }
    @Test
    public void shouldCheckLeftLimitAndMoveDown() {
        /**
         * Alien group with 3 rows
         * Alien group starts moving right
         * The initial position of the last row on the aliens is:
         * groupDownLimit = rows - 1 = 2
         */
        AlienGroup alienGroup = new AlienGroup(3, 5);
        alienGroup.switchDirection();
        alienGroup.moveAliens();
        assertEquals(3 ,alienGroup.getgroupDownLimit());
    }
    @Test
    public void shouldCheckLeftLimitAndMoveLeft() {
        /**
         * Initial position of alien group is 0
         * Alien group starts moving right
         */
        AlienGroup alienGroup = new AlienGroup(3, 5);
        alienGroup.moveAliens();
        alienGroup.switchDirection();
        alienGroup.moveAliens();
        assertEquals(0 ,alienGroup.getGroupLeftLimit());
    }
    @Test
    public void shouldCheckRightLimitAndMoveDown() {
        /**
         * SPACE_SIZE_WIDTH = 40
         * Alien group with 3 rows
         * Alien group starts moving right
         * groupDownLimit = rows - 1 = 2
         */
        AlienGroup alienGroup = new AlienGroup(3, 30);
        alienGroup.moveAliens();
        assertEquals(3 ,alienGroup.getgroupDownLimit());
    }
    @Test
    public void shouldCheckRightLimitAndMoveRight() {
        /**
         * Alien group with 5 columns
         * Alien group starts moving right
         * groupRightLimit = columns - 1 = 4
         */
        AlienGroup alienGroup = new AlienGroup(3, 5);
        alienGroup.moveAliens();
        assertEquals(5 ,alienGroup.getGroupRightLimit());
    }
    public void shouldCheckIfGroupReachTheSpaceship() {
        /**
         * SPACE_SIZE_HEIGHT = 30
         */
        AlienGroup alienGroup = new AlienGroup(29, 5);
        int currentDownLimit = alienGroup.getgroupDownLimit();
        alienGroup.moveAliens();
        assertEquals(currentDownLimit, alienGroup.getgroupDownLimit());
    }
}

