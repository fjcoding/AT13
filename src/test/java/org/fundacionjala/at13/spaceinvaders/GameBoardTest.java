package org.fundacionjala.at13.spaceinvaders;
import org.junit.Assert;
import org.junit.Test;
import org.sikuli.script.Screen;
import static org.junit.Assert.assertEquals;

import javax.swing.JLabel;

public class GameBoardTest {
    @Test
    public void testPruebaSikuli() throws InterruptedException {
        Screen s = new Screen();
        GameBoard gameBoard = new GameBoard();
        gameBoard.init();
        Thread.sleep(500);
        Assert.assertNotNull(s.exists(System.getProperty("user.dir")+"\\resources\\space.png"));
    }

    @Test
    public void shouldCreateLabelArray() {
        GameBoard gameBoard = new GameBoard();
        JLabel[][] labelArrayTest = new JLabel[11][15];
        gameBoard.createLabelArray(labelArrayTest);
        assertEquals("Space", labelArrayTest[0][0].getName());
    }
}
