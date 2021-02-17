package org.fundacionjala.at13.spaceinvaders;

import static org.junit.Assert.*;
import org.junit.Test;
public class GameBoardTest {

    @Test
    public void itShouldMoveSpaceshipLeft() {
        GameBoard gameboard = new GameBoard();
        gameboard.init();
        int goLeft = 37;
        gameboard.executeMoveLeft(goLeft);
        assertEquals(6, gameboard.getSpaceship().getPosX());        
    }

    @Test
    public void itShouldMoveSpaceshipRight() {
        GameBoard gameboard = new GameBoard();
        gameboard.init();
        int goRight = 39;
        gameboard.executeMoveRight(goRight);
        assertEquals(8, gameboard.getSpaceship().getPosX());        
    }
}
