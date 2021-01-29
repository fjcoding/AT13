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
    public String shooter(String type){
        if(bulletExist){
            bulletExist = false;
            return "The " + type + " has fired from " + this.positionInitialX + " " + this.positionInitialY;
        }else{
            return "the " + type + " cannot fired";
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
