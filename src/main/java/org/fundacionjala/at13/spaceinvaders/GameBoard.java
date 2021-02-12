package org.fundacionjala.at13.spaceinvaders;

import java.awt.*;
import javax.swing.*;

public class GameBoard extends JFrame {
    private final JFrame frame = new JFrame();
    private final JPanel panel = new JPanel();

    private static final int SIZE_IMAGE = 40;
    private static final int SCALE_WIDTH = Space.DEFAULT_WIDTH;
    private static final int SCALE_HEIGHT = Space.DEFAULT_HEIGHT;

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
                GridLayout gridLayout = new GridLayout(SCALE_HEIGHT, SCALE_WIDTH);
                frame.getContentPane().add(panel);
                panel.setFocusable(true);
                panel.requestFocusInWindow();
                panel.setLayout(gridLayout);
                panel.setBackground(Color.BLACK);
                frame.setSize(new Dimension(SCALE_WIDTH * SIZE_IMAGE, SCALE_HEIGHT * SIZE_IMAGE));
                frame.setVisible(true);
                frame.setTitle("Jala AT13 - Space Invanders");
                frame.setLocationRelativeTo(null);
                frame.setResizable(false);
                frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
            }
        };
        SwingUtilities.invokeLater(r);
    }
}
