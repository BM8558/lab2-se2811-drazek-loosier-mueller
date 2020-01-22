/*
 * CS1021-081
 * Winter 2018-2019
 * File header contains class BeeDirected
 * Name: muellerbs
 * Created 12/17/2019
 */
package Lab2;

import javafx.scene.image.ImageView;

/**
 * CS1021-081 Winter 2018-2019
 * Class purpose: directed bee
 *
 * This bee moves through the garden in a set, directed fashion.
 * This is opposed to the random bee that chooses a flower and moves in
 * a straight line towards it.
 *
 * @author drazek-loosierc
 * @version created on 12/17/2019 at 7:27 PM
 */
public class BeeDirected extends Bee {
    public static void main(String[] args) {
        //dummy code
    }

    int xPos, yPos, energy;
    static final double MOVE_DISTANCE = 10.0;

    /**
     * constructor for the random selecting bee
     * @param xPos the xpos for the bee
     * @param yPos the ypos for the bee
     * @param energy the energy of the bee
     * @param imageView the imageView for the bee
     */
    public BeeDirected(int xPos, int yPos, int energy, ImageView imageView){
        super(xPos, yPos, energy, imageView);
    }

    public ImageView getImageView() {
        return imageView;
    }


    /**
     * moves the bee a fixed distance in a set direction
     */
    @Override
    public void move(){
    }
}
