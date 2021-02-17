package org.fundacionjala.at13.spaceinvaders;

public final class Main {

    private Main() {
    }

    public static void main(final String[] args) throws InterruptedException {
        GameBoard gameboard = new GameBoard();
        gameboard.init();
    }
}
