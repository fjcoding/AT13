package org.fundacionjala.at13.spaceinvaders;   
import static org.junit.Assert.*;
import org.junit.Test;

public class AlienTest{
    @Test
    public void shouldReturnXPosOfAlien(){
        Alien alien1=new Alien();
        assertEquals(0,alien1.getXPos());
    }
    @Test
    public void shouldReturnYPosOfAlien(){
        Alien alien1=new Alien();
        assertEquals(0,alien1.getYPos());
    }
    @Test
    public void shouldReturnMovedToRight(){
        //Initial position x = 0, y = 0;   
        Alien alien1=new Alien();
        //x +1
        alien1.moveRight();
        assertEquals(1,alien1.getXPos());
    }
    @Test
    public void shouldReturnMovedToTheLeft(){
        //Initial position x = 1, y = 0;
        Alien alien1=new Alien(1, 0);
        alien1.moveLeft();
        assertEquals(0,alien1.getXPos());
    }
    @Test
    public void shouldReturnMovedDown(){
        //Initial position x = 0, y = 0;
        Alien alien1=new Alien();
        alien1.moveDown();
        assertEquals(1,alien1.getYPos());
    }
    @Test
    public void shouldReturnAlienShootABullet(){
        Alien alien1=new Alien();
        assertEquals("Alien shooted a bullet",alien1.shoot());
    }
    @Test
    public void shouldReturnAlienIsDead(){
        Alien alien1=new Alien();
        assertEquals(false,alien1.die());
    }
}