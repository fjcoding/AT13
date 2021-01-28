package org.fundacionjala.at13.spaceinvaders;

import java.util.Scanner;

public class Spaceship {

    private int posX;
    private int posY;
    
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter initial position x: ");
        int posXInitial=scanner.nextInt();
        System.out.print("Enter initial position y: ");
        int posYInitial=scanner.nextInt();;
        Spaceship spaceship=new Spaceship(posXInitial, posYInitial);
        System.out.println("spaceship position: "+spaceship.getPosX()+","+spaceship.getPosY());
        scanner.close();
    }

    public Spaceship(int posX, int posY) {
        this.posX = posX;
        this.posY = posY;
    }
    
    public int getPosX() {
        return this.posX;
    }

    public int getPosY() {
        return this.posY;
    }

}
