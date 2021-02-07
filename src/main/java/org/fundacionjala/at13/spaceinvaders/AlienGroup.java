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
                Alien alien = new Alien(col, row, Space.INITIAL_RANGE, Space.DEFAULT_WIDTH);
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
}
