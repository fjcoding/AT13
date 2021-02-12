package org.fundacionjala.at13.spaceinvaders;

import java.awt.*;
import javax.swing.*;

public class GameBoard extends JFrame {
    private final JFrame frame = new JFrame();
    private final JPanel panel = new JPanel();

    private static final int SIZE_IMAGE = 40;
    private static final int SCALE_WIDTH = Space.DEFAULT_WIDTH;
    private static final int SCALE_HEIGHT = Space.DEFAULT_HEIGHT;
    private JLabel[][] labelarray;
    private Spaceship spaceship;

    public GameBoard() {
        init();
    }

    /**
     * Method initialize the graphical interface.
     */
    public void init() {
        Runnable r = new Runnable() {
            @Override
            public void run() {

                Space space = new Space(SCALE_HEIGHT, SCALE_WIDTH);
                spaceship = new Spaceship(2, 2, 0, SCALE_WIDTH);
                frame.getContentPane().add(panel);
                frame.setSize(new Dimension(SCALE_WIDTH * SIZE_IMAGE, SCALE_HEIGHT * SIZE_IMAGE));
                frame.setVisible(true);
                frame.setTitle("Jala AT13 - Space Invanders");
                frame.setLocationRelativeTo(null);
                frame.setResizable(false);
                frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
                panel.setFocusable(true);
                panel.requestFocusInWindow();
                panel.setBackground(Color.BLACK);
            }
        };
        SwingUtilities.invokeLater(r);
        updateGameBoard();
    }

    public void updateGameBoard() {
        panel.setLayout(new GridLayout(SCALE_HEIGHT, SCALE_WIDTH, 0, 0));
        labelarray = new JLabel[SCALE_HEIGHT][SCALE_WIDTH];
                for (int row = 0; row < Space.DEFAULT_HEIGHT; row++) {
                    for (int col = 0; col < Space.DEFAULT_WIDTH; col++) {
                        JLabel label = new JLabel();
                        label.setVisible(true);
                        label.setOpaque(true);
                        label.setBackground(Color.black);
                        labelarray[row][col] = label;
                        panel.add(label);
                        ImageIcon iconLogo = new ImageIcon("src/resources/spaceship.png");
                        label.setIcon(iconLogo);
                    }
                }
    }
}
