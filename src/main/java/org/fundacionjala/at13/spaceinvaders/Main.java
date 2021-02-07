package org.fundacionjala.at13.spaceinvaders;

public final class Main {

    public static final int WAIT_PERIOD = 2000; // milliseconds
    public static final int ROWS = 3;
    public static final int COLUMNS = 5;

    private Main() {
    }

    public static final int VALORY = 10;

    public static void main(final String[] args) throws InterruptedException {
        System.out.println("Space Invaders!!! by AT13" + "\n");

        // Space invaders example with spaceship
        Space space = new Space(Space.DEFAULT_HEIGHT, Space.DEFAULT_WIDTH);
        Spaceship spaceship = new Spaceship(Spaceship.DEFAULT_POSX, Spaceship.DEFAULT_POSY);
        space.setSpaceship(spaceship);
<<<<<<< HEAD
        Alien[] aliens = {
                new Alien(Alien.DEFAULT_POSX, Alien.DEFAULT_POSY),
                new Alien(Alien.DEFAULT_POSX - 1, Alien.DEFAULT_POSY),
                new Alien(Alien.DEFAULT_POSX - 2, Alien.DEFAULT_POSY)
        };
        Bullet bulletSpaceship = new Bullet(spaceship);
        space.setBullet(bulletSpaceship);
        space.setAlien(aliens);

        print(space.show());
        spaceship.moveToRight();
        bulletSpaceship.isShootingToAlien(spaceship);
        aliens[0].moveRight();
        aliens[1].moveRight();
        aliens[2].moveRight();
        Thread.sleep(WAIT_PERIOD);
        print(space.show());
        spaceship.moveToRight();
        aliens[0].moveRight();
        aliens[1].moveRight();
        aliens[2].moveRight();
        aliens[0].moveDown();
        bulletSpaceship.isShootingToAlien(spaceship);
        Thread.sleep(WAIT_PERIOD);
        print(space.show());
=======
        AlienGroup alienGroup = new AlienGroup(ROWS, COLUMNS);
        Bullet bullet = new Bullet("SpaceShip", spaceship.getPosX(), spaceship.getPosY() + 1);
        space.setBullet(bullet);
        space.setAlien(alienGroup.getAliens());

//        print(space.show());
//        spaceship.moveToRight();
//        bullet.itShooting();
//        alienGroup.aliensMoveRight();
//        Thread.sleep(WAIT_PERIOD);
//        print(space.show());
//        spaceship.moveToRight();
//        Thread.sleep(WAIT_PERIOD);
//        print(space.show());

        while (true) {
            print(space.show());
            spaceship.moveToRight();
            bullet.itShooting();
            alienGroup.moveAliens();
            Thread.sleep(WAIT_PERIOD);
        }
>>>>>>> 3230ae1 (change in the Space class to receive an Arraylist<Alien>)
    }

    private static void print(final String[][] matrix) {
        System.out.println("=====================================================================================================");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println("=====================================================================================================");
    }
}
