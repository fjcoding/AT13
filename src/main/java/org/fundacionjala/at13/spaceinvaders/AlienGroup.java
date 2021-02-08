package org.fundacionjala.at13.spaceinvaders;
import java.util.ArrayList;

public class AlienGroup {
    private static int numberOfAlienRows;
    private static int numberOfAlienColumns;
    private static ArrayList<Alien> alienGroup;
    private boolean directionIsTowardsRight = true;
    private static final int SPACE_SIZE_HEIGHT = 10;
    private static final int SPACE_SIZE_WIDTH = 15;
    private static final int SPACESHIP_ROW_LIMIT = 3;
    private int groupLeftLimit;
    private int groupRightLimit;
    private int groupDownLimit;
    /**
     * Class AlienGroup.
     */
    public AlienGroup(final int rows, final int columns) {
        numberOfAlienRows = rows;
        numberOfAlienColumns = columns;
        groupDownLimit = rows - 1;
        groupLeftLimit = 0;
        groupRightLimit = columns - 1;
        alienGroup = new ArrayList<Alien>();
        addAliens();
    }
    /**
     * Method to add aliens.
     */
    public void addAliens() {
        for (int row = 0; row < numberOfAlienRows; row++) {
            for (int col = 0; col < numberOfAlienColumns; col++) {
                Alien alien = new Alien(col, row, Space.INITIAL_RANGE, Space.DEFAULT_WIDTH);
                alienGroup.add(alien);
            }
        }
    }
    /**
     * @return arrayList of all aliens contained.
     */
    public ArrayList<Alien> getAliens() {
        return alienGroup;
    }
    /**
     * Method to move aliens to the right.
     */
    public void aliensMoveRight() {
        for (Alien alien : alienGroup) {
            alien.moveRight();
        }
    }
    /**
     * Method to move aliens to the left.
     */
    public void aliensMoveLeft() {
        for (Alien alien : alienGroup) {
            alien.moveLeft();
        }
    }
    /**
     * Method to move aliens towards down.
     */
    public void aliensMoveDown() {
        for (Alien alien : alienGroup) {
            alien.moveDown();
        }
    }
    /**
     * @return a boolean when the group reached the spaceship.
     */
    public boolean gotToTheSpaceship() {
        return this.groupDownLimit > SPACE_SIZE_HEIGHT - SPACESHIP_ROW_LIMIT;
    }
    /**
     * method to change the directionIsTowardsRight variable.
     */
    public void setdirectionIsTowardsRight() {
        this.directionIsTowardsRight = !directionIsTowardsRight;
    }
    /**
     * method to get groupDownLimit.
     * @return an int with the groupDownLimit.
     */
    public int getgroupDownLimit() {
        return this.groupDownLimit;
    }
    /**
     * Set the new right limit of the group.
     * @return an int with the groupRightLimit.
     */
    public int getGroupRightLimit() {
        return this.groupRightLimit;
    }
    /**
     * Set the new left limit of the group.
     * @return an int with the groupLeftLimit.
     */
    public int getGroupLeftLimit() {
        return this.groupLeftLimit;
    }
    /**
     * Method to move all aliens
     */
    public void moveAliens() {
        if (!gotToTheSpaceship()) {
            if (!directionIsTowardsRight) {
                if (this.groupLeftLimit == 0) {
                    aliensMoveDown();
                    setdirectionIsTowardsRight();
                    this.groupDownLimit += 1;
                } else {
                    aliensMoveLeft();
                    this.groupRightLimit -= 1;
                    this.groupLeftLimit -= 1;
                }
            } else {
                if (this.groupRightLimit == SPACE_SIZE_WIDTH - 1) {
                    aliensMoveDown();
                    this.groupDownLimit += 1;
                    setdirectionIsTowardsRight();
                } else {
                    aliensMoveRight();
                    this.groupRightLimit += 1;
                    this.groupLeftLimit += 1;
                }
            }
        }
    }
}

