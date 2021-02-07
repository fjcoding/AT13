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

        AlienGroup alienGroup = new AlienGroup(ROWS, COLUMNS);
        //Bullet bullet = new Bullet("SpaceShip", spaceship.getPosX(), spaceship.getPosY() + 1);
        //space.setBullet(bullet);
        space.setAlien(alienGroup.getAliens());

       while (true) {
            print(space.show());
            spaceship.moveToRight();
            //bullet.itShooting();
            alienGroup.moveAliens();
            Thread.sleep(WAIT_PERIOD);
        }
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
