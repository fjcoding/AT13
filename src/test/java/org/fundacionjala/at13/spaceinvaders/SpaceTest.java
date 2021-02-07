package org.fundacionjala.at13.spaceinvaders;

import static org.junit.Assert.*;
import static org.fundacionjala.at13.spaceinvaders.Space.*;

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

    @Test
    public void itShouldShowSpaceWithSpaceship() {
        int height = 10;
        int width = 9;
        int spaceshipInitPosX = 4;
        int spaceshipInitPosY = 0;

        Space space = new Space(height, width);
        Spaceship spaceship = new Spaceship(spaceshipInitPosX, spaceshipInitPosY);
        space.setSpaceship(spaceship);

        String[][] spacePrint = space.show();
        String[][] expected = {
            /* y = 9 */{EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY},
            /* y = 8 */{EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY},
            /* y = 7 */{EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY},
            /* y = 6 */{EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY},
            /* y = 5 */{EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY},
            /* y = 4 */{EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY},
            /* y = 3 */{EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY},
            /* y = 2 */{EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY},
            /* y = 1 */{EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY},
            /* y = 0 */{EMPTY, EMPTY, EMPTY, EMPTY, SPACESHIP, EMPTY, EMPTY, EMPTY, EMPTY},
            /*          x = 0  x = 1  x = 2  x = 3  x = 4  x = 5  x = 6  x = 7  x = 8 */
        };
        assertArrayEquals(expected, spacePrint);
    }

    @Test
    public void itShouldShowSpaceWithAliens() {
        int height = 10;
        int width = 9;
        Space space = new Space(height, width);
        AlienGroup alienGroup = new AlienGroup(2,2);
        space.setAlien(alienGroup.getAliens());

        String[][] spacePrint = space.show();
        String[][] expected = {
                /* y = 9 */{ALIEN, ALIEN, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY},
                /* y = 8 */{ALIEN, ALIEN, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY},
                /* y = 7 */{EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY},
                /* y = 6 */{EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY},
                /* y = 5 */{EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY},
                /* y = 4 */{EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY},
                /* y = 3 */{EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY},
                /* y = 2 */{EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY},
                /* y = 1 */{EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY},
                /* y = 0 */{EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY},
                /*          x = 0  x = 1  x = 2  x = 3  x = 4  x = 5  x = 6  x = 7  x = 8 */
        };
        assertArrayEquals(expected, spacePrint);
    }

    @Test
    public void itShouldShowSpaceWithBullet() {
        int height = 10;
        int width = 9;
        Space space = new Space(height, width);
        Spaceship spaceship = new Spaceship(Spaceship.DEFAULT_POSX, Spaceship.DEFAULT_POSY);
        Bullet bullet = new Bullet(spaceship);
        space.setBullet(bullet);

        String[][] spacePrint = space.show();
        String[][] expected = {
                /* y = 9 */{EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY},
                /* y = 8 */{EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY},
                /* y = 7 */{EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY},
                /* y = 6 */{EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY},
                /* y = 5 */{EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY},
                /* y = 4 */{EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY},
                /* y = 3 */{EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY},
                /* y = 2 */{EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY},
                /* y = 1 */{BULLET, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY},
                /* y = 0 */{EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY},
                /*          x = 0  x = 1  x = 2  x = 3  x = 4  x = 5  x = 6  x = 7  x = 8 */
        };
        assertArrayEquals(expected, spacePrint);
    }
}
