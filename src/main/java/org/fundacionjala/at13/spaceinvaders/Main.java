package org.fundacionjala.at13.spaceinvaders;

public final class Main {

    public static final int WAIT_PERIOD = 2000; // milliseconds

    private Main() { }
    public static final int VALORY = 10;
    public static void main(final String[] args) throws InterruptedException {
        System.out.println("Space Invaders!!! by AT13" + "\n");

        // Space invaders example with spaceship
        Space space = new Space(Space.DEFAULT_HEIGHT, Space.DEFAULT_WIDTH);
        Spaceship spaceship = new Spaceship(Spaceship.DEFAULT_POSX, Spaceship.DEFAULT_POSY, Space.INITIAL_RANGE, Space.DEFAULT_WIDTH);
        space.setSpaceship(spaceship);
        Alien[] aliens = {
                new Alien(Alien.DEFAULT_POSX, Alien.DEFAULT_POSY, Space.INITIAL_RANGE, Space.DEFAULT_WIDTH),
                new Alien(Alien.DEFAULT_POSX - 1, Alien.DEFAULT_POSY, Space.INITIAL_RANGE, Space.DEFAULT_WIDTH),
                new Alien(Alien.DEFAULT_POSX - 2, Alien.DEFAULT_POSY, Space.INITIAL_RANGE, Space.DEFAULT_WIDTH)
        };
        Bullet bullet = new Bullet("SpaceShip", spaceship.getPosX(), spaceship.getPosY() + 1);
        space.setBullet(bullet);
        space.setAlien(aliens);

        print(space.show());
        spaceship.moveToRight();
        bullet.itShooting();
        aliens[0].moveToRight();
        aliens[1].moveToRight();
        aliens[2].moveToRight();
        Thread.sleep(WAIT_PERIOD);
        print(space.show());
        spaceship.moveToRight();
        aliens[0].moveToRight();
        aliens[1].moveToRight();
        aliens[2].moveToRight();
        //aliens[0].moveDown();
        Thread.sleep(WAIT_PERIOD);
        print(space.show());
    }

    private static void print(final String[][] matrix) {
        System.out.println("=====================================================================================================");
        for (int i =  0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println("=====================================================================================================");
    }
}
