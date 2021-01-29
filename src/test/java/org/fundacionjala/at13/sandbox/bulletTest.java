
import org.fundacionjala.at13.spaceinvaders.bullet;
import static org.junit.Assert.*;
import org.junit.Test;

public class bulletTest{

    @Test
    public void itShooterAllien() {
        bullet bullet = new bullet(1,2);
        assertEquals("The Allien has fired from 1 2", bullet.shooter("Allien"));
    }
    @Test
    public void itShooterSpaceship() {
        bullet bullet = new bullet(3,2);
        assertEquals("The Spaceship has fired from 3 2", bullet.shooter("Spaceship"));
    }
    @Test
    public void itAlliensBulletCollapsedWithSpaceshipsBullet() {
        bullet bullet = new bullet(3,2);
        assertEquals(true, bullet.isCollapsedBullet(1, 2, 1, 2));
    }
}