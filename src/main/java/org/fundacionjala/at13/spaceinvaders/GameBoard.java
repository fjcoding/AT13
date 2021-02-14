package org.fundacionjala.at13.spaceinvaders;

import java.awt.*;
import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.TimerTask;
import java.util.Timer;

public class GameBoard extends JFrame implements KeyListener {

    private static final int SIZE_IMAGE = 40;
    private static final int SCALE_WIDTH = Space.DEFAULT_WIDTH;
    private static final int SCALE_HEIGHT = Space.DEFAULT_HEIGHT;
    private static final int SIZE_WINDOW_WIDTH = SCALE_WIDTH * SIZE_IMAGE;
    private static final int SIZE_WINDOW_HEIGHT = SCALE_HEIGHT * SIZE_IMAGE;
    private static final int ALIEN_ROWS = 3;
    private static final int ALIEN_COLUMNS = 5;
    public static final int NUMBER_OF_CYCLES_ALIENS_WAIT_TO_MOVE = 50;
    public static final int TIK = 100;
    public static final int NUMBER_OF_CYCLES_ALIENS_WAIT_TO_SHOOT = 40;
    public static final int DELAY_OF_CYCLE_IN_MILISECONDS = 10;
    private static JLabel[][] labelArray;
    private Spaceship spaceship;
    private Alien alien;
    private Alien alien2;
    private ArrayList<Alien> aliensList;
    private AlienGroup alienGroup;
    private Timer timer;
    private int tic;
    public GameBoard() {

    }

    /**
     * Method initialize the graphical interface.
     */
    public void init() {
        timer = new Timer();
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
        start();


    }

    /**
     * Method to initialize and show the spaceShip.
     */
    public void spaceShip() {
        spaceship = new Spaceship(SCALE_WIDTH / 2, SCALE_HEIGHT - 1, 0, SCALE_WIDTH);
        refresh();
    }



    /**
     * Method to initialize and show the alien group.
     */
    public void spaceAlienGroup() {
       alienGroup = new AlienGroup(ALIEN_ROWS, ALIEN_COLUMNS);
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
            spaceship.moveLeft();
            refresh();
        }
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            clean();
            spaceship.moveRight();
            refresh();
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
    public void refreshAlienGroup() {
        cleanAlienGroup();
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
    }


    /**
     * Starts the timer task to repeat the updates to the panel.
     */
    public void start() {
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                cleanAlienGroup();
                if (tic % NUMBER_OF_CYCLES_ALIENS_WAIT_TO_MOVE == 0) {
                    alienGroup.moveAliens();
                    tic /= TIK;
                }
                tic += 1;

                refreshAlienGroup();
            }
        };
        timer.scheduleAtFixedRate(task, 0, DELAY_OF_CYCLE_IN_MILISECONDS);
    }

    /**
     * Clean the icon of a label where it was our alienGroup.
     * */
    public void cleanAlienGroup() {
        for (Alien alien : alienGroup.getAliens()) {
            labelArray[alien.getPosY()][alien.getPosX()].setIcon(null);
        }
    }
}
