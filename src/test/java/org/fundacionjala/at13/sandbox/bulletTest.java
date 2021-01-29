
import org.fundacionjala.at13.spaceinvaders.bullet;
import static org.junit.Assert.*;
import org.junit.Test;

public class bulletTest{

    @Test
    public void itShooterAllien() {
        bullet bullet = new bullet(1,2);
        assertEquals("The Allien has fired from 1 2", bullet.shooter("Allien"));
    }
}