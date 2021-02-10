package org.fundacionjala.at13.spaceinvaders;

public class Spaceship extends SpaceElement {

    public static final int DEFAULT_POSX = 0;
    public static final int DEFAULT_POSY = 0;
    private int score;
    public static final int VALUE = 30;

    public Spaceship(final int pX, final int pY, final int llimit, final int ulimit) {
        super(pX, pY, llimit, ulimit);
        this.score = 0;
    }

    /**
     * @return a Bullet with position x and y where it shooted by Spaceship.
     */
    public Bullet shoot() {
        return new Bullet(this);
    }

    /**
     * Increase 30 to score value ofSpaceship..
     */
    public void increaseScore() {
        this.score += VALUE;
    }

    /**
     * @return a score value ofSpaceship.
     */
    public int getScore() {
        return this.score;
    }
}
