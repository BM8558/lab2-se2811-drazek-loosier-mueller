/*
 * CS1021-081
 * Winter 2018-2019
 * File header contains class Bee
 * Name: muellerbs
 * Created 12/17/2019
 */
package Lab2;

/**
 * CS1021-081 Winter 2018-2019
 * Class purpose: bee
 *
 * @author drazek-loosierc
 * @version created on 12/17/2019 at 7:26 PM
 */
public abstract class Bee extends Entity {
    int xPos, yPos, energy;
    static final double MOVE_DISTANCE = 10.0;

    /**
     * constructor for the random selecting bee
     * @param xPos the xpos for the bee
     * @param yPos the ypos for the bee
     * @param energy the energy of the bee
     */
    public Bee(int xPos, int yPos, int energy){
        super(xPos, yPos, energy);
    }

    /**
     * moves the bee a fixed distance in the bee's set pattern
     */
    public void move(){
        //moves the bee a fixed amount based on its particular strategy
    }




    public static void main(String[] args) {
        //dummy code
    }


}
