package org.fundacionjala.at13.spaceinvaders;
public class Bullet {
    private int positionInitialX;
    private int positionInitialY;
    private boolean bulletExist;
    private final int lowerLimit = 0;
    private final int upperLimit = 30;
    private String type;

    public Bullet(final String shooterType, final int x, final int y) {
        positionInitialX = x;
        positionInitialY = y;
        bulletExist = false;
        this.type = shooterType;
        goForward();
    }

    public Bullet(final Spaceship spaceship) {
        positionInitialX = spaceship.getPosX();
        positionInitialY = spaceship.getPosY() + 1;
        bulletExist = false;
    }

    public Bullet(final Alien alien) {
        positionInitialX = alien.getPosX();
        positionInitialY = alien.getPosY() - 1;
        bulletExist = false;
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
     * Description: The function returns the type of the shooter.
     *
     * @return a String with the type of the shooter.
     */
    public String getType() {
        return this.type;
    }

    /**
     * Description: The function returns the type of the shooter.
     *
     * @return a String with the type of the shooter.
     */
    public void goForward() {
        if (this.getType() == Space.ALIEN) {
            goDown();
        } else {
            goUp();
        }
    }

    /**
     * Description: The function displays a bullet shoot.
     * from the Spaceship.
     *
     */
    public void isShootingToAlien(final Spaceship spaceship) {
        if (!bulletExist) {
            movingBulletUp();
        }

    }

    /**
     * Description: The function displays a bullet shoot.
     * from the Alien.
     *
     */
    public void isShootingToSpaceship(final Alien alien) {
        if (!bulletExist) {
            movingBulletDown();
        }
    }

    /**
     * Description: The function verifies if the bullet collapses.
     *
     * @return a boolean that verifies if the bullet  from Spaceship
     * collapses with alien.
     */
    public boolean isCollapsedBulletWithAlien(final Alien alien) {
        if (this.getPositionX() == alien.getPosX() && this.positionInitialY == alien.getPosY()) {
            System.out.println("The bullet has kill Alien");
            bulletExist = false;
            return true;
        }
        return false;
    }

    /**
     * Description: The function verifies if the bullet collapses.
     *
     * @return a boolean that verifies if the bullet  from Alien
     * collapses with Spaceship.
     */
    public boolean isCollapsedBulletWithSpacceship(final Spaceship spaceship) {
        if (this.getPositionX() == spaceship.getPosX() && this.positionInitialY == spaceship.getPosY()) {
            System.out.println("The bullet has impact Spaceship");
            bulletExist = false;
            return true;
        }
        return false;
    }

    /**
     * Description: Less one position to move down the bullet.
     */
    public void goDown() {
        if (this.positionInitialY > this.lowerLimit) {
            this.positionInitialY -= 1;
        }
    }

    /**
     * Description: Add one position to move up the bullet.
     */
    public void goUp() {
        if (this.positionInitialY < this.upperLimit - 1) {
            this.positionInitialY += 1;
        }
    }

    /**
     * @return true if they are equal, false if they're not.
     */
    public boolean equals(final Bullet otherBullet) {
        return this.positionInitialX == otherBullet.getPositionX()
         && this.positionInitialY == otherBullet.getPositionY()
         && this.type == otherBullet.getType();
    }

    /**
     * Description: The function move the bullet shoot Up.
     *
     */
    public void movingBulletUp() {
        if (positionInitialY < upperLimit) {
            positionInitialY += 1;
        } else if (positionInitialY == upperLimit) {
            bulletExist = false;
            System.out.print("Spaceship has failed.");
        } else {
            System.out.print("Error: Bullet is out of range.");
        }

    }

    /**
     * Description: The function move the bullet shoot Down.
     *
     */
    public void movingBulletDown() {
        if (positionInitialY > lowerLimit) {
            positionInitialY -= 1;
        } else if (positionInitialY < lowerLimit) {
            bulletExist = false;
            System.out.print("Alien has failed.");
        } else {
            System.out.print("Error: Bullet is out of range.");
        }
    }

}
