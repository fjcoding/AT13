package org.fundacionjala.at13.spaceinvaders;

public class Spaceship {

    private int posX;
    private int posY;
    private final int LOWER_lIMIT=0;
    private final int UPPER_lIMIT=50;
    

    public Spaceship(int posX, int posY) {
        this.posX = posX;
        this.posY = posY;
    }


    public int getPosX() {
        return this.posX;
    }

    public int getPosY() {
        return this.posY;
    }

    public void setPosX(int posX) {
        if(posX<LOWER_lIMIT){
            this.posX = LOWER_lIMIT;
        }else if(posX>UPPER_lIMIT-1){
            this.posX = (UPPER_lIMIT-1);
        }else{
            this.posX = posX;
        }
    }
    
    public void setPosY(int posY) {
        if(posY<LOWER_lIMIT){
            this.posY = LOWER_lIMIT;
        }else if(posY>UPPER_lIMIT){
            this.posY = UPPER_lIMIT-1;
        }else{
            this.posY = posY;
        }
    }

    public int getLOWER_lIMIT() {
        return this.LOWER_lIMIT;
    }

    public int getUPPER_lIMIT() {
        return this.UPPER_lIMIT;
    }

    public void moveToRight(){
        if (this.posY<UPPER_lIMIT) {
            this.posY+=1;
        }
    }

    public void moveToLeft(){
        if (this.posY>LOWER_lIMIT) {
            this.posY-=1;           
        }
    }

}
