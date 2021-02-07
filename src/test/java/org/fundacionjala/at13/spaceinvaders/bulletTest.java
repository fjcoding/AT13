package org.fundacionjala.at13.spaceinvaders;

import org.fundacionjala.at13.spaceinvaders.Bullet;
import org.fundacionjala.at13.spaceinvaders.*;
import static org.junit.Assert.*;
import org.junit.Test;

public class bulletTest{

    @Test
    public void itShouldGetBulletPositionInXForSpaceship() {
        Spaceship spaceship = new Spaceship(0,9);
        Bullet bullet = new Bullet(spaceship);
        assertEquals(0, bullet.getPositionX());
    }
    @Test
    public void itShouldGetBulletPositionInYForSpaceship() {
        Spaceship spaceship = new Spaceship(0,9);
        Bullet bullet = new Bullet(spaceship);
        assertEquals(10, bullet.getPositionY());
    }
    @Test
    public void itShouldGetBulletPositionInYForAlien() {
        Alien alien = new Alien(6,7);
        Bullet bullet = new Bullet(alien);
        assertEquals(6, bullet.getPositionY());
    }
    @Test
    public void itShouldSayIfSpaceshipHasShootAnotherBullet() {
        Spaceship spaceship = new Spaceship(4,0);
        Bullet bullet = new Bullet(spaceship);
        bullet.isShootingToAlien(spaceship);
        assertFalse(bullet.getBulletExist());
    }
    @Test
    public void itShouldMoveBulletOfSpaceshipOnePositionUp() {
        Spaceship spaceship = new Spaceship(4,0);
        Bullet bullet = new Bullet(spaceship);
        bullet.isShootingToAlien(spaceship);
        assertEquals(2,bullet.getPositionY());
    }
    @Test
    public void itShouldChangeStateOfBulletSinceReachLimitSpaceshipUp() {
        Spaceship spaceship = new Spaceship(4,49);
        Bullet bullet = new Bullet(spaceship);
        bullet.isShootingToAlien(spaceship);
        assertEquals(false,bullet.getBulletExist());
    }
    @Test
    public void itShouldGetErrorBulletIsOutOfRangeSpaceshipUp() {
        Spaceship spaceship = new Spaceship(4,50);
        Bullet bullet = new Bullet(spaceship);
        bullet.isShootingToAlien(spaceship);
        assertEquals(false,bullet.getBulletExist());
    }
    @Test
    public void itShouldMoveBulletOfAlienOnePositionDown() {
        Alien alien = new Alien(5,3);
        Bullet bullet = new Bullet(alien);
        bullet.isShootingToSpaceship(alien);
        assertEquals(1,bullet.getPositionY());
    }
    @Test
    public void itShouldChangeStateOfBulletSinceReachLimitAlienDown() {
        Alien Alien = new Alien(5,1);
        Bullet bullet = new Bullet(Alien);
        bullet.isShootingToSpaceship(Alien);
        assertEquals(false,bullet.getBulletExist());
    }
    @Test
    public void itShouldGetErrorBulletIsOutOfRangeAlienDown() {
        Alien Alien = new Alien(5,0);
        Bullet bullet = new Bullet(Alien);
        bullet.isShootingToSpaceship(Alien);
        assertEquals(false,bullet.getBulletExist());
    }
    @Test
    public void itShouldSayIfBulletFromSpaceshipCollapseWithSomeAlien() {
        Alien alien = new Alien(5, 5);
        Spaceship spaceship = new Spaceship(5, 0);
        Bullet bulletSpaceship = new Bullet(spaceship);
        bulletSpaceship.isShootingToAlien(spaceship);
        bulletSpaceship.isShootingToAlien(spaceship);
        bulletSpaceship.isShootingToAlien(spaceship);
        bulletSpaceship.isShootingToAlien(spaceship);
        assertTrue(bulletSpaceship.isCollapsedBulletWithAlien(alien));
    }
    @Test
    public void itShouldSayIfBulletFromSpaceshipNotCollapseWithSomeAlien() {
        Alien alien = new Alien(6, 5);
        Spaceship spaceship = new Spaceship(5, 0);
        Bullet bulletSpaceship = new Bullet(spaceship);
        bulletSpaceship.isShootingToAlien(spaceship);
        bulletSpaceship.isShootingToAlien(spaceship);
        bulletSpaceship.isShootingToAlien(spaceship);
        bulletSpaceship.isShootingToAlien(spaceship);
        assertFalse(bulletSpaceship.isCollapsedBulletWithAlien(alien));
    }
    @Test
    public void itShouldSayIfBulletFromAlienCollapseWithSpaceship() {
        Alien alien = new Alien(5, 5);
        Spaceship spaceship = new Spaceship(5, 0);
        Bullet bulletAlient = new Bullet(alien);
        bulletAlient.isShootingToSpaceship(alien);
        bulletAlient.isShootingToSpaceship(alien);
        bulletAlient.isShootingToSpaceship(alien);
        bulletAlient.isShootingToSpaceship(alien);
        assertTrue(bulletAlient.isCollapsedBulletWithSpacceship(spaceship));
    }
    @Test
    public void itShouldSayIfBulletFromAlienNotCollapseWithSpaceship() {
        Alien alien = new Alien(5, 5);
        Spaceship spaceship = new Spaceship(6, 0);
        Bullet bulletAlient = new Bullet(alien);
        bulletAlient.isShootingToSpaceship(alien);
        bulletAlient.isShootingToSpaceship(alien);
        bulletAlient.isShootingToSpaceship(alien);
        bulletAlient.isShootingToSpaceship(alien);
        assertFalse(bulletAlient.isCollapsedBulletWithSpacceship(spaceship));
    }
}
