package org.fundacionjala.at13.spaceinvaders;

import static org.junit.Assert.assertEquals;

import javax.swing.JLabel;

import org.junit.Test;

public class GameBoardTest {
    @Test
    public void shouldCreateLabelArray() {
        GameBoard gameBoard = new GameBoard();
        JLabel[][] labelArrayTest = new JLabel[11][15];
        gameBoard.createLabelArray(labelArrayTest);
        assertEquals("Space", labelArrayTest[0][0].getName());
    }
}
