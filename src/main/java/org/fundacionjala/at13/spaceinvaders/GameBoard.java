package org.fundacionjala.at13.spaceinvaders;

import java.awt.*;
import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.TimerTask;
import java.util.Timer;
import java.util.ArrayList;

public class GameBoard extends JFrame implements KeyListener {

    private static final int SIZE_IMAGE = 40;
    private static final int SCALE_WIDTH = Space.DEFAULT_WIDTH;
    private static final int SCALE_HEIGHT = Space.DEFAULT_HEIGHT;
    private static final int SIZE_WINDOW_WIDTH = SCALE_WIDTH * SIZE_IMAGE;
    private static final int SIZE_WINDOW_HEIGHT = SCALE_HEIGHT * SIZE_IMAGE;
    private static final int NUMBER_HUNDRED = 100;
    private ArrayList<Alien> aliens;
    private AlienGroup alienGroup;
    public static final int NUMBER_OF_ALIEN_COLUMNS = 5;
    public static final int NUMBER_OF_ALIEN_ROWS = 3;
    private static JLabel[][] labelArray;
    private Spaceship spaceship;
    private Timer timer;
    private int tic;
    public static final int DELAY_OF_CYCLE_IN_MILISECONDS = 10;
    public static final int VELOCITY_GROUP_ALIEN = 50;
    public static final int VELOCITY_SHOOT_BULLET = 40;
    private static boolean switchBullet = false;
    private static Bullet bullet;
    private static int actualPositionX;
    private static int actualPositionY = SCALE_HEIGHT - 1;
    private static final int ALIEN_ROWS = 3;
    private static final int ALIEN_COLUMNS = 5;
    public static final int TIK = 100;

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
        spaceAlienGroup();
        addKeyListener(this);
        start();
    }

    /**
     * Method to initialize and show the spaceShip.
     */
    public void spaceShip() {
        spaceship = new Spaceship(SCALE_WIDTH / 2, SCALE_HEIGHT - 1, 0, SCALE_WIDTH);
        bullet = spaceship.shoot();
        refreshSpace();
    }

    /**
     * Method to initialize timer.
     */
    public void start() {
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                if (tic % VELOCITY_GROUP_ALIEN == 0) {
                    cleanAlienGroup();
                    alienGroup.moveAliens();
                    refreshAlienGroup();
                    tic /= NUMBER_HUNDRED;
                }
                if (tic % VELOCITY_SHOOT_BULLET == 0) {
                    if (switchBullet) {
                        bulletShotAnimation();
                    }
                }
                tic += 1;
            }
        };
        timer.scheduleAtFixedRate(task, 0, DELAY_OF_CYCLE_IN_MILISECONDS);
    }

    /**
     * Method to show and move the bullet.
     */
    public void bulletShotAnimation() {

        if (bullet.getPositionY() < spaceship.getPosY()) {
            cleanBullet();
        }
        bullet.isShootingToAlien();
        if (bullet.getPositionY() == -1) {
            bullet.finishBull();
            switchBullet = false;
        }
        refreshBullet();
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
     */
    public void refreshBullet() {

        if (switchBullet) {
            ImageIcon iconBullet = new ImageIcon("resources/sbullet.png");
            labelArray[bullet.getPositionY()][actualPositionX].setIcon(iconBullet);
        }

    }

    /**
     * Clean the icon of a label where it was our spaceship.
     */
    public void cleanBullet() {
        labelArray[bullet.getPositionY()][actualPositionX].setIcon(null);
    }

    /**
     * Refresh the icon of a label where it is our spaceship.
     */
    public void refreshSpace() {
        ImageIcon iconLogo = new ImageIcon("resources/spaceship.png");
        labelArray[spaceship.getPosY()][spaceship.getPosX()].setIcon(iconLogo);
    }

    /**
     * Clean the icon of a label where it was our spaceship.
     */
    public void cleanSpace() {
        labelArray[spaceship.getPosY()][spaceship.getPosX()].setIcon(null);
    }

    /**
     * Method to initialize and show the alien group.
     */
    public void spaceAlienGroup() {
        alienGroup = new AlienGroup(NUMBER_OF_ALIEN_ROWS, NUMBER_OF_ALIEN_COLUMNS);
        aliens = alienGroup.getAliens();
        refreshAlienGroup();
    }

    /**
     * Refresh the icon of a label where it is our Alien.
     */
    public void refreshAlienGroup() {
        for (Alien alien : alienGroup.getAliens()) {
            ImageIcon iconLogo = new ImageIcon("resources/alien.png");
            labelArray[alien.getPosY()][alien.getPosX()].setIcon(iconLogo);
        }
    }

    /**
     * Clean the icon of a label where it was our alienGroup.
     */
    public void cleanAlienGroup() {
        for (Alien alien : alienGroup.getAliens()) {
            labelArray[alien.getPosY()][alien.getPosX()].setIcon(null);
        }
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
            cleanSpace();
            spaceship.moveLeft();
            refreshSpace();
        }
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            cleanSpace();
            spaceship.moveRight();
            refreshSpace();
        }
        if (e.getKeyCode() == KeyEvent.VK_SPACE) {
            if (!switchBullet) {
                actualPositionX = spaceship.getPosX();
            }
            switchBullet = true;
        }
    }
}
