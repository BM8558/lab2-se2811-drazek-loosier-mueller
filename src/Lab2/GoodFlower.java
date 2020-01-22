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
    int xPos, yPos, energy;
    double nectar;
    ImageView imageView;

    /**
     * constructor for the Good Flower
     * @param xPos the xpos for the flower
     * @param yPos the ypos for the flower
     * @param energy the energy of the flower
     * @param imageView the imageView of the flower
     */
    public GoodFlower(int xPos, int yPos, int energy, ImageView imageView){
        super(xPos, yPos, energy, imageView);
        nectar = 10;
    }

    @Override
    public ImageView getImageView() {
        return imageView;
    }
}
