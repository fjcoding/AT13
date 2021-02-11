package org.fundacionjala.at13.spaceinvaders;

import static org.junit.Assert.*;
import javax.swing.JLabel;
import java.util.ArrayList;

import static org.fundacionjala.at13.spaceinvaders.Space.*;

import org.junit.Test;

public class SpaceTest {



    @Test
    public void itShouldShowSpaceWithSpaceship() {
        int height = 10;
        int width = 9;
        int spaceshipInitPosX = Space.SPACESHIP_INITIAL_X_POS;
        int spaceshipInitPosY = Space.SPACESHIP_INITIAL_Y_POS;

        Space space = new Space(height, width);
        Spaceship spaceship = new Spaceship(spaceshipInitPosX, spaceshipInitPosY, 0, Space.DEFAULT_WIDTH);
        int posXSpaceshipFromSpace = space.getSpaceship().getPosX();
        int posYSpaceshipFromSpace = space.getSpaceship().getPosY();
        assertEquals(posXSpaceshipFromSpace, spaceship.getPosX());
        assertEquals(posYSpaceshipFromSpace, spaceship.getPosY());
    }

}
