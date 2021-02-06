package org.fundacionjala.at13.spaceinvaders;
import java.util.ArrayList;

public class AlienGroup {
    private static int numberOfAlienRows;
    private static int numberOfAlienColumns;
    private ArrayList<Alien> alienGroup;
    /**
     * Class AlienGroup.
     */
    public AlienGroup(final int rows, final int columns) {
        numberOfAlienRows = rows;
        numberOfAlienColumns = columns;
        alienGroup = new ArrayList<Alien>();
        addAliens();
    }
    /**
     * Method to add aliens.
     */
    public void addAliens() {
        for (int row = 0; row < numberOfAlienRows; row++) {
            for (int col = 0; col < numberOfAlienColumns; col++) {
                Alien alien = new Alien(col, row);
                alienGroup.add(alien);
            }
        }
    }
    /**
     * @return arrayList of all aliens contained.
     */
    public ArrayList getAliens() {
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
}
