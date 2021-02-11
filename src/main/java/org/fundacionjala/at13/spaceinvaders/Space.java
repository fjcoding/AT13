package org.fundacionjala.at13.spaceinvaders;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.EventListener;
import javax.swing.JLabel;

public class Space {

    public static final String SPACE_LABEL = "Space";
    public static final String SPACESHIP_LABEL = "Spaceship";
    public static final String ALIEN_LABEL = "Alien";
    public static final String BULLET_LABEL = "Bullet";
    private Spaceship spaceship;
    private AlienGroup alienGroup;
    private ArrayList<Alien> aliens;
    private static String[][] space;
    private static JLabel[][] grids;

    public Space() {
        initializeSpace();
    }
    /**
     * Add grids to the panel and initialize objects.
     */
    public void initializeSpace() {
        spaceship = new Spaceship(Constants.SPACESHIP_INITIAL_X_POS, Constants.SPACESHIP_INITIAL_Y_POS, Constants.INITIAL_RANGE, Constants.SPACE_SIZE_WIDTH);
        alienGroup = new AlienGroup(Constants.NUMBER_OF_ALIEN_ROWS, Constants.NUMBER_OF_ALIEN_COLUMNS);
        aliens = alienGroup.getAliens();
        Gameboard gameboard = new Gameboard();
        space = new String [Constants.SPACE_SIZE_HEIGHT][Constants.SPACE_SIZE_WIDTH];
        for (int row = 0; row < Constants.SPACE_SIZE_HEIGHT; row++) {
            for (int col = 0; col < Constants.SPACE_SIZE_WIDTH; col++) {
                space[row][col] = SPACE_LABEL;
            }
        }
    }
    /**
     * Updates the grids with the images according to the latest moves.
     */
    public void updateSpace() {
        clearSpace();
        for (int row = 0; row < Constants.SPACE_SIZE_HEIGHT; row++) {
            for (int col = 0; col < Constants.SPACE_SIZE_WIDTH; col++) {
                if (row == spaceship.getPosY() && col == spaceship.getPosX()) {
                    space[row][col] = SPACESHIP_LABEL;
                }
                if (checkIfThereIsAlienInThisPos(row, col)) {
                    space[row][col] = ALIEN_LABEL;
                }
            }
        }
    }
    /**
     * Removes images from labels.
     */
    public void clearSpace() {
        for (int row = 0; row < Constants.SPACE_SIZE_HEIGHT; row++) {
            for (int col = 0; col < Constants.SPACE_SIZE_WIDTH; col++) {
                space[row][col] = SPACE_LABEL;
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
    public String[][] getMatrix() {
        return space;
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
}
