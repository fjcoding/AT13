package org.fundacionjala.at13.spaceinvaders;
import org.fundacionjala.at13.spaceinvaders.*;
public class Main {
    public static void main(String[] args) {
        System.out.println("Space Invaders!!! by AT13"+"\n");
        Alien Alien1 = new Alien();
        System.out.println(Alien1.moveLeft()+"\n" );
        System.out.println(Alien1.moveRight()+"\n" );
        System.out.println(Alien1.moveDown()+"\n" );
        System.out.println(Alien1.shoot()+"\n");
    }
}