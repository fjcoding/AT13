package org.fundacionjala.at13.spaceinvaders;
import static org.junit.Assert.*;
import org.junit.Test;
public class AlienTest {
    
    @Test
    public void itShouldShootABullet(){
        int lowerXLimit=0;
        int upperXLimit=10;
        int positionInitialX=5;
        int positionInitialY=6;
        String shape=Space.ALIEN;
        Alien alien=new Alien(positionInitialX,positionInitialY,lowerXLimit,upperXLimit);
        Bullet bulletShootByAlien=alien.shoot();
        Bullet bullet=new Bullet(shape,positionInitialX,positionInitialY);
        assertTrue(bullet.equals(bulletShootByAlien));
    }

    @Test
    public void itShouldMoveDown() {
        int lowerXLimit=0;
        int upperXLimit=10;
        int positionInitialX=9;
        int positionInitialY=6;
        int newPositionX=positionInitialY-1;
        Alien alien=new Alien(positionInitialX,positionInitialY,lowerXLimit,upperXLimit);
        alien.moveDown();
        assertEquals(newPositionX, alien.getPosY());
    }
}
