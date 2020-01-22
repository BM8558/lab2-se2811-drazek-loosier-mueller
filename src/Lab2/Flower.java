/*
 * CS1021-081
 * Winter 2018-2019
 * File header contains class Flower
 * Name: drazek-loosierc
 * Created 12/17/2019
 */
package Lab2;

/**
 * CS1021-081 Winter 2018-2019
 * Class purpose: flower
 *
 * @author drazek-loosierc
 * @version created on 12/17/2019 at 7:27 PM
 */
public abstract class Flower extends Entity {
    int xPos, yPos, energy;
    double nectar;

    /**
     * constructor for the Flower
     * @param xPos the xpos for the bee
     * @param yPos the ypos for the bee
     * @param energy the energy of the bee
     */
    public Flower(int xPos, int yPos, int energy){
        super(xPos, yPos, energy);
        nectar = 0;
    }

}
