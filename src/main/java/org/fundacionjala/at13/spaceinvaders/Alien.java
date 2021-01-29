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

    public String moveRight(){
        return "Alien moved to the rigth";
    }

    public String moveLeft(){
        return "Alien moved to the left";
    }

    public String moveDown(){
        return "Alien moved down";
    }

    public String shoot(){
        return "Alien shooted a bullet";
    }

    public String die(){
        return "Alien is DEAD";
    }
}
