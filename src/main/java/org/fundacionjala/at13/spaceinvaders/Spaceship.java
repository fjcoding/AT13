package org.fundacionjala.at13.spaceinvaders;

import java.util.Scanner;

public class Spaceship {

    private int posX;
    private int posY;
    
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        boolean itEnds=true;
        boolean posIniExist=false;
        Spaceship spaceship=new Spaceship();
        int posXInitial;
        int posYInitial;
        while (itEnds) {
            System.out.println("Press next numbres to");
            if (!posIniExist) {
                System.out.println("1.-Enter initial position");
            }
            if (posIniExist) {
                System.out.println("2.-Change actual position");
                System.out.println("3.-Move to Right");
                System.out.println("4.-Move to Left");
                System.out.println("5.-Shoot");
            }
            System.out.println("6.-Exit");
            int option=scanner.nextInt();
            switch (option) {
                case 1:
                    System.out.print("Enter initial position x: ");
                    posXInitial=scanner.nextInt();
                    System.out.print("Enter initial position y: ");
                    posYInitial=scanner.nextInt();;
                    spaceship.setPosX(posXInitial);
                    spaceship.setPosY(posYInitial);
                    System.out.println("Spaceship initial position: "+spaceship.getPosX()+","+spaceship.getPosY());
                    posIniExist=true;
                    break;
                case 2:
                    System.out.println("To change position");
                    System.out.print("Enter new position x: ");
                    posXInitial=scanner.nextInt();
                    System.out.print("Enter new position y: ");
                    posYInitial=scanner.nextInt();;
                    spaceship.setPosX(posXInitial);
                    spaceship.setPosY(posYInitial);
                    System.out.println("Spaceship new position: "+spaceship.getPosX()+","+spaceship.getPosY());
                    break;
                case 3:
                    spaceship.moveToRight();
                    System.out.println("Spaceship new position: "+spaceship.getPosX()+","+spaceship.getPosY());
                    break;
                case 4:
                    spaceship.moveToLeft();
                    System.out.println("Spaceship new position: "+spaceship.getPosX()+","+spaceship.getPosY());
                    break;
                case 5:
                    spaceship.shoot();
                    break;
                default:
                    itEnds=false;
                    break;
            }
        }
        scanner.close();
    }

    public Spaceship(int posX, int posY) {
        this.posX = posX;
        this.posY = posY;
    }

    public Spaceship() {
    }
    
    public int getPosX() {
        return this.posX;
    }

    public int getPosY() {
        return this.posY;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }
    public void setPosY(int posY) {
        this.posY = posY;
    }

    public void moveToRight(){
        this.posY+=1;
    }

    public void moveToLeft(){
        this.posY-=1;
    }

    public void shoot(){
        System.out.println(">>>>>>> piw <<<<<<< shoot position: "+getPosX()+","+getPosY());
    }
}
