package org.fundacionjala.at13.spaceinvaders;

import static org.junit.Assert.*;
import org.junit.Test;

public class bulletTest{
    int lowerXLimit = 0;
    int upperXLimit = 10;
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
    public void itShouldSayIfSpaceShipHasShootAnotherBullet() {
        Spaceship spaceship=new Spaceship(positionInitialX,positionInitialY,lowerXLimit,upperXLimit);
        Bullet bullet = new Bullet(spaceship);
        bullet.shootAlien();
        assertFalse(bullet.getBulletExist());
    }

    @Test
    public void itShouldSayIfSpaceshipHasNotShootAnotherBullet() {
        int positionX = 4;
        int positionY = 0;
        Spaceship spaceship = new Spaceship(positionX, positionY, lowerXLimit, upperXLimit);
        Bullet bullet = new Bullet(spaceship);
        bullet.changeBulletExists(true);
        int previusPos = bullet.getPositionY();
        bullet.shootAlien();
        int actualPos = bullet.getPositionY();
        assertEquals(previusPos, actualPos);
    }

    @Test
    public void itShouldSayIfAlienHasNotShootAnotherBullet() {
        int positionX = 5;
        int positionY = 0;
        Alien alien = new Alien(positionX, positionY, lowerXLimit, upperXLimit);
        Bullet bullet = new Bullet(alien);
        bullet.changeBulletExists(true);
        int previusPos = bullet.getPositionY();
        bullet.shootSpaceship();
        int actualPos = bullet.getPositionY();
        assertEquals(previusPos, actualPos);
    }

    @Test
    public void itShouldMoveBulletOfAlienOnePositionDown() {
        int positionInitAlienX = 5;
        int positionInitAlienY = 3;
        Alien alien = new Alien(positionInitAlienX, positionInitAlienY, lowerXLimit, upperXLimit);
        Bullet bullet = new Bullet(alien);
        bullet.shootSpaceship();
        assertEquals(4,bullet.getPositionY());
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
        bulletSpaceship.hasHitTheAlien(alien);
        assertFalse(bulletSpaceship.hasHitTheAlien(alien));
    }

    @Test
    public void itShouldSayIfBulletFromSpaceshipCollapseWithSomeAlienMoving() {
        int positionInitAlienX = 6;
        int positionInitAlienY = 1;
        int positionInitSpaceshipX = 6;
        int positionInitSpaceshipY = 4;
        Alien alien = new Alien(positionInitAlienX, positionInitAlienY,lowerXLimit,upperXLimit);
        Spaceship spaceship=new Spaceship(positionInitSpaceshipX, positionInitSpaceshipY,lowerXLimit,upperXLimit);
        Bullet bulletSpaceship = new Bullet(spaceship);
        bulletSpaceship.shootAlien();
        bulletSpaceship.shootAlien();
        bulletSpaceship.shootAlien();
        assertTrue(bulletSpaceship.hasHitTheAlien(alien));
    }

    @Test
    public void itShouldSayIfBulletFromSpaceshipNotCollapseWithSomeAlienMoving() {
        int positionInitAlienX = 6;
        int positionInitAlienY = 5;
        Alien alien = new Alien(positionInitAlienX, positionInitAlienY,lowerXLimit,upperXLimit);
        Spaceship spaceship=new Spaceship(positionInitialX,positionInitialY,lowerXLimit,upperXLimit);
        Bullet bulletSpaceship = new Bullet(spaceship);
        bulletSpaceship.shootAlien();
        bulletSpaceship.shootAlien();
        bulletSpaceship.shootAlien();
        bulletSpaceship.shootAlien();
        assertFalse(bulletSpaceship.hasHitTheAlien(alien));
    }

    @Test
    public void itShouldSayIfBulletFromSpaceshipNotCollapseWithSomeAlienMoving2() {
        int positionInitAlienX = 0;
        int positionInitAlienY = 5;
        Alien alien = new Alien(positionInitAlienX, positionInitAlienY, lowerXLimit, upperXLimit);
        Spaceship spaceship=new Spaceship(positionInitialX, positionInitialY, lowerXLimit, upperXLimit);
        Bullet bulletSpaceship = new Bullet(spaceship);
        bulletSpaceship.shootAlien();
        bulletSpaceship.shootAlien();
        bulletSpaceship.shootAlien();
        assertFalse(bulletSpaceship.hasHitTheAlien(alien));
    }
    
    @Test
    public void itShouldSayIfBulletFromAlienCollapseWithSpaceshipMoving() {
        int positionInitAlienX = 2;
        int positionInitAlienY = 2;
        int positionInitSpaceshipX = 2;
        int positionInitSpaceshipY = 4;
        Alien alien = new Alien(positionInitAlienX, positionInitAlienY,lowerXLimit,upperXLimit);
        Spaceship spaceship = new Spaceship(positionInitSpaceshipX, positionInitSpaceshipY,lowerXLimit,upperXLimit);
        Bullet bulletAlien = alien.shoot();
        bulletAlien.movingBulletDown();
        bulletAlien.movingBulletDown();
        assertEquals(4, bulletAlien.getPositionY());
    }

    @Test
    public void itShouldSayBulletFromAlienDoesntCollapseWithSpaceshipMoving() {
        int positionInitAlienX = 6;
        int positionInitAlienY = 4;
        int positionInitSpaceshipX = 5;
        int positionInitSpaceshipY = 0;
        Alien alien = new Alien(positionInitAlienX, positionInitAlienY,lowerXLimit,upperXLimit);
        Spaceship spaceship = new Spaceship(positionInitSpaceshipX, positionInitSpaceshipY,lowerXLimit,upperXLimit);
        Bullet bulletAlien = new Bullet(alien);
        bulletAlien.shootSpaceship();
        bulletAlien.shootSpaceship();
        bulletAlien.shootSpaceship();
        assertFalse(bulletAlien.hasHitTheSpaceship(spaceship));
    }
    
    @Test
    public void itShouldSayIfBulletFromAlienNotCollapseWithSpaceshipMoving() {
        Alien alien=new Alien(posXInitAlien,posYInitAlien,lowerXLimit,upperXLimit);
        Spaceship spaceship=new Spaceship(positionInitialX,positionInitialY,lowerXLimit,upperXLimit);
        Bullet bulletAlien = new Bullet(alien);
        bulletAlien.shootSpaceship();
        bulletAlien.shootSpaceship();
        bulletAlien.shootSpaceship();
        bulletAlien.shootSpaceship();
        assertFalse(bulletAlien.hasHitTheSpaceship(spaceship));
    }

     /*
     Spaceship in posicion x is the same as Alien but is different in posicion Y
     */   
    @Test
    public void itShouldSayIfBulletFromAlienNotCollapseWithSpaceshipMoving2() {
        int lowerXLimit=0;
        int upperXLimit=10;
        int positionInitialX = 5;
        int positionInitialY = 9;
        int posXInitAlien = 5;
        int posYInitAlien = 5;
        Alien alien=new Alien(posXInitAlien,posYInitAlien,lowerXLimit,upperXLimit);
        Spaceship spaceship=new Spaceship(positionInitialX,positionInitialY,lowerXLimit,upperXLimit);
        Bullet bulletAlien = new Bullet(alien);
        bulletAlien.shootSpaceship();
        bulletAlien.shootSpaceship();
        bulletAlien.shootSpaceship();
        assertFalse(bulletAlien.hasHitTheSpaceship(spaceship));
    }
    
    @Test
    public void alienBulletHitsSpaceship() {
        int positionInitialX = 5;
        int positionInitialY = 9;
        int posXInitAlien = 5;
        int posYInitAlien = 5;
        Alien alien = new Alien(posXInitAlien, posYInitAlien, lowerXLimit, upperXLimit);
        Spaceship spaceship = new Spaceship(positionInitialX, positionInitialY, lowerXLimit, upperXLimit);
        Bullet bulletAlien = new Bullet(alien);
        bulletAlien.shootSpaceship();
        bulletAlien.shootSpaceship();
        bulletAlien.shootSpaceship();
        bulletAlien.shootSpaceship();
        assertTrue(bulletAlien.hasHitTheSpaceship(spaceship));
    }

    @Test
    public void itShouldChangeStateOfBulletSinceReachLimitAlienDown() {
        int positionInitAlienX = 5;
        int positionInitAlienY = 1;
        Alien Alien = new Alien(positionInitAlienX, positionInitAlienY, lowerXLimit, upperXLimit);
        Bullet bullet = new Bullet(Alien);
        bullet.shootSpaceship();
        assertEquals(false, bullet.getBulletExist());
    }

    @Test
    public void itShouldGetErrorBulletIsOutOfRangeAlienDown() {
        int positionInitAlienX = 5;
        int positionInitAlienY = 0;
        Alien Alien = new Alien(positionInitAlienX, positionInitAlienY, lowerXLimit, upperXLimit);
        Bullet bullet = new Bullet(Alien);
        bullet.shootSpaceship();
        assertEquals(false, bullet.getBulletExist());
    }

    @Test 
    public void isShouldFinishBullet() {
        int positionInitSpaceshipX = 5;
        int positionInitSpaceshipY = 1;
        Spaceship spaceship = new Spaceship(positionInitSpaceshipX, positionInitSpaceshipY, lowerXLimit, upperXLimit);
        Bullet bullet = new Bullet(spaceship);
        bullet.finishBull();
        assertEquals(9, bullet.getPositionY());
    }
}