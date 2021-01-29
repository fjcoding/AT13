package org.fundacionjala.at13.spaceinvaders;

import static org.junit.Assert.*;
import org.junit.Test;

public class SpaceshipTest{

    @Test
    public void itShouldMoveToRight(){
        Spaceship spaceship = new Spaceship(10,10);
        spaceship.moveToRight();
        int posY = spaceship.getPosY();
        assertEquals(11, posY);
    }

}