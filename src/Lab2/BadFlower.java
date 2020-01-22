/*
 * CS1021-081
 * Winter 2018-2019
 * File header contains class BadFlower
 * Name: drazek-loosierc
 * Created 12/17/2019
 */
package Lab2;

/**
 * CS1021-081 Winter 2018-2019
 * Class purpose: mean flower, bad
 *
 * @author drazek-loosierc
 * @version created on 12/17/2019 at 7:29 PM
 */
public class BadFlower extends Flower {
    /**
     * constructor for the Good Flower
     * @param xPos the xpos for the bee
     * @param yPos the ypos for the bee
     * @param energy the energy of the bee
     */
    public BadFlower(int xPos, int yPos, int energy){
        super(xPos, yPos, energy);
        nectar = -10;
    }
}
