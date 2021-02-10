package org.fundacionjala.at13.spaceinvaders;
public class Game {
    
    public static final int WAIT_PERIOD = 50; // milliseconds
    public static final int ROWS = 3;
    public static final int COLUMNS = 5;

    public static final int VALORY = 10;
    public static final int ALIEN_COLUMN = 10;
    public static final int ALIEN_ROW = 5;

    private static final int GO_LEFT = 37;
    private static final int GO_RIGHT = 39;

/*     public static final int GO_LEFT = 37;
    public static final int GO_RIGHT = 39; */
    private static final int SIZE_IMAGE = 23;
    private static final int POS_X = (Space.DEFAULT_WIDTH * 5 - 23) / 2;
    private static final int POS_Y = Space.DEFAULT_HEIGHT * 14 - 23;
    private static final int SCALE_WIDTH = Space.DEFAULT_WIDTH * 5;
    private static final int SCALE_HEIGHT = Space.DEFAULT_HEIGHT * 15;
    public static final Spaceship spaceship = new Spaceship((SCALE_WIDTH - SIZE_IMAGE) / 2, SCALE_HEIGHT - SIZE_IMAGE, 0, SCALE_WIDTH - 23);
    public static final Bullet bullet = new Bullet(spaceship);


    public static final Space space = new Space(Space.DEFAULT_WIDTH, Space.DEFAULT_HEIGHT);

    /** */
    public static void moveSpaceship(final int direction) {
        if(direction == GO_LEFT) {
            spaceship.moveLeft();
        }
        if(direction == GO_RIGHT) {
            spaceship.moveRight();
        }
        bullet.isShootingToAlien();
    }
    /** */
    public void shootSpaceship() {

    }

}
