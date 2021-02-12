package org.fundacionjala.at13.spaceinvaders;

import java.awt.*;
import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GameBoard extends JFrame implements KeyListener {

    private static final int SIZE_IMAGE = 40;
    private static final int SCALE_WIDTH = Space.DEFAULT_WIDTH;
    private static final int SCALE_HEIGHT = Space.DEFAULT_HEIGHT;
    private static final int SIZE_WINDOW_WIDTH = SCALE_WIDTH * SIZE_IMAGE;
    private static final int SIZE_WINDOW_HEIGHT = SCALE_HEIGHT * SIZE_IMAGE;

    private static JLabel[][] labelArray;
    private Spaceship spaceship;
    private Alien alien;
    private AlienGroup alienGroup;

    public GameBoard() {

    }

    /**
     * Method initialize the graphical interface.
     */
    public void init() {

        setSize(SIZE_WINDOW_WIDTH, SIZE_WINDOW_HEIGHT);
        setTitle("Space Invaders");
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setFocusable(true);
        labelArray = new JLabel[SCALE_HEIGHT][SCALE_WIDTH];
        setLayout(new GridLayout(SCALE_HEIGHT, SCALE_WIDTH));

        for (int row = 0; row < SCALE_HEIGHT; row++) {
            for (int col = 0; col < SCALE_WIDTH; col++) {
                JLabel label = new JLabel();
                label.setName("Spaceship");
                label.setOpaque(true);
                label.setBackground(Color.black);
                labelArray[row][col] = label;
                add(label);
            }
        }
        spaceShip();
        spaceAlien();
       // spaceAlienGroup();
        addKeyListener(this);
    }

    /**
     * Method to initialize and show the spaceShip.
     */
    public void spaceShip() {
        spaceship = new Spaceship(SCALE_WIDTH / 2, SCALE_HEIGHT - 1, 0, SCALE_WIDTH);
        refresh();
    }

    /**
     * Method to initialize and show the alien.
     */
    public void spaceAlien() {
        alien = new Alien(0, 0  , 0, SCALE_WIDTH);
        refreshAlien();
    }

    /**
     * @Override keyReleased.
    */
    @Override
    public void keyTyped(final KeyEvent e) {
        return;
    }

    /**
     * @Override keyPressed.
    */
    @Override
    public void keyPressed(final KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            clean();
            alien.moveLeft();
            spaceship.moveLeft();
            refresh();
            refreshAlien();
        }
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            clean();
            alien.moveRight();
            spaceship.moveRight();
            refresh();
            refreshAlien();
        }
    }

    /**
    * @Override keyReleased.
    */
    @Override
    public void keyReleased(final KeyEvent e) {
        return;
    }

    /**
     * Refresh the icon of a label where it is our spaceship.
     * */
    public void refresh() {
        ImageIcon iconLogo = new ImageIcon("resources/spaceship.png");
        labelArray[spaceship.getPosY()][spaceship.getPosX()].setIcon(iconLogo);
    }

    /**
     * Refresh the icon of a label where it is our Alien.
     * */
    public void refreshAlien() {
        ImageIcon iconLogo = new ImageIcon("resources/alien.png");
        labelArray[alien.getPosY()][alien.getPosX()].setIcon(iconLogo);
    }

    /**
     * Clean the icon of a label where it was our spaceship.
     * */
    public void clean() {
        labelArray[spaceship.getPosY()][spaceship.getPosX()].setIcon(null);
        labelArray[alien.getPosY()][alien.getPosX()].setIcon(null);
    }
}
