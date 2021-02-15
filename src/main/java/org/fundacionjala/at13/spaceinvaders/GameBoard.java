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
    public static final int NUMBER_OF_CYCLES_ALIENS_WAIT_TO_MOVE = 50;
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
        alienGroup = new AlienGroup(NUMBER_OF_ALIEN_ROWS, NUMBER_OF_ALIEN_COLUMNS);
        aliens = alienGroup.getAliens();
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
        addKeyListener(this);
        start();
        startAlienGroup();
    }

    /**
     * Method to initialize and show the spaceShip.
     */
    public void spaceShip() {
        spaceship = new Spaceship(SCALE_WIDTH / 2, SCALE_HEIGHT - 2, 0, SCALE_WIDTH);
        bullet = spaceship.shoot();
        refresh();
    }

    /**
     * Method to initialize timer.
     */
    public void start() {
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                if (tic % VELOCITY_GROUP_ALIEN == 0) {
                    tic /= NUMBER_HUNDRED;
                }
                if (tic % VELOCITY_SHOOT_BULLET == 0) {
                    if (switchBullet) {
                        bulletShotAnimation();
                        System.out.println(actualPositionX + " " + actualPositionY);
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
        labelArray[bullet.getPositionY()][actualPositionX].setIcon(null);
        bullet.shootAlien();
        if (bullet.getPositionY() == -1) {
            bullet.finishBull();
            actualPositionY = SCALE_HEIGHT - 1;
            switchBullet = false;
        }
        refresh();
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
        if (e.getKeyCode() == KeyEvent.VK_SPACE) {
            if (!switchBullet) {
                actualPositionX = spaceship.getPosX();
            }
            switchBullet = true;
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
     */
    public void refresh() {
        ImageIcon iconLogo = new ImageIcon("resources/spaceship.png");
        labelArray[spaceship.getPosY()][spaceship.getPosX()].setIcon(iconLogo);
        if (switchBullet) {
            System.out.println("paso por bullet animation refres");
            ImageIcon iconBullet = new ImageIcon("resources/sbullet.png");
            labelArray[bullet.getPositionY()][actualPositionX].setIcon(iconBullet);
        }
        for (int row = 0; row < SCALE_HEIGHT; row++) {
            for (int col = 0; col < SCALE_WIDTH; col++) {
                if (checkIfThereIsAlienInThisPos(row, col)) {
                    iconLogo = new ImageIcon("resources/alien.png");
                    labelArray[row][col].setIcon(iconLogo);
                }
            }
        }
        if (spaceship.getAlive()) {
            for (int drawnHeart = 0; drawnHeart < spaceship.getNumbersLife(); drawnHeart++) {
                iconLogo = new ImageIcon("resources/heart.png");
                labelArray[SCALE_HEIGHT - 1][drawnHeart].setIcon(iconLogo);
            }
        }
    }

    /**
     * Clean the icon of a label where it was our spaceship.
     */
    public void clean() {
        labelArray[spaceship.getPosY()][spaceship.getPosX()].setIcon(null);
    }
    /**
     * Given a pos X and Y, compares with every alien in array to check if there is a coincidence.
     */
    public boolean checkIfThereIsAlienInThisPos(final int rowToCheck, final int colToCheck) {
        for (Alien alien : aliens) {
            if (alien.getPosX() == colToCheck && alien.getPosY() == rowToCheck) {
                return true;
            }
        }
        return false;
    }
    /**
     * Refresh the icon of a label where it is our spaceship.
     *
     */
    public void refreshBullet() {
        //labelArray[bullet.getPositionY()][bullet.getPositionX()].setIcon(null);
        ImageIcon iconLogo = new ImageIcon("resources/shot.gif");
        labelArray[bullet.getPositionY()][bullet.getPositionX()].setIcon(iconLogo);
    }
    /**
     * Method to initialize and show the alien group.
     */
    public void spaceAlienGroup() {
        alienGroup = new AlienGroup(ALIEN_ROWS, ALIEN_COLUMNS);
        refreshAlienGroup();
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
     * Starts the timer task to repeat the updates to the panel.
     */
    public void startAlienGroup() {
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
