package org.fundacionjala.at13.spaceinvaders;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.ImageIcon;
import java.util.Timer;

public class GameOver {
    private static final int FONT_SIZE = 70;
    private static final int X_BOUND = 120;
    private static final int Y_BOUND = 5;
    private static final int WIDTH_BOUND = 500;
    private static final int HEIGHT_BOUND = 100;
    private static final int IMAGE_X_BOUND = 210;
    private static final int IMAGE_Y_BOUND = 100;
    private static final int IMAGE_WIDTH_BOUND = 200;
    private static final int IMAGE_HEIGHT_BOUND = 200;
    private static final int BUTTON_X_BOUND = 260;
    private static final int BUTTON_Y_BOUND = 300;
    private static final int BUTTON_WIDTH_BOUND = 80;
    private static final int BUTTON_HEIGHT_BOUND = 80;

    public GameOver() {

    }

    /**
     * Shows game over interface.
     */
    public void showGameOver(final JFrame frame, final Timer timer) {
        frame.getContentPane().removeAll();
        frame.getContentPane().setBackground(Color.black);
        JLabel gameOverLabel = new JLabel("Game over");
        JLabel gameOverImage = new JLabel();
        JButton playAgain = new JButton();
        ImageIcon gameOverIcon = new ImageIcon("resources/gameover.png");
        ImageIcon playAgainIcon = new ImageIcon("resources/playagain.png");

        gameOverImage.setBounds(IMAGE_X_BOUND, IMAGE_Y_BOUND, IMAGE_WIDTH_BOUND, IMAGE_HEIGHT_BOUND);
        scaleImage(gameOverImage, gameOverIcon);
        gameOverLabel.setForeground(Color.white);
        gameOverLabel.setFont(new Font("Ink Free", Font.BOLD, FONT_SIZE));
        gameOverLabel.setBounds(X_BOUND, Y_BOUND, WIDTH_BOUND, HEIGHT_BOUND);
        playAgain.setBounds(BUTTON_X_BOUND, BUTTON_Y_BOUND, BUTTON_WIDTH_BOUND, BUTTON_HEIGHT_BOUND);
        scaleImageToButton(playAgain, playAgainIcon);
        playAgain.addActionListener(new ActionListener() {
            public void actionPerformed(final ActionEvent e) {
                playAgain(frame, timer);
            }
        });
        frame.add(gameOverLabel);
        frame.add(gameOverImage);
        frame.add(playAgain);
    }

    /**
     * Scalates an image to the size of a label.
     */
    public void scaleImage(final JLabel label, final ImageIcon icon) {
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        label.setIcon(scaledIcon);
    }

    /**
     * Scalates an image to the size of a button.
     */
    public void scaleImageToButton(final JButton button, final ImageIcon icon) {
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(button.getWidth(), button.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        button.setIcon(scaledIcon);
    }

    /**
     * @return an Instance of GameBoard to play again
     */
    public GameBoard playAgain(final JFrame frame, final Timer timer) {
        frame.dispose();
        timer.cancel();
        GameBoard gameboard = new GameBoard();
        gameboard.init();
        return gameboard;
    }

}
