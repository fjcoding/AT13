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
    private static boolean switchBullet = false;
    private static Bullet bullet;
    private static Bullet bulletFromAlien;
    private static int actualPositionX;
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
        spaceship = new Spaceship(SCALE_WIDTH / 2, SCALE_HEIGHT - 2, 0, SCALE_WIDTH);
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
                    shootFromRamdonAlien();
                    bulletShotAnimation2();
                    if (switchBullet) {
                        bulletShotAnimation();
                        collisionBulletToAlien();
                    }
                }
                tic += 1;
            }
        };
        timer.scheduleAtFixedRate(task, 0, DELAY_OF_CYCLE_IN_MILISECONDS);
    }

    /** */
    public void collisionBulletToAlien() {
        for (Alien alien : alienGroup.getAliens()) {
            if (alien.getPosY() == bullet.getPositionY() && alien.getPosX() == actualPositionX && alien.getAlive()) {
                /* System.out.println("colision : (" + alien.getPosY() + " " + bullet.getPositionY() + " ),( "
                        + alien.getPosX() + " " + actualPositionX + " ) "); */
                bullet.finishBull();
                switchBullet = false;
                alien.die();
            }
        }
        System.out.println("----------------------------");
    }

    /**
     * Method to show and move the bullet.
     */
    public void bulletShotAnimation() {
        if (bullet.getPositionY() < spaceship.getPosY()) {
            cleanBullet();
        }
        bullet.shootAlien();
        if (bullet.getPositionY() == -1) {
            bullet.finishBull();
            switchBullet = false;
        }
        refreshBullet();
    }

    /**
     * Method to show and move the bullet.
     */
    public void bulletShotAnimation2() {
        cleanBullet2();
        System.out.println("bullet : (" + bulletFromAlien.getPositionY() + ", " + bulletFromAlien.getPositionX()+" )");
        bulletFromAlien.setPositionY(bulletFromAlien.getPositionY() + 1);
        /* bulletFromAlien.shootSpaceship(); */
        /* bulletFromAlien.movingBulletDown(); */
        if (bulletFromAlien.getPositionY() == SCALE_HEIGHT - 1) {
            bulletFromAlien = null;
        }else {
            System.out.println("bullet : (" + bulletFromAlien.getPositionY() + ", " + bulletFromAlien.getPositionX()+" )");
            refreshBullet2();
        }
    }

    /**
     * Refresh the icon of a label where it is our spaceship.
     */
    public void refreshBullet2() {

        ImageIcon iconBullet = new ImageIcon("resources/abullet.png");
        labelArray[bulletFromAlien.getPositionY()][bulletFromAlien.getPositionX()].setIcon(iconBullet);
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
     * Clean the icon of a label where it was our spaceship.
     */
    public void cleanBullet2() {
        labelArray[bulletFromAlien.getPositionY()][bulletFromAlien.getPositionX()].setIcon(null);
    }

    /**
     * Refresh the icon of a label where it is our spaceship.
     */
    public void refreshSpace() {
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
    public void cleanSpace() {
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
        for (Alien alien : alienGroup.getAliens()) {
            if (alien.getAlive()) {
                ImageIcon iconLogo = new ImageIcon("resources/alien.png");
                labelArray[alien.getPosY()][alien.getPosX()].setIcon(iconLogo);

            }
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

    /** */
    public void shootFromRamdonAlien() {
        if (bulletFromAlien == null) {
            int fromAlien = (int)(Math.random() * (alienGroup.getAliens().size() - 1));
            System.out.println("nro random: " + fromAlien);
            System.out.print("aliesn x: " + alienGroup.getAliens().get(fromAlien).getPosX() + " ");
            System.out.println("y: " + alienGroup.getAliens().get(fromAlien).getPosY());
            while (!alienGroup.getAliens().get(fromAlien).getAlive()) {
                fromAlien = (int)(Math.random() * (alienGroup.getAliens().size() - 1));    
            }
            bulletFromAlien = alienGroup.getAliens().get(fromAlien).shoot();
            System.out.println("alien soot : (" + bulletFromAlien.getPositionY() + "," + bulletFromAlien.getPositionX()+" )");
        }
    }
}
