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

    @Test
    public void itShouldGetLowerLimint(){
        Spaceship spaceship = new Spaceship(10, 10);
        int lowerLimit = spaceship.getLowerLimint();
        assertEquals(0, lowerLimit);
    }

    @Test
    public void itShouldGetUpperLimint(){
        Spaceship spaceship = new Spaceship(10, 10);
        int upperLimit = spaceship.getUpperLimint();
        assertEquals(50, upperLimit);
    }

    @Test
    public void itShouldGetPosX(){
        Spaceship spaceship = new Spaceship(10, 10);
        assertEquals(10, spaceship.getPosX());
    }

    @Test
    public void itShouldntAcceptnNegativePosX(){
        Spaceship spaceship = new Spaceship(2, 2);
        int newPosX=-2;
        spaceship.setPosX(newPosX);
        assertEquals(0, spaceship.getPosX());
    }

    @Test
    public void itShouldntAcceptPosXOutUpperLimit(){
        Spaceship spaceship = new Spaceship(1, 1);
        int newPosX=50;
        spaceship.setPosX(newPosX);
        assertEquals(49, spaceship.getPosX());
    }

    @Test
    public void itShouldAcceptPosXBetweenLimits(){
        Spaceship spaceship = new Spaceship(1, 1);
        int newPosX=26;
        spaceship.setPosX(newPosX);
        assertEquals(newPosX, spaceship.getPosX());
    }
    @Test
    public void itShouldgo1stsetPosY(){
        Spaceship spaceshipY = new Spaceship(10,20);
        int answerTrue=spaceshipY.getLowerLimint();
        spaceshipY.setPosY(spaceshipY.getPosY()-1000);
        assertEquals(answerTrue, spaceshipY.getPosY());
    }
    @Test
    public void itShouldgo2ndsetPosY(){
        Spaceship spaceshipY = new Spaceship(10,25);
        int answerTrue=spaceshipY.getUpperLimint()-1;
        spaceshipY.setPosY(spaceshipY.getPosY()+1000);
        assertEquals(answerTrue, spaceshipY.getPosY());
    }
    @Test
    public void itShouldgo3rdtsetPosY(){
        Spaceship spaceshipY = new Spaceship(10,15);
        int answerTrue=15;
        spaceshipY.setPosY(spaceshipY.getPosY());
        assertEquals(answerTrue, spaceshipY.getPosY());
    }
}