package org.fundacionjala.at13.spaceinvaders;

import static org.junit.Assert.*;

import java.lang.annotation.Target;

import org.junit.Test;

import jdk.jfr.Timestamp;

public class SpaceshipTest{

    /*@Test
    public void itShouldShootABullet(){
        int lowerXLimit=0;
        int upperXLimit=10;
        int positionInitialX=5;
        int positionInitialY=6;
        String shape=Space.SPACESHIP;
        Spaceship spaceship=new Spaceship(positionInitialX,positionInitialY,lowerXLimit,upperXLimit);
        Bullet bulletShootBySpaceship=spaceship.shoot();
        Bullet bullet=new Bullet(shape,positionInitialX,positionInitialY);
        assertTrue(bullet.equals(bulletShootBySpaceship));
    }*/
    @Test
    public void itShouldReturnNumbersLife() {
        int lowerXLimit=0;
        int upperXLimit=42;
        int positionInitSpaceshipX = 4;
        int positionInitSpaceshipY = 0;
        Spaceship spaceship = new Spaceship(positionInitSpaceshipX, positionInitSpaceshipY,lowerXLimit,upperXLimit);
        assertEquals(3,spaceship.getNumbersLife());
    }
    @Test
    public void itShouldSayIfSpaceshipStillAlive() {
        int lowerXLimit=0;
        int upperXLimit=12;
        int positionInitAlienX = 4;
        int positionInitAlienY = 5;
        int positionInitSpaceshipX = 4;
        int positionInitSpaceshipY = 0;
        Alien alien = new Alien(positionInitAlienX, positionInitAlienY,lowerXLimit,upperXLimit);
        Spaceship spaceship = new Spaceship(positionInitSpaceshipX, positionInitSpaceshipY,lowerXLimit,upperXLimit);
        Bullet bulletAlien = new Bullet(alien);
        bulletAlien.isShootingToSpaceship();
        bulletAlien.isShootingToSpaceship();
        bulletAlien.isShootingToSpaceship();
        bulletAlien.isShootingToSpaceship();
        assertTrue(bulletAlien.isCollapsedBulletWithSpaceship(spaceship));
        assertEquals(2,spaceship.getNumbersLife());
    }
    @Test
    public void itShouldSayIfSpaceshipIsNotStillAlive() {
        int lowerXLimit=0;
        int upperXLimit=12;
        int positionInitAlienX = 4;
        int positionInitAlienY = 6;
        int positionInitSpaceshipX = 4;
        int positionInitSpaceshipY = 5;
        Alien alien = new Alien(positionInitAlienX, positionInitAlienY,lowerXLimit,upperXLimit);
        Spaceship spaceship = new Spaceship(positionInitSpaceshipX, positionInitSpaceshipY,lowerXLimit,upperXLimit);
        Bullet bulletAlien = new Bullet(alien);
        //First Impact
        assertTrue(bulletAlien.isCollapsedBulletWithSpaceship(spaceship));
        assertEquals(2,spaceship.getNumbersLife());
        //Secont Impact
        assertTrue(bulletAlien.isCollapsedBulletWithSpaceship(spaceship));
        assertEquals(1,spaceship.getNumbersLife());
        //Third Impact
        assertTrue(bulletAlien.isCollapsedBulletWithSpaceship(spaceship));
        assertEquals(0,spaceship.getNumbersLife());
    }
}