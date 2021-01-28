package org.fundacionjala.at13.spaceinvaders;

public class bullet {
    public int positionInitialX;
    public int positionInitialY;

    public bullet(int x,int y){
        positionInitialX = x;
        positionInitialY = y;
    }
    public void shooter (String type){
        System.out.println("The "+type+" has fired from "+this.positionInitialX+" "+this.positionInitialY);
    }
    public boolean colapsed (int x1, int y1, int x2, int y2){
        if(x1 == x2 && y1 == y2){
           return true;
        }
        return false;
    }

}
