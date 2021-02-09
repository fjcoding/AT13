package org.fundacionjala.at13.spaceinvaders;

public class Spaceship extends SpaceElement {

    public static final int DEFAULT_POSX = 0;
    public static final int DEFAULT_POSY = 0;

    public Spaceship(final int pX, final int pY, final int llimit, final int ulimit) {
        super(pX, pY, llimit, ulimit);
    }

    /**
     * @return a Bullet with position x and y where it shooted by Spaceship.
     */
    public Bullet shoot() {
        return new Bullet(this);
    }
}
