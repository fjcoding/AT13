import org.fundacionjala.at13.spaceinvaders.Bullet;
import static org.junit.Assert.*;
import org.junit.Test;

public class bulletTest{

    @Test
    public void itGetBulletPositiionInX() {
        int lowerXLimit=0;
        int upperXLimit=10;
        int positionInitialX=5;
        int positionInitialY=6;
        Spaceship spaceship=new Spaceship(positionInitialX,positionInitialY,lowerXLimit,upperXLimit);
        Bullet Bullet = new Bullet(spaceship);
        assertEquals(7,Bullet.getPositionX());
    }

    @Test
    public void itGetBulletPositiionInY() {
        Bullet Bullet = new Bullet("*", 3, 6);
        assertEquals(5, Bullet.getPositionY());
    }

    @Test
    public void ifBulletNotExistWhileNotShooting() {
        Bullet Bullet = new Bullet("Spaceship",3,3);
        assertEquals(false,Bullet.getBulletExist());
    }

    @Test
    public void ifBulletExistWhileShooting() {
        Bullet Bullet = new Bullet("Spaceship",3,3);
        Bullet.itShooting();
        assertEquals(true,Bullet.getBulletExist());
    }

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
    }

    @Test
    public void itAlliensBulletCollapsedWithSpaceshipsBullet() {
        Bullet Bullet = new Bullet("Spaceship",3,2);
        assertEquals(true, Bullet.isCollapsedBullet(1, 2, 1, 2));
    }

    @Test
    public void itAlliensBulletNotCollapsedWithSpaceshipsBullet() {
        Bullet Bullet = new Bullet("Spaceship",3,2);
        assertEquals(false, Bullet.isCollapsedBullet(1, 3, 1, 2));
    }
    
}