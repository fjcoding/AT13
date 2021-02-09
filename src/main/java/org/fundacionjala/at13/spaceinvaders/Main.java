package org.fundacionjala.at13.spaceinvaders;

public final class Main {

    public static final int WAIT_PERIOD = 500; // milliseconds
    public static final int ROWS = 3;
    public static final int COLUMNS = 5;

    private Main() {
    }

    public static final int VALORY = 10;
    public static final int ALIEN_COLUMN = 10;
    public static final int ALIEN_ROW = 5;
    public static void main(final String[] args) throws InterruptedException {
        System.out.println("Space Invaders!!! by AT13" + "\n");

        // Space invaders example with spaceship
        Space space = new Space(Space.DEFAULT_HEIGHT, Space.DEFAULT_WIDTH);
        Spaceship spaceship = new Spaceship(Spaceship.DEFAULT_POSX, Spaceship.DEFAULT_POSY, Space.INITIAL_RANGE, Space.DEFAULT_WIDTH);
        space.setSpaceship(spaceship);
        int alienColumn1 = ALIEN_COLUMN;
        int alienRow = ALIEN_ROW;
        Alien[] aliens = new Alien[alienColumn1 * alienRow];
        for (int i = 0; i < alienColumn1; i++) {
            for (int j = 0; j < alienRow; j++) {
                aliens[i * alienRow + j] = new Alien(Alien.DEFAULT_POSX - i, Alien.DEFAULT_POSY - j, Space.INITIAL_RANGE, Space.DEFAULT_WIDTH);
            }
        }
        space.setAlien(aliens);
        Bullet bullet = spaceship.shoot();
        space.setBullet(bullet);
        Interface grafic = new Interface();
        print(space.show());
        System.out.println("spaceship position: " + spaceship.getPosX() + "," + spaceship.getPosY()
            + " bullet position: " + bullet.getPositionX() + "," + bullet.getPositionY());
        while (true) {
            for (int i = 0; i < aliens.length; i++) {
                    aliens[i].moveRight();
            }
            spaceship.moveRight();
            bullet.isShootingToAlien();
            Thread.sleep(WAIT_PERIOD);
            print(space.show());
        System.out.println("spaceship position: " + spaceship.getPosX() + "," + spaceship.getPosY()
            + " bullet position: " + bullet.getPositionX() + "," + bullet.getPositionY());
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
