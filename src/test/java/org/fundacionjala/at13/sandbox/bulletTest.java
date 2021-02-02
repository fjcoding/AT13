import org.fundacionjala.at13.spaceinvaders.Bullet;
import static org.junit.Assert.*;
import org.junit.Test;

public class bulletTest{

    @Test
    public void itShooterAllien() {
        Bullet bullet = new Bullet(1,2);
        assertEquals("The Allien has fired from 1 2", bullet.shooter("Allien"));
    }
    @Test
    public void itShooterSpaceship() {
        Bullet bullet = new Bullet(3,2);
        assertEquals("The Spaceship has fired from 3 2", bullet.shooter("Spaceship"));
    }
    @Test
    public void itAlliensBulletCollapsedWithSpaceshipsBullet() {
        Bullet bullet = new Bullet(3,2);
        assertEquals(true, bullet.isCollapsedBullet(1, 2, 1, 2));
    }
    @Test
    public void itAlliensBulletNotCollapsedWithSpaceshipsBullet() {
        Bullet bullet = new Bullet(3,2);
        assertEquals(false, bullet.isCollapsedBullet(1, 3, 1, 2));
    } 
}