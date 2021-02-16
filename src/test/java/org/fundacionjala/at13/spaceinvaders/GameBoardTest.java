package org.fundacionjala.at13.spaceinvaders;

import org.junit.Assert;
import org.junit.Test;
import org.sikuli.script.Screen;

public class GameBoardTest {
    @Test
    public void testPruebaSikuli() throws InterruptedException {
        Screen s = new Screen();
        GameBoard gameBoard = new GameBoard();
        gameBoard.init();
        Thread.sleep(500);
        Assert.assertNotNull(s.exists(System.getProperty("user.dir")+"\\resources\\space.png"));
    }
}
