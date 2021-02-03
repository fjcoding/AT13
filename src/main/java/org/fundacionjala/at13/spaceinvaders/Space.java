package org.fundacionjala.at13.spaceinvaders;

public class Space {

    public static final String EMPTY = ".";
    public static final int DEFAULT_HEIGHT = 50;
    public static final int DEFAULT_WIDTH = 100;

    private int height;
    private int width;

    public Space(final int heightToSet, final int widthToSet) {
        this.height = heightToSet;
        this.width = widthToSet;
    }

    /**
     * Method that returns a String representation of the space.
     */
    public String[][] show() {
        String[][] space = new String[height][width];
        for (int i = 0; i < space.length; i++) {
            for (int j = 0; j < space[i].length; j++) {
                space[i][j] = EMPTY;
            }
        }
        return space;
    }
}
