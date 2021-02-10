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
    public final int posXSp = Spaceship.DEFAULT_POSX;
    public final int posYSp = Spaceship.DEFAULT_POSY;
    public static final int ALIEN_COLUMN = 10;
    public static final int ALIEN_ROW = 5;
    private static final int GO_LEFT = 37;
    private static final int GO_RIGHT = 39;
    private static final int SHOOT = 115;
    

    public Game() {
        this.space = new Space(height, width);
        this.spaceship = new Spaceship(posXSp, posYSp, llimit, ulimit);
        this.alienGroup = new AlienGroup(ALIEN_ROW, ALIEN_COLUMN);
        space.setSpaceship(spaceship);
        space.setAlien(alienGroup.getAliens());
    }
    /** */
    public int widthSpace() {
        return this.width;
    }
    /** */
    public int heightSpace() {
        return this.height;
    }
    /** */
    public int posXSpaceship() {
        return this.posYSp;
    }
    /** */
    public int posYSpaceship() {
        return this.posYSp;
    }
    /** */
    public void moveSpaceship(final int action) {
        if(action == GO_LEFT) {
            this.spaceship.moveLeft();
        }
        if(action == GO_RIGHT) {
            this.spaceship.moveRight();
        }
        if(action == SHOOT) {
            this.bullet = this.spaceship.shoot();
        }
        /* bullet.isShootingToAlien(); */
    }

    /** */
    public Spaceship getSpaceship() {
        return this.spaceship;
    }

    /** */
    public Bullet getBullet() {
        return this.bullet;
    }

    /** */
    public ArrayList<Alien> getAlienGroup() {
        return this.alienGroup.getAliens();
    }
    /** */
 /*    public void shootSpaceship() {

    } */

    /** */
    public void startMoving() {
        alienGroup.moveAliens();
        if(this.bullet!=null) {
            this.bullet.isShootingToAlien();
        }
    }

}
