package org.fundacionjala.at13.spaceinvaders;

public class bullet{
    public int positionInitialX;
    public int positionInitialY;
    public boolean bulletExist;

    public bullet(int x,int y){
        positionInitialX = x;
        positionInitialY = y;
        bulletExist = true;
    }
    public void shooter(String type){
        if(bulletExist){
            System.out.println("The " + type + " has fired from " + this.positionInitialX + " " + this.positionInitialY);
            bulletExist = false;
        }else{
            System.out.println("the " + type + " cannot fired");
        }
    }
    public boolean isCollapsedBullet(int x1, int y1, int x2, int y2){
        if(x1 == x2 && y1 == y2){
            System.out.println("The bullet has collapsed");
            bulletExist = true;
            return true;
        }
        return false;
    }
}
