package org.fundacionjala.at13.spaceinvaders;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GameOver {

    private static final int FONT_SIZE = 70;
    private static final int X_BOUND = 60;
    private static final int Y_BOUND = 10;
    private static final int WIDTH_BOUND = 500;
    private static final int HEIGHT_BOUND = 200;

    public GameOver() {

    }

    /**
     * @return an Integer with actual X position of SpaceElement.
     */
    public void showGameOver(final JPanel panel) {
        JLabel gameOverLabel = new JLabel("Game over");
        gameOverLabel.setBounds(X_BOUND, Y_BOUND, WIDTH_BOUND, HEIGHT_BOUND);
        gameOverLabel.setForeground(Color.white);
        gameOverLabel.setFont(new Font("Ink Free", Font.BOLD, FONT_SIZE));
        panel.add(gameOverLabel);
    }

}
