package org.fundacionjala.at13.spaceinvaders;   
import static org.junit.Assert.*;
import org.junit.Test;

public class TestSpaceInvaders{
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
        Alien alien1=new Alien();
        assertEquals(1,alien1.moveRight());
    }
    @Test
    public void shouldReturnMovedToTheLeft(){
        Alien alien1=new Alien();
        assertEquals(1,alien1.moveLeft());
    }
    @Test
    public void shouldReturnMovedDown(){
        Alien alien1=new Alien();
        assertEquals(1,alien1.moveDown());
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