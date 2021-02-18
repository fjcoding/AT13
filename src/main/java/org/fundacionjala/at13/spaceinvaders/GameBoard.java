package org.fundacionjala.at13.spaceinvaders;

import java.awt.*;
import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.TimerTask;
import java.util.Timer;

public class GameBoard extends JFrame implements KeyListener {

    private static final int SIZE_IMAGE = 40;
    private static final int SCALE_WIDTH = Space.DEFAULT_WIDTH;
    private static final int SCALE_HEIGHT = Space.DEFAULT_HEIGHT;
    private static final int SIZE_WINDOW_WIDTH = SCALE_WIDTH * SIZE_IMAGE;
    private static final int SIZE_WINDOW_HEIGHT = SCALE_HEIGHT * SIZE_IMAGE;
    private static final int NUMBER_HUNDRED = 100;
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
    private static boolean switchBulletAlien = false;
    private static Bullet bulletSpaceShip;
    private static Bullet bulletAlien;
    public static final int TIK = 100;
    private final GameOver gameOver = new GameOver();
    private static final int POSITION_MESSAGE_X = 5;
    private static final int POSITION_MESSAGE_POINTS = 12;
    private static int points = 0;
    private static final int FINAL_POINTS = 150;
    private static final int POINTS_BY_ALIEN = 10;

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
        spaceship = new Spaceship(SCALE_WIDTH / 2, SCALE_HEIGHT - 2, 0, SCALE_WIDTH);
        bulletSpaceShip = spaceship.shoot();
        refreshSpaceShip();
        ImageIcon iconPoints = new ImageIcon("resources/points.png");
        labelArray[spaceship.getPosY() + 1][POSITION_MESSAGE_POINTS].setIcon(iconPoints);
        labelArray[spaceship.getPosY() + 1][POSITION_MESSAGE_POINTS + 1].setText(": " + points);
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
                    if (!spaceship.getAlive()) {
                        messageEndGame("Game Over");
                    }
                    if (points == FINAL_POINTS) {
                        messageEndGame("You Win");
                    }
                    shootFromRamdonAlien();
                    bulletAlienShotAnimation();
                    if (bulletSpaceShip.getBulletExist()) {
                        bulletShotAnimation();
                        collisionBulletToAlien();
                    }

                }
                tic += 1;
            }
        };
        timer.scheduleAtFixedRate(task, 0, DELAY_OF_CYCLE_IN_MILISECONDS);
    }

    /**
     * Method to show any message.
     */
    public void messageEndGame(final String message) {
        if (message == "Game Over") {
            gameOver.showGameOver(this, timer);
            repaint();
        }
        if (message == "You Win") {
            ImageIcon iconYou = new ImageIcon("resources/you.png");
            labelArray[spaceship.getPosY() + 1][POSITION_MESSAGE_X].setIcon(iconYou);
            ImageIcon iconWin = new ImageIcon("resources/win.png");
            labelArray[spaceship.getPosY() + 1][POSITION_MESSAGE_X + 1].setIcon(iconWin);
        }

    }

    /**
     * Method to choise a alien to shoot.
     */
    public void shootFromRamdonAlien() {
        if (bulletAlien == null) {
            int fromAlien = (int) (Math.random() * (alienGroup.getAliens().size() - 1));
            while (!alienGroup.getAliens().get(fromAlien).getAlive()) {
                fromAlien = (int) (Math.random() * (alienGroup.getAliens().size() - 1));
            }
            bulletAlien = alienGroup.getAliens().get(fromAlien).shoot();
            bulletAlien.changeBulletExists(true);
            bulletAlien.setUpperLimit(SCALE_HEIGHT - 2);
        }
    }

    /**
     * Method to show and move the bullet the alien.
     */
    public void bulletAlienShotAnimation() {
        if (switchBulletAlien) {
            cleanBulletAlien();
        }
        switchBulletAlien = true;
        bulletAlien.shootSpaceship();
        if (bulletAlien.getBulletExist()) {
            refreshBulletAlien();
            if (bulletAlien.hasHitTheSpaceship(spaceship)) {
                labelArray[SCALE_HEIGHT - 1][spaceship.getNumbersLife()].setIcon(null);
                labelArray[spaceship.getPosY()][spaceship.getPosX()].setIcon(null);
            }
        }
        if (!bulletAlien.getBulletExist()) {
            bulletAlien = null;
            switchBulletAlien = false;
        }
    }

    /**
     * Refresh the icon of a label where it is our spaceship.
     */
    public void refreshBulletAlien() {
        ImageIcon iconBullet = new ImageIcon("resources/abullet.png");
        labelArray[bulletAlien.getPositionY()][bulletAlien.getPositionX()].setIcon(iconBullet);
    }

    /**
     * Clean the icon of a label where it was our spaceship.
     */
    public void cleanBulletAlien() {
        labelArray[bulletAlien.getPositionY()][bulletAlien.getPositionX()].setIcon(null);
    }

    /**
     * Method to check colision the spaceship bullet in a alien
     */
    public void collisionBulletToAlien() {
        for (Alien alien : alienGroup.getAliens()) {
            if (bulletSpaceShip.hasHitTheAlien(alien)) {
                alien.die();
                points += POINTS_BY_ALIEN;
                refresMessagePoints();
            }
        }
    }

    /**
     * Method to show the points message.
     */
    public void refresMessagePoints() {
        labelArray[spaceship.getPosY() + 1][POSITION_MESSAGE_POINTS + 1].setText(": " + points);
    }

    /**
     * Method to show and move the bullet.
     */
    public void bulletShotAnimation() {
        if (bulletSpaceShip.getPositionY() < spaceship.getPosY()) {
            cleanBullet();
        }
        bulletSpaceShip.shootAlien();
        if (bulletSpaceShip.getBulletExist()) {
            refreshBullet();
        }
    }

    /**
     * Refresh the icon of a label where it is our spaceship.
     */
    public void refreshBullet() {

        ImageIcon iconBullet = new ImageIcon("resources/sbullet.png");
        labelArray[bulletSpaceShip.getPositionY()][bulletSpaceShip.getPositionX()].setIcon(iconBullet);
    }

    /**
     * Clean the icon of a label where it was our spaceship.
     */
    public void cleanBullet() {
        labelArray[bulletSpaceShip.getPositionY()][bulletSpaceShip.getPositionX()].setIcon(null);
    }

    /**
     * Refresh the icon of a label where it is our spaceship.
     */
    public void refreshSpaceShip() {
        ImageIcon iconLogo = new ImageIcon("resources/spaceship.png");
        labelArray[spaceship.getPosY()][spaceship.getPosX()].setIcon(iconLogo);

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
    public void cleanSpaceShip() {
        labelArray[spaceship.getPosY()][spaceship.getPosX()].setIcon(null);

    }

    /**
     * Method to initialize and show the alien group.
     */
    public void spaceAlienGroup() {
        alienGroup = new AlienGroup(NUMBER_OF_ALIEN_ROWS, NUMBER_OF_ALIEN_COLUMNS);
        refreshAlienGroup();
    }

    /**
     * Refresh the icon of a label where it is our Alien.
     */
    public void refreshAlienGroup() {
        if (!alienGroup.gotToTheSpaceship()) {
            for (Alien alien : alienGroup.getAliens()) {
                if (alien.getAlive()) {
                    ImageIcon iconLogo = new ImageIcon("resources/alien.png");
                    labelArray[alien.getPosY()][alien.getPosX()].setIcon(iconLogo);

                }
            }
        } else {
            gameOver.showGameOver(this, timer);
            repaint();
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
    public void keyReleased(final KeyEvent e) {
        return;
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

        executeMoveLeft(e.getKeyCode());
        if (e.getKeyCode() == KeyEvent.VK_RIGHT && spaceship.getAlive()) {
            cleanSpaceShip();
            spaceship.moveRight();
            refreshSpaceShip();
        }
        if (e.getKeyCode() == KeyEvent.VK_SPACE) {
            if (!bulletSpaceShip.getBulletExist()) {
                bulletSpaceShip.setPositionX(spaceship.getPosX());
            }
            bulletSpaceShip.changeBulletExists(true);
        }
    }

    /** */
    public void executeMoveLeft(final int keyCode) {
        if (keyCode == KeyEvent.VK_LEFT && spaceship.getAlive()) {
            cleanSpaceShip();
            spaceship.moveLeft();
            refreshSpaceShip();
        }
    }
}
