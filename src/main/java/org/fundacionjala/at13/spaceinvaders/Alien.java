package org.fundacionjala.at13.spaceinvaders;
public class Alien { 
    //The variables are named after the x and y axis of the cartesian plane
    int xPos;
    int yPos;
    public Alien(){
        this.xPos = 0;
        this.yPos = 0;
    }

    public int getXPos() {
        return xPos;
    }

    public void setXPos(int x) {
        this.xPos = x;
    }

    public int getYPos() {
        return yPos;
    }

    public void setYPos(int y) {
        this.yPos = y;
    }

    public Integer moveRight(){
        return 1;
    }

    public Integer moveLeft(){
        return 1;
    }

    public Integer moveDown(){
        return 1;
    }

    public String shoot(){
        return "Alien shooted a bullet";
    }

    public Boolean die(){
        return false;
    }
}
