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
        int alien1InitPosX = 1;
        int alien1InitPosY = 8;
        int alien2InitPosX = 2;
        int alien2InitPosY = 8;
        int alien3InitPosX = 3;
        int alien3InitPosY = 8;

        Space space = new Space(height, width);
        Alien[] aliens = {
                new Alien(alien1InitPosX,alien1InitPosY),
                new Alien(alien2InitPosX,alien2InitPosY),
                new Alien(alien3InitPosX,alien3InitPosY),
        };
        space.setAlien(aliens);

        String[][] spacePrint = space.show();
        String[][] expected = {
                /* y = 9 */{EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY},
                /* y = 8 */{EMPTY, ALIEN, ALIEN, ALIEN, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY},
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
        int bulletInitPosX = 4;
        int bulletInitPosY = 1;

        Space space = new Space(height, width);
        Bullet bullet = new Bullet("Spaceship",bulletInitPosX, bulletInitPosY);
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
                /* y = 1 */{EMPTY, EMPTY, EMPTY, EMPTY, BULLET, EMPTY, EMPTY, EMPTY, EMPTY},
                /* y = 0 */{EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY},
                /*          x = 0  x = 1  x = 2  x = 3  x = 4  x = 5  x = 6  x = 7  x = 8 */
        };
        assertArrayEquals(expected, spacePrint);
    }
}
