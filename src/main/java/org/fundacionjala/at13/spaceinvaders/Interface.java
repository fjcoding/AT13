package org.fundacionjala.at13.spaceinvaders;

import java.awt.*;
import javax.swing.*;

public class Interface extends JFrame {
    private final JFrame frame = new JFrame();
    private final JPanel panel = new JPanel();
    private static final int WIDTH_WINDOWS = 500;
    private static final int HEIGH_WINDOWS = 500;

    public Interface() {
        init();
    }

    /**
     * Method initialize the graphical interface.
     */
    public void init() {
        Runnable r = new Runnable() {
            @Override
            public void run() {
                frame.getContentPane().add(panel);
                panel.setFocusable(true);
                panel.requestFocusInWindow();
                panel.setLayout(null);
                panel.setBackground(Color.BLACK);
                frame.setSize(new Dimension(WIDTH_WINDOWS, HEIGH_WINDOWS));
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
