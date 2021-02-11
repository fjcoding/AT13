package org.fundacionjala.at13.spaceinvaders;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.EventListener;
import java.util.TimerTask;
import java.util.Timer;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class Space extends JPanel implements KeyListener, EventListener {

    public static final String SPACE_LABEL = "Space";
    public static final String SPACESHIP_LABEL = "Spaceship";
    public static final String ALIEN_LABEL = "Alien";
    public static final String BULLET_LABEL = "Bullet";
    public static final int DEFAULT_HEIGHT = 20;
    public static final int DEFAULT_WIDTH = 30;
    public static final int INITIAL_RANGE = 0;
    public static final int SPACESHIP_INITIAL_X_POS = 5;
    public static final int SPACESHIP_INITIAL_Y_POS = 19;
    public static final int NUMBER_OF_ALIEN_COLUMNS = 5;
    public static final int NUMBER_OF_ALIEN_ROWS = 3;
    public static final int NUMBER_OF_CYCLES_ALIENS_WAIT_TO_MOVE = 50;
    public static final int NUMBER_OF_CYCLES_ALIENS_WAIT_TO_SHOOT = 40;
    public static final int DELAY_OF_CYCLE_IN_MILISECONDS = 10;
    private Spaceship spaceship;
    private AlienGroup alienGroup;
    private ArrayList<Alien> aliens;
    private int height;
    private int width;
    private static JLabel[][] space;
    private Timer timer;
    private int tic;

    public Space(final int heightToSet, final int widthToSet) {
        this.setFocusable(true);
        this.height = heightToSet;
        this.width = widthToSet;
        initializeSpace();
    }
    /**
     * Add grids to the panel and initialize objects.
     */
    public void initializeSpace() {
        timer = new Timer();
        spaceship = new Spaceship(SPACESHIP_INITIAL_X_POS, SPACESHIP_INITIAL_Y_POS, INITIAL_RANGE, DEFAULT_WIDTH);
        alienGroup = new AlienGroup(NUMBER_OF_ALIEN_ROWS, NUMBER_OF_ALIEN_COLUMNS);
        aliens = alienGroup.getAliens();
        space = new JLabel[DEFAULT_HEIGHT][DEFAULT_WIDTH];
        setLayout(new GridLayout(DEFAULT_HEIGHT, DEFAULT_WIDTH, 0, 0));
        for (int row = 0; row < DEFAULT_HEIGHT; row++) {
            for (int col = 0; col < DEFAULT_WIDTH; col++) {
                JLabel label = new JLabel();
                label.setName(SPACE_LABEL);
                label.setOpaque(true);
                label.setBackground(Color.black);
                space[row][col] = label;
                add(label);
            }
        }
        //fillGridsWithLabels();
        this.addKeyListener(this);
        start();
    }
    /**
     * Create labels for the panel grids and add them.
     */
    public void fillGridsWithLabels() {
    }
    /**
     * Starts the timer task to repeat the updates to the panel.
     */
    public void start() {
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                if (tic % NUMBER_OF_CYCLES_ALIENS_WAIT_TO_MOVE == 0) {
                    alienGroup.moveAliens();
                    tic /= 100;
                }
                if (tic % NUMBER_OF_CYCLES_ALIENS_WAIT_TO_SHOOT == 0) {
                   
                }
                tic += 1;
                updateSpace();
            }
        };
        //updateSpace();
        timer.scheduleAtFixedRate(task, 0, DELAY_OF_CYCLE_IN_MILISECONDS);
    }
    /**
     * Updates the grids with the images according to the latest moves.
     */
    public void updateSpace() {
        clearSpace();
        for (int row = 0; row < DEFAULT_HEIGHT; row++) {
            for (int col = 0; col < DEFAULT_WIDTH; col++) {
                if (row == spaceship.getPosY() && col == spaceship.getPosX()) {
                    ImageIcon iconLogo = new ImageIcon("src/resources/spaceship.png");
                    space[row][col].setIcon(iconLogo);
                }
                if (checkIfThereIsAlienInThisPos(row, col)) {
                    ImageIcon iconLogo = new ImageIcon("src/resources/alien.png");
                    space[row][col].setIcon(iconLogo);
                }
            }
        }
    }
    /**
     * Removes images from labels.
     */
    public void clearSpace() {
        for (int row = 0; row < DEFAULT_HEIGHT; row++) {
            for (int col = 0; col < DEFAULT_WIDTH; col++) {
                space[row][col].setIcon(null);
            }
        }
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
     * Changes the corresponding grid to a spaceship image.
     */
    public void updateSpaceship() {
        for (int row = 0; row < DEFAULT_HEIGHT; row++) {
            for (int col = 0; col < DEFAULT_WIDTH; col++) {
                if (row == spaceship.getPosY() && col == spaceship.getPosX()) {
                    ImageIcon iconLogo = new ImageIcon("src/resources/spaceship.png");
                    space[row][col].setIcon(iconLogo);
                }
            }
        }
    }
    /**
     * Changes the corresponding grids to the alien image.
     */
    public void updateAlienGroup() {
        //ArrayList<Alien> alienList = aliens.getAliens();

    }
    /**
     * Sets a new spaceship for this space instance
     */
    public void setSpaceship(final Spaceship newSpaceship) {
        this.spaceship = newSpaceship;
    }

    /**
     * Sets a new spaceship for this space instance
     */
    public void setAlien(final ArrayList<Alien> arrayList) {
        this.aliens = arrayList;
    }

    /**
     * Sets a new spaceship for this space instance
     */
    public void setBullet(final Bullet newBullet) {
        //this.bullet = newBullet;
    }

    /**
     * Method that returns a String representation of the space.
     */
    public void show() {

    }
    /**
     * @Override keyTyped.
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
            spaceship.moveLeft();
            // ship.setBounds(spaceship.getPosX(), POS_Y, SIZE_IMAGE, SIZE_IMAGE);
        }
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            spaceship.moveRight();
            // ship.setBounds(spaceship.getPosX(), POS_Y, SIZE_IMAGE, SIZE_IMAGE);
        }
    }
    /**
     * @Override keyReleased.
    */
    @Override
    public void keyReleased(final KeyEvent e) {
        return;
    }
}
