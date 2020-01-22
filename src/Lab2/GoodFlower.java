/*
 * CS1021-081
 * Winter 2018-2019
 * File header contains class GoodFlower
 * Name: drazek-loosierc
 * Created 12/17/2019
 */
package Lab2;

import javafx.scene.image.ImageView;

/**
 * CS1021-081 Winter 2018-2019
 * Class purpose: good flower, nice, gives energy
 *
 * @author drazek-loosierc
 * @version created on 12/17/2019 at 7:28 PM
 */
public class GoodFlower extends Flower {

    /**
     * constructor for the Flower
     * @param xPos the xpos for the bee
     * @param yPos the ypos for the bee
     * @param energy the energy of the bee
     * @param imageView the image that represents the flower
     */
    public GoodFlower(int xPos, int yPos, int energy, ImageView imageView){
        super(xPos, yPos, energy, imageView);
        nectar = 0;
    }
}
