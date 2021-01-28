package org.fundacionjala.at13.spaceinvaders;

public class bullet {
    public int positionX;
    public int positionY;

    public bullet(int x,int y){
        positionX = x;
        positionY = y;
    }
    public void shooter (String type){
        System.out.println("The "+type+" has fired from "+this.positionX+" "+this.positionY);
    }
}
