package org.fundacionjala.at13.spaceinvaders;
public class Alien extends SpaceElement {

    public static final int DEFAULT_POSX = 25;
    public static final int DEFAULT_POSY = 48;

    public Alien(final int pX, final int pY, final int llimit, final int ulimit) {
        super(pX, pY, llimit, ulimit);
    }

    /**
     * @return a Bullet with position x and y where it shooted by Alien.
     */
    public Bullet shoot() {
        return new Bullet(Space.ALIEN, getPosX(), getPosY());
    }

}
