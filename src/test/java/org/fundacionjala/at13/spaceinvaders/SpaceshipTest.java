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

    @Test
    public void itShouldMoveToLeft(){
        Spaceship spaceship2 = new Spaceship(24,9);
        spaceship2.moveToLeft();
        int posY = spaceship2.getPosY();
        assertEquals(8, posY);
    }
}