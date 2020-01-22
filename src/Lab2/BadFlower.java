/*
 * CS1021-081
 * Winter 2018-2019
 * File header contains class BadFlower
 * Name: drazek-loosierc
 * Created 12/17/2019
 */
package Lab2;

import javafx.scene.image.ImageView;

/**
 * CS1021-081 Winter 2018-2019
 * Class purpose: mean flower, bad
 *
 * @author drazek-loosierc
 * @version created on 12/17/2019 at 7:29 PM
 */
public class BadFlower extends Flower {
    int xPos, yPos, energy;
    double nectar;
    ImageView imageView;


    /**
     * constructor for the Flower
     * @param xPos the xpos for the bee
     * @param yPos the ypos for the bee
     * @param energy the energy of the bee
     * @param imageView the image that represents the flower
     */
    public BadFlower(int xPos, int yPos, int energy, ImageView imageView){
        super(xPos, yPos, energy, imageView);
        nectar = 0;
    }
}
