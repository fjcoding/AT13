package org.fundacionjala.at13.spaceinvaders;

import java.awt.*;
import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

public class GameBoard extends JFrame implements KeyListener {

    private static final int SIZE_IMAGE = 40;
    private static final int SCALE_WIDTH = Space.DEFAULT_WIDTH;
    private static final int SCALE_HEIGHT = Space.DEFAULT_HEIGHT;
    private static final int SIZE_WINDOW_WIDTH = SCALE_WIDTH * SIZE_IMAGE;
    private static final int SIZE_WINDOW_HEIGHT = SCALE_HEIGHT * SIZE_IMAGE;

    private static JLabel[][] labelArray;
    private Spaceship spaceship;
    private Alien alien;
    private Alien alien2;
    private ArrayList<Alien> aliensList;
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
//        spaceAlien();
//        spaceArrayAlien();
       spaceAlienGroup();
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
     * Method to initialize and show the alien.
     */
    public void spaceArrayAlien() {
        aliensList = new ArrayList<>();
        int xInitial = 0;
        for (int i = 0; i < 5 ; i++) {
            aliensList.add(new Alien(xInitial+i, 0  , 0, SCALE_WIDTH));
        }
        refreshArrayAlien();
    }

    /**
     * Method to initialize and show the alien group.
     */
    public void spaceAlienGroup() {
       alienGroup = new AlienGroup(3,5);
       refreshAlienGroup();
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
//            alien.moveLeft();
//            moveArrayAlienLeft();
            spaceship.moveLeft();
            refresh();
            //refreshAlien();
//            refreshArrayAlien();
            refreshAlienGroup();
        }
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            clean();
            //alien.moveRight();
            moveArrayAlienRight();
            spaceship.moveRight();
            refresh();
//            refreshAlien();
//            refreshArrayAlien();
            refreshAlienGroup();
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
     * Refresh the icon of a label where it is our Alien.
     * */
    public void refreshArrayAlien() {
        for (Alien alien : aliensList) {
            ImageIcon iconLogo = new ImageIcon("resources/alien.png");
            labelArray[alien.getPosY()][alien.getPosX()].setIcon(iconLogo);
        }

    }

    /**
     * Refresh the icon of a label where it is our Alien.
     * */
    public void refreshAlienGroup() {
        for (Alien alien : alienGroup.getAliens()) {
            ImageIcon iconLogo = new ImageIcon("resources/alien.png");
            labelArray[alien.getPosY()][alien.getPosX()].setIcon(iconLogo);
        }

    }

    /**
     * Clean the icon of a label where it was our spaceship.
     * */
    public void clean() {
        labelArray[spaceship.getPosY()][spaceship.getPosX()].setIcon(null);
//        labelArray[alien.getPosY()][alien.getPosX()].setIcon(null);
        cleanArrayAlien();
    }

    public void moveArrayAlienLeft() {
        for (Alien alien : aliensList) {
            alien.moveLeft();
        }
    }
    public void moveArrayAlienRight() {
        for (Alien alien : aliensList) {
            alien.moveRight();
        }
    }

    public void moveAlienGroup() {
//        for (Alien alien : alienGroup.getAliens()) {
//            ImageIcon iconLogo = new ImageIcon("resources/alien.png");
//            labelArray[alien.getPosY()][alien.getPosX()].setIcon(iconLogo);
//        }
        alienGroup.moveAliens();
    }

    public void cleanArrayAlien() {
        for (Alien alien : aliensList) {
            labelArray[alien.getPosY()][alien.getPosX()].setIcon(null);
        }
    }



}
