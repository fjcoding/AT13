package org.fundacionjala.at13.spaceinvaders;

import static org.junit.Assert.*;
import org.junit.Test;
public class GameTest {
    
    @Test
    public void itShouldInitialize() {
    Game game = new Game();
    assertEquals(7, game.getSpaceship().getPosX());        
    }
}
