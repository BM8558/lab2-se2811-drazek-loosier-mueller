package Lab2;
/*
 * CS1021-081
 * Winter 2018-2019
 * File header contains class Lab2.Entity
 * Name: muellerbs
 * Created 12/17/2019
 */

/**
 * CS1021-081 Winter 2018-2019
 * Class purpose: Class
 *
 * @author drazek-loosierc
 * @version created on 12/17/2019 at 7:23 PM
 */
public abstract class Entity {
    int xPos, yPos, energy;

    public static void main(String[] args) {
        //dummy code
    }

    public Entity(int xPos, int yPos, int energy){
        this.xPos = xPos;
        this.yPos = yPos;
        this.energy = energy;
    }

    public void setxPos(int xPos) {
        this.xPos = xPos;
    }

    /**
     * gets the x pos of the bee
     * @return
     */
    public int getxPos() {
        return xPos;
    }

    /**
     * sets y pos when the bee moves
     * @param yPos
     */
    public void setyPos(int yPos) {
        this.yPos = yPos;
    }

    public int getyPos() {
        return yPos;
    }
}
