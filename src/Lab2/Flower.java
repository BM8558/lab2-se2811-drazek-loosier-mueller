/*
 * CS1021-081
 * Winter 2018-2019
 * File header contains class Flower
 * Name: drazek-loosierc
 * Created 12/17/2019
 */
package Lab2;

import javafx.scene.image.ImageView;

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
    ImageView imageView;

    /**
     * constructor for the Flower
     * @param xPos the xpos for the flower
     * @param yPos the ypos for the flower
     * @param energy the energy of the flower
     */
    public Flower(int xPos, int yPos, int energy, ImageView imageView){
        super(xPos, yPos, energy, imageView);
        nectar = 0;
    }

    @Override
    public ImageView getImageView() {
        return imageView;
    }
}
