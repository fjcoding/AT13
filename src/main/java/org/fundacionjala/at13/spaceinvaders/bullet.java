package org.fundacionjala.at13.spaceinvaders;

public class bullet{
    public int positionInitialX;
    public int positionInitialY;
    public boolean bulletExist;

    public bullet(int x, int y){
        positionInitialX = x;
        positionInitialY = y;
        bulletExist = true;
    }
    public String shooter(String type){
        if(bulletExist){
            bulletExist = false;
            return "The " + type + " has fired from " + this.positionInitialX + " " + this.positionInitialY;
        }else{
            return "the " + type + " cannot fired";
        }
    }
    public boolean isCollapsedBullet(int positionX1, int positionY1, int positionX2, int positionY2){
        if(positionX1 == positionX2 && positionY1 == positionY2){
            System.out.println("The bullet has collapsed");
            bulletExist = true;
            return true;
        }
        return false;
    }
}
