package org.fundacionjala.at13.spaceinvaders;
public class Game {
    private Spaceship spaceship;
    private AlienGroup alienGroup;
    private static Bullet bullet;
    private GameBoard gameboard;
    private static final int SCALE_WIDTH = 15;
    private static final int SCALE_HEIGHT = 10;
    public static final int NUMBER_OF_ALIEN_COLUMNS = 5;
    public static final int NUMBER_OF_ALIEN_ROWS = 3;

    public Game() {
        alienGroup = new AlienGroup(NUMBER_OF_ALIEN_ROWS, NUMBER_OF_ALIEN_COLUMNS);
        spaceship = new Spaceship(SCALE_WIDTH / 2, SCALE_HEIGHT - 2, 0, SCALE_WIDTH);
        gameboard = new GameBoard();
        gameboard.init();
    }

}
