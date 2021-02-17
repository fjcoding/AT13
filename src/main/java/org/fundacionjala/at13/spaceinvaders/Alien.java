package org.fundacionjala.at13.spaceinvaders;
public class Alien extends SpaceElement {

    public static final int DEFAULT_POSX = 25;
    public static final int DEFAULT_POSY = 28;

    public Alien(final int pX, final int pY, final int llimit, final int ulimit) {
        super(pX, pY, llimit, ulimit);
    }

    /**
     * @return a Bullet with position x and y where it shooted by Alien.
     */
    public Bullet shoot() {
        return new Bullet(this);
    }

    /**
     * Description: Less one position to posY in order to move down.
     */
    public void moveDown() {
        setPosY(getPosY() + 1);
    }

}
