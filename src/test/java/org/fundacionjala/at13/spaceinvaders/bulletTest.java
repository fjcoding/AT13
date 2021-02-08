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

    /* @Test
    public void itShouldSayIfSpaceShipHasNotShootAnotherBullet() {
        Spaceship spaceship=new Spaceship(positionInitialX,positionInitialY,lowerXLimit,upperXLimit);
        Bullet bullet = new Bullet(spaceship);
        assertFalse(bullet.getBulletExist());
    } */

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
    @Test
    public void itShouldMoveBulletOfAlienOnePositionDown() {
        Alien alien = new Alien(5,3,lowerXLimit,upperXLimit);
        Bullet bullet = new Bullet(alien);
        bullet.isShootingToSpaceship();
        assertEquals(1,bullet.getPositionY());
    }
    @Test
    public void itShouldChangeStateOfBulletSinceReachLimitAlienDown() {
        Alien Alien = new Alien(5,1,lowerXLimit,upperXLimit);
        Bullet bullet = new Bullet(Alien);
        bullet.isShootingToSpaceship();
        assertEquals(true,bullet.getBulletExist());
    }
    @Test
    public void itShouldGetErrorBulletIsOutOfRangeAlienDown() {
        Alien Alien = new Alien(5,0,lowerXLimit,upperXLimit);
        Bullet bullet = new Bullet(Alien);
        bullet.isShootingToSpaceship();
        assertEquals(true,bullet.getBulletExist());
    }
/*
    @Test
    public void itShooterAllien() {
        Bullet Bullet = new Bullet("*",1,2);
        assertEquals("The * has fired from 1 1", Bullet.itShooting());
    }
    @Test
    public void itShooterSpaceship() {
        Bullet Bullet = new Bullet("^",3,2);
        assertEquals("The ^ has fired from 3 3", Bullet.itShooting());
    }
    @Test
    public void ifAlienCantShootBecauseAlreadyShoot() {
        Bullet Bullet = new Bullet("Alien",3,2);
        Bullet.itShooting();
        assertEquals("The Alien cannot fired.", Bullet.itShooting());
    }*/

    @Test
    public void itShoulSayIfAlienBulletCollapseWithSpaceship() {
        Alien alien = new Alien(6,4,lowerXLimit,upperXLimit);
        Spaceship spaceship=new Spaceship(6,3,lowerXLimit,upperXLimit);
        Bullet bulletSpaceship = new Bullet(spaceship);
        bulletSpaceship.isCollapsedBulletWithAlien(alien);
        assertTrue(bulletSpaceship.isCollapsedBulletWithAlien(alien));
    }
    @Test
    public void itShoulSayIfAlienBulletNotCollapseWithSpaceship() {
        Alien alien = new Alien(3,5,lowerXLimit,upperXLimit);
        Spaceship spaceship=new Spaceship(6,3,lowerXLimit,upperXLimit);
        Bullet bulletSpaceship = new Bullet(spaceship);
        bulletSpaceship.isCollapsedBulletWithAlien(alien);
        assertFalse(bulletSpaceship.isCollapsedBulletWithAlien(alien));
    }
    @Test
    public void itShouldSayIfBulletFromSpaceshipCollapseWithSomeAlienMoving() {
        Alien alien = new Alien(6,3,lowerXLimit,upperXLimit);
        Spaceship spaceship=new Spaceship(6,0,lowerXLimit,upperXLimit);
        Bullet bulletSpaceship = new Bullet(spaceship);
        bulletSpaceship.isShootingToAlien();
        bulletSpaceship.isShootingToAlien();
        assertTrue(bulletSpaceship.isCollapsedBulletWithAlien(alien));
    }
    @Test
    public void itShouldSayIfBulletFromSpaceshipNotCollapseWithSomeAlienMoving() {
        Alien alien = new Alien(6,5,lowerXLimit,upperXLimit);
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
        Alien alien=new Alien(4,5,lowerXLimit,upperXLimit);
        Spaceship spaceship=new Spaceship(4,0,lowerXLimit,upperXLimit);
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