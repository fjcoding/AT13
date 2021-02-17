package org.fundacionjala.at13.spaceinvaders;

public class Bullet {
    private int positionInitialX;
    private int positionInitialY;
    private boolean bulletExist;
    private int lowerLimit = 0;
    private int upperLimit = 0;

    public Bullet(final Spaceship spaceship) {
        positionInitialX = spaceship.getPosX();
        positionInitialY = spaceship.getPosY();
        bulletExist = false;
        upperLimit = positionInitialY;
    }

    public Bullet(final Alien alien) {
        positionInitialX = alien.getPosX();
        positionInitialY = alien.getPosY();
        bulletExist = false;
        upperLimit = alien.getUpperLimit();
    }

    /**
     * Get te getUpperLimit bullet.
     */
    public int getUpperLimit() {
        return this.upperLimit;
    }

    /**
     * Set te getUpperLimit.
     */
    public void setUpperLimit(final int newUpperLimit) {
        this.upperLimit = newUpperLimit;
    }

    /**
     * Description: The function displays bullet's position initial x.
     *
     * @return a int that shows bullet's position initial x.
     */
    public int getPositionX() {
        return this.positionInitialX;
    }

    /**
     * Description: The function displays bullet's position initial y.
     *
     * @return a int that shows bullet's position initial y.
     */
    public int getPositionY() {
        return this.positionInitialY;
    }

    /**
     * Description: The function verifies if the bullet exists.
     *
     * @return a boolean that verifies if the bullet exists.
     */
    public boolean getBulletExist() {
        return this.bulletExist;
    }

    /**
     * Set te position bullet X.
     */
    public void setPositionX(final int newPositionX) {
        this.positionInitialX = newPositionX;
    }

    /**
     * Set te position bullet Y.
     */
    public void setPositionY(final int newPositionY) {
        this.positionInitialY = newPositionY;
    }

    /**
     * Description: The function changes the state of a bullet.
     */
    public void changeBulletExists(final Boolean newState) {
        this.bulletExist = newState;
    }

    /**
     * Description: The function displays a bullet shoot from the Spaceship.
     */
    public void shootAlien() {
        if (this.bulletExist) {
            movingBulletUp();
        }
    }

    /**
     * Description: The function displays a bullet shoot from the Alien.
     */
    public void shootSpaceship() {
        if (this.bulletExist) {
            movingBulletDown();
        }
    }

    /**
     * Description: The function verifies if the bullet collapses.
     *
     * @return a boolean that verifies if the bullet from Spaceship collapses with
     *         alien.
     */
    public boolean hasHitTheAlien(final Alien alien) {
        if (this.getPositionX() == alien.getPosX() && this.getPositionY() == alien.getPosY() && alien.getAlive()) {
            this.changeBulletExists(false);
            this.setPositionY(upperLimit);
            return true;
        }
        return false;
    }

    /**
     * Description: The function verifies if the bullet collapses.
     *
     * @return a boolean that verifies if the bullet from Alien collapses with
     *         Spaceship.
     */
    public boolean hasHitTheSpaceship(final Spaceship spaceship) {
        if (this.getPositionX() == spaceship.getPosX() && this.positionInitialY == spaceship.getPosY()) {
            this.changeBulletExists(false);
            spaceship.reduceLife();
            return true;
        }
        return false;
    }

    /**
     * Description: The function move the bullet's shoot Up.
     */
    public void movingBulletUp() {
        if (positionInitialY > lowerLimit) {
            positionInitialY -= 1;
        } else {
            this.changeBulletExists(false);
            this.setPositionY(upperLimit);
        }
    }

    /**
     * Description: The function move the bullet's shoot Down.
     */
    public void movingBulletDown() {
        if (positionInitialY < upperLimit) {
            positionInitialY += 1;
        } else {
            this.setPositionY(0);
            this.changeBulletExists(false);
        }
    }

}
