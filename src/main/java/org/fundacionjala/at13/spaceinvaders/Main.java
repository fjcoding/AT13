package org.fundacionjala.at13.spaceinvaders;

public final class Main {

    public static final int WAIT_PERIOD = 50; // milliseconds
    public static final int ROWS = 3;
    public static final int COLUMNS = 5;

    private Main() {
    }

    public static final int VALORY = 10;
    public static final int ALIEN_COLUMN = 10;
    public static final int ALIEN_ROW = 5;
    public static void main(final String[] args) throws InterruptedException {
        Space space = new Space();
        space.init();
        //GameBoard gameboard = new GameBoard();
        //gameboard.init();
    }
}
