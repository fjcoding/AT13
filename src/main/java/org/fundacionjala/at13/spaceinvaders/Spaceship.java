package org.fundacionjala.at13.spaceinvaders;

import java.util.Scanner;

public class Spaceship {
    
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter initial position x: ");
        int posX=scanner.nextInt();
        System.out.print("Enter initial position y: ");
        int posY=scanner.nextInt();;
        System.out.println("spaceship position: "+posX+","+posY);
        scanner.close();
    }

}
