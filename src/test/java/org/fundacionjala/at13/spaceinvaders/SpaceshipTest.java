package org.fundacionjala.at13.spaceinvaders;

import static org.junit.Assert.*;

import java.lang.annotation.Target;

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

    @Test
    public void ItShoot(){
        Spaceship spaceship3=new Spaceship(17, 2);
        String shoot=spaceship3.shoot();
        String expectResult=">>>>> piw <<<<< shoot position: 17,2";
        assertEquals(shoot, expectResult);
    }

    @Test
    public void itShouldNotMoveToRight(){
        Spaceship spaceship = new Spaceship(20,50);
        spaceship.moveToRight();
        int posY = spaceship.getPosY();
        assertEquals(50, posY);
    }

    @Test
    public void itShouldNotMoveToLeft(){
        Spaceship spaceship2 = new Spaceship(24,0);
        spaceship2.moveToLeft();
        int posY = spaceship2.getPosY();
        assertEquals(0, posY);
    }
}