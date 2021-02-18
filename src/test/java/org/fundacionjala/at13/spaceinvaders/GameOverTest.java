package org.fundacionjala.at13.spaceinvaders;

import org.junit.Assert;
import org.junit.Test;
import org.sikuli.script.Screen;

import javax.swing.*;
import java.util.Timer;

public class GameOverTest {
    @Test
    public void showGameOverScreem() throws InterruptedException {
        Screen seceem = new Screen();
        GameBoard gameBoard = new GameBoard();
        gameBoard.init();
//        JFrame jFrame = new JFrame();
//        Timer timer = new Timer();
//        GameOver gameOver = new GameOver();
//        gameOver.showGameOver(jFrame,timer);
        Thread.sleep(6000);
        Assert.assertNotNull(seceem.exists(System.getProperty("user.dir") + "\\resources\\gameovertest.png"));
    }
}
