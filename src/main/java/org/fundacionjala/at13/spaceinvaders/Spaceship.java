package org.fundacionjala.at13.spaceinvaders;

public class Spaceship extends SpaceElement {

    public static final int DEFAULT_POSX = 0;
    public static final int DEFAULT_POSY = 0;
    private static final int FULL_LIFE = 3;
    private int numbersLife = FULL_LIFE;
    public Spaceship(final int pX, final int pY, final int llimit, final int ulimit) {
        super(pX, pY, llimit, ulimit);
    }

    /**
     * @return a Bullet with position x and y where it shooted by Spaceship.
     */
    public Bullet shoot() {
        return new Bullet(this);
    }

    /**
     * @return Ask if spacehip has more than 3 lives
     */
    public void isStillAlive() {
        if (numbersLife > 0) {
            this.numbersLife -= 1;
        }
        if (numbersLife == 0) {
            System.out.print("Game Over");
        }
    }

    /**
     * @return el how many lives spaceship has
     */
    public int getNumbersLife() {
        return numbersLife;
    }
}
