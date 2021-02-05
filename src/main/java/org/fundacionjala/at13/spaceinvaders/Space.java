package org.fundacionjala.at13.spaceinvaders;

public class Space {

    public static final String EMPTY = ".";
    public static final String SPACESHIP = "^";
    public static final int DEFAULT_HEIGHT = 50;
    public static final int DEFAULT_WIDTH = 100;

    private Spaceship spaceship;
    private int height;
    private int width;

    public Space(final int heightToSet, final int widthToSet) {
        this.height = heightToSet;
        this.width = widthToSet;
    }

    /**
     * Sets a new spaceship for this space instance
     */
    public void setSpaceship(final Spaceship newSpaceship) {
        this.spaceship = newSpaceship;
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
        if (this.spaceship != null) {
            int posX = this.spaceship.getPosX();
            int posY = this.spaceship.getPosY();
            PositionElement position = new PositionAdapter().adaptPosition(posX, posY, space.length);
            space[position.getIndexi()][position.getIndexj()] = SPACESHIP;
        }
        return space;
    }
}
