package org.fundacionjala.at13.spaceinvaders;

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
    public void itShouldMoveBulletOfAlienOnePositionDown() {
        int positionInitAlienX = 5;
        int positionInitAlienY = 3;
        Alien alien = new Alien(positionInitAlienX, positionInitAlienY, lowerXLimit, upperXLimit);
        Bullet bullet = new Bullet(alien);
        bullet.isShootingToSpaceship();
        assertEquals(1,bullet.getPositionY());
    }
    @Test
    public void itShouldChangeStateOfBulletSinceReachLimitAlienDown() {
        int positionInitAlienX = 5;
        int positionInitAlienY = 1;
        Alien Alien = new Alien(positionInitAlienX, positionInitAlienY, lowerXLimit, upperXLimit);
        Bullet bullet = new Bullet(Alien);
        bullet.isShootingToSpaceship();
        assertEquals(true,bullet.getBulletExist());
    }
    @Test
    public void itShouldGetErrorBulletIsOutOfRangeAlienDown() {
        int positionInitAlienX = 5;
        int positionInitAlienY = 0;
        Alien Alien = new Alien(positionInitAlienX, positionInitAlienY, lowerXLimit,upperXLimit);
        Bullet bullet = new Bullet(Alien);
        bullet.isShootingToSpaceship();
        assertEquals(true,bullet.getBulletExist());
    }

    @Test
    public void itShoulSayIfAlienBulletCollapseWithSpaceship() {
        int positionInitAlienX = 6;
        int positionInitAlienY = 4;
        int positionInitSpaceshipX = 6;
        int positionInitSpaceshipY = 3;
        Alien alien = new Alien(positionInitAlienX, positionInitAlienY,lowerXLimit,upperXLimit);
        Spaceship spaceship=new Spaceship(positionInitSpaceshipX, positionInitSpaceshipY,lowerXLimit,upperXLimit);
        Bullet bulletSpaceship = new Bullet(spaceship);
        bulletSpaceship.isCollapsedBulletWithAlien(alien);
        assertTrue(bulletSpaceship.isCollapsedBulletWithAlien(alien));
    }
    @Test
    public void itShoulSayIfAlienBulletNotCollapseWithSpaceship() {
        int positionInitAlienX = 3;
        int positionInitAlienY = 5;
        int positionInitSpaceshipX = 6;
        int positionInitSpaceshipY = 3;
        Alien alien = new Alien(positionInitAlienX, positionInitAlienY,lowerXLimit,upperXLimit);
        Spaceship spaceship = new Spaceship(positionInitSpaceshipX, positionInitSpaceshipY,lowerXLimit,upperXLimit);
        Bullet bulletSpaceship = new Bullet(spaceship);
        bulletSpaceship.isCollapsedBulletWithAlien(alien);
        assertFalse(bulletSpaceship.isCollapsedBulletWithAlien(alien));
    }
    @Test
    public void itShouldSayIfBulletFromSpaceshipCollapseWithSomeAlienMoving() {
        int positionInitAlienX = 6;
        int positionInitAlienY = 3;
        int positionInitSpaceshipX = 6;
        int positionInitSpaceshipY = 0;
        Alien alien = new Alien(positionInitAlienX, positionInitAlienY,lowerXLimit,upperXLimit);
        Spaceship spaceship=new Spaceship(positionInitSpaceshipX, positionInitSpaceshipY,lowerXLimit,upperXLimit);
        Bullet bulletSpaceship = new Bullet(spaceship);
        bulletSpaceship.isShootingToAlien();
        bulletSpaceship.isShootingToAlien();
        assertTrue(bulletSpaceship.isCollapsedBulletWithAlien(alien));
    }
    @Test
    public void itShouldSayIfBulletFromSpaceshipNotCollapseWithSomeAlienMoving() {
        int positionInitAlienX = 6;
        int positionInitAlienY = 5;
        Alien alien = new Alien(positionInitAlienX, positionInitAlienY,lowerXLimit,upperXLimit);
        Spaceship spaceship=new Spaceship(positionInitialX,positionInitialY,lowerXLimit,upperXLimit);
        Bullet bulletSpaceship = new Bullet(spaceship);
        bulletSpaceship.isShootingToAlien();
        bulletSpaceship.isShootingToAlien();
        bulletSpaceship.isShootingToAlien();
        bulletSpaceship.isShootingToAlien();
        assertFalse(bulletSpaceship.isCollapsedBulletWithAlien(alien));
    }
    @Test
    public void itShouldSayIfBulletFromAlienCollapseWithSpaceshipMoving() {
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
    }
    @Test
    public void itShouldSayIfBulletFromAlienNotCollapseWithSpaceshipMoving() {
        Alien alien=new Alien(posXInitAlien,posYInitAlien,lowerXLimit,upperXLimit);
        Spaceship spaceship=new Spaceship(positionInitialX,positionInitialY,lowerXLimit,upperXLimit);
        Bullet bulletAlien = new Bullet(alien);
        bulletAlien.isShootingToSpaceship();
        bulletAlien.isShootingToSpaceship();
        bulletAlien.isShootingToSpaceship();
        bulletAlien.isShootingToSpaceship();
        assertFalse(bulletAlien.isCollapsedBulletWithSpaceship(spaceship));
    }
    
}