package org.fundacionjala.at13.spaceinvaders;

import org.fundacionjala.at13.spaceinvaders.Bullet;
import org.fundacionjala.at13.spaceinvaders.*;
import static org.junit.Assert.*;
import org.junit.Test;

public class bulletTest{
    int lowerXLimit=0;
    int upperXLimit=10;
    int positionInitialX = 0;
    int positionInitialY = 9;
    int posXInitAlien = 5;
    int posYInitAlien = 5;

    @Test
    public void itShouldGetBulletPositiionInXForSpaceship() {
        Spaceship spaceship=new Spaceship(positionInitialX,positionInitialY,lowerXLimit,upperXLimit);
        Bullet Bullet = new Bullet(spaceship);
        assertEquals(0, Bullet.getPositionX());        
    }

    @Test
    public void itShouldGetBulletPositionInYForSpaceship() {
        Spaceship spaceship=new Spaceship(positionInitialX,positionInitialY,lowerXLimit,upperXLimit);
        Bullet Bullet = new Bullet(spaceship);
        assertEquals(10, Bullet.getPositionY());        
    }

    @Test
    public void itShouldSayIfSpaceShipHasShootAnotherBullet() {
        Spaceship spaceship=new Spaceship(positionInitialX,positionInitialY,lowerXLimit,upperXLimit);
        Bullet bullet = new Bullet(spaceship);
        bullet.isShootingToAlien();
        assertFalse(bullet.getBulletExist());
    }

    @Test
    public void itShouldGetBulletPositionInYForAlien() {
        Alien alien = new Alien(6,7,lowerXLimit,upperXLimit);
        Bullet bullet = new Bullet(alien);
        assertEquals(6, bullet.getPositionY());
    }

    @Test
    public void itShouldSayIfSpaceshipHasShootAnotherBullet() {
        Spaceship spaceship = new Spaceship(4,0,lowerXLimit,upperXLimit);
        Bullet bullet = new Bullet(spaceship);
        bullet.isShootingToAlien();
        assertFalse(bullet.getBulletExist());
    }

    @Test
    public void itShouldSayIfSpaceshipHasNotShootAnotherBullet() {
        Spaceship spaceship = new Spaceship(4,0,lowerXLimit,upperXLimit);
        Bullet bullet = new Bullet(spaceship);
        bullet.changeBulletExists(true);
        int previusPos = bullet.getPositionY();
        bullet.isShootingToAlien();
        int actualPos = bullet.getPositionY();
        assertEquals(previusPos, actualPos);
    }
    @Test
    public void itShouldSayIfAlienHasNotShootAnotherBullet() {
        Alien alien = new Alien(5,0,lowerXLimit,upperXLimit);
        Bullet bullet = new Bullet(alien);
        bullet.changeBulletExists(true);
        int previusPos = bullet.getPositionY();
        bullet.isShootingToSpaceship();
        int actualPos = bullet.getPositionY();
        assertEquals(previusPos, actualPos);
    }
    @Test
    public void itShouldMoveBulletOfSpaceshipOnePositionUp() {
        Spaceship spaceship = new Spaceship(4,0,lowerXLimit,upperXLimit);
        Bullet bullet = new Bullet(spaceship);
        bullet.isShootingToAlien();
        assertEquals(2,bullet.getPositionY());
    }
    @Test
    public void itShouldChangeStateOfBulletSinceReachLimitSpaceshipUp() {
        Spaceship spaceship = new Spaceship(4,49,lowerXLimit,upperXLimit);
        Bullet bullet = new Bullet(spaceship);
        bullet.isShootingToAlien();
        assertEquals(true,bullet.getBulletExist());
    }
    @Test
    public void itShouldGetErrorBulletIsOutOfRangeSpaceshipUp() {
        Spaceship spaceship = new Spaceship(4,50,lowerXLimit,upperXLimit);
        Bullet bullet = new Bullet(spaceship);
        bullet.isShootingToAlien();
        assertEquals(true,bullet.getBulletExist());
    }
}