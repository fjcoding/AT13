package org.fundacionjala.at13.spaceinvaders;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.GridLayout;
import java.util.EventListener;
import java.util.TimerTask;
import java.util.Timer;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class Space extends JPanel implements KeyListener, EventListener {

    public static final String SPACE_LABEL = "Space";
    public static final String SPACESHIP_LABEL = "Spaceship";
    public static final int DEFAULT_HEIGHT = 20;
    public static final int DEFAULT_WIDTH = 30;
    public static final int INITIAL_RANGE = 0;
    public static final int SPACESHIP_INITIAL_X_POS = 5;
    public static final int SPACESHIP_INITIAL_Y_POS = 19;
    public static final int NUMBER_OF_CYCLES_ALIENS_WAIT_TO_MOVE = 50;
    public static final int NUMBER_OF_CYCLES_ALIENS_WAIT_TO_SHOOT = 40;
    public static final int DELAY_OF_CYCLE_IN_MILISECONDS = 10;
    public static final int TIK = 100;
    private Spaceship spaceship;
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
        this.addKeyListener(this);
        start();
    }

    /**
     * Starts the timer task to repeat the updates to the panel.
     */
    public void start() {
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                if (tic % NUMBER_OF_CYCLES_ALIENS_WAIT_TO_MOVE == 0) {
                    tic /= TIK;
                }
                tic += 1;
                updateSpace();
            }
        };
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
     * Sets a new spaceship for this space instance
     */
    public void setSpaceship(final Spaceship newSpaceship) {
        this.spaceship = newSpaceship;
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

    /** @return a spaceship from space*/
    public Spaceship getSpaceship() {
        return this.spaceship;
    }
}
