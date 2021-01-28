package org.fundacionjala.at13.spaceinvaders;
public class Alien { 
    //The variables are named after the x and y axis of the cartesian plane
    int xInit;
    int yInit;
    public Alien(){
        this.xInit = 0;
        this.yInit = 0;
    }

    public int getXInit() {
        return xInit;
    }

    public void setXInit(int x) {
        this.xInit = x;
    }

    public int getYInit() {
        return yInit;
    }

    public void setYInit(int y) {
        this.yInit = y;
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
