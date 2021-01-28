package org.fundacionjala.at13.spaceinvaders;

public class Matrix {
    public static final int MATRIX_HEIGHT = 3;
    public static final int MATRIX_WIDTH = 3;
    public int[][] space;

    public Matrix(){
        this.space = new int[MATRIX_HEIGHT][MATRIX_WIDTH];
        fillMatrix();
    }

    public void fillMatrix() {
        for (int i = 0; i < MATRIX_HEIGHT; i++) {
            for (int j = 0; j < MATRIX_WIDTH; j++) {
                space[i][j]=0;
                System.out.print(space[i][j]);
            }
            System.out.println("");
        }
    }
}
