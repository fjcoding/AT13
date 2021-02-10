package org.fundacionjala.at13.spaceinvaders;

import java.awt.*;
import javax.swing.*;
import javax.swing.ImageIcon;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Interface extends JFrame {
    private final JFrame frame = new JFrame();
    private final JPanel panel = new JPanel();

    private static JLabel ship = new JLabel(new ImageIcon("resources/spaceship.png"));
    private static final int GO_LEFT = 37;
    private static final int GO_RIGHT = 39;
    private static final int SIZE_IMAGE = 20;
    private static final int POS_X = (Space.DEFAULT_WIDTH * 5 - 20) / 2;
    private static final int POS_Y = Space.DEFAULT_HEIGHT * 14 - 20;
    private static final int SCALE_WIDTH = Space.DEFAULT_WIDTH * 5;
    private static final int SCALE_HEIGHT = Space.DEFAULT_HEIGHT * 15;
    private final Spaceship spaceship = new Spaceship((SCALE_WIDTH - SIZE_IMAGE) / 2, SCALE_HEIGHT - SIZE_IMAGE, 0, SCALE_WIDTH - 23);
    private final GameOver gameOver = new GameOver();

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
                Space space = new Space(SCALE_WIDTH, SCALE_HEIGHT);
                frame.getContentPane().add(panel);
                panel.setFocusable(true);
                panel.requestFocusInWindow();
                panel.setLayout(null);
                panel.setBackground(Color.BLACK);
                frame.setSize(new Dimension(SCALE_WIDTH, SCALE_HEIGHT));
                frame.setVisible(true);
                frame.setTitle("Jala AT13 - Space Invanders");
                frame.setLocationRelativeTo(null);
                frame.setResizable(false);
                frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
                if (spaceship.getAlive()) {
                    spaceShipImage(POS_X, POS_Y);
                } else {
                    gameOver.showGameOver(panel);
                }
            }
        };
        SwingUtilities.invokeLater(r);
        eventKey();
    }

    /**
     * Method initialize the image.
     */
    public final void spaceShipImage(final int posX, final int posY) {
        ship.setBounds(posX, posY, SIZE_IMAGE, SIZE_IMAGE);
        panel.add(ship);
    }

    /**
     * Method for the key.
     */
    public void eventKey() {
        KeyListener keyEvent = new KeyListener() {

            @Override
            public void keyTyped(final KeyEvent e) { }

            @Override
            public void keyPressed(final KeyEvent e) {
                if (e.getKeyCode() == GO_LEFT) {
                    spaceship.moveLeft();
                    System.out.println("izquierda");
                    ship.setBounds(spaceship.getPosX(), POS_Y, SIZE_IMAGE, SIZE_IMAGE);
                }
                if (e.getKeyCode() == GO_RIGHT) {
                    spaceship.moveRight();
                    System.out.println("derecha");
                    ship.setBounds(spaceship.getPosX(), POS_Y, SIZE_IMAGE, SIZE_IMAGE);
                }
            }

            @Override
            public void keyReleased(final KeyEvent e) { }

        };
        panel.addKeyListener(keyEvent);
    }
}
