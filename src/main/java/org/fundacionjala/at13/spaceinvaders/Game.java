package org.fundacionjala.at13.spaceinvaders;
import java.util.ArrayList;
public class Game {

    private Space space;
    private Spaceship spaceship;
    private AlienGroup alienGroup;
    private Bullet bullet;

    private int width = Space.DEFAULT_WIDTH;
    private int height = Space.DEFAULT_HEIGHT;
    private int llimit = Space.INITIAL_RANGE;
    private int ulimit = Space.DEFAULT_WIDTH;
    private final int posXSp = Spaceship.DEFAULT_POSX;
    private final int posYSp = Spaceship.DEFAULT_POSY;
    public static final int ALIEN_COLUMN = 10;
    public static final int ALIEN_ROW = 5;
    private static final int GO_LEFT = 37;
    private static final int GO_RIGHT = 39;
    private static final int SHOOT = 32;


    public Game() {
        this.space = new Space(height, width);
        this.spaceship = new Spaceship(posXSp, posYSp, llimit, ulimit);
        this.alienGroup = new AlienGroup(ALIEN_ROW, ALIEN_COLUMN);
        space.setSpaceship(spaceship);
        space.setAlien(alienGroup.getAliens());
    }

    /** @return a integer that is the width of space.*/
    public int widthSpace() {
        return this.width;
    }

    /** @return a integer that is the height of space.*/
    public int heightSpace() {
        return this.height;
    }

    /** @return a integer that is the position X of spaceship.*/
    public int posXSpaceship() {
        return this.posXSp;
    }

    /** @return a integer that is the position Y of spaceship.*/
    public int posYSpaceship() {
        return this.posYSp;
    }

    /** execute actions that spaceship can do.*/
    public void moveSpaceship(final int action) {
        if (action == GO_LEFT) {
            this.spaceship.moveLeft();
        }
        if (action == GO_RIGHT) {
            this.spaceship.moveRight();
        }
        if (action == SHOOT) {
            this.bullet = this.spaceship.shoot();
        }
        /* bullet.isShootingToAlien(); */
    }

    /** @return a spaceship*/
    public Spaceship getSpaceship() {
        return this.spaceship;
    }

    /** @return a bullet*/
    public Bullet getBullet() {
        return this.bullet;
    }

    /** @return ArrayList of aliens*/
    public ArrayList<Alien> getAlienGroup() {
        return this.alienGroup.getAliens();
    }
    /** */
 /*    public void shootSpaceship() {

    } */

    /** do one move of all aliens that are in group*/
    public void startMoving() {
        alienGroup.moveAliens();
        if (this.bullet != null) {
            this.bullet.isShootingToAlien();
        }
    }

}
