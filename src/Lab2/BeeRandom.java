/*
 * CS1021-081
 * Winter 2018-2019
 * File header contains class BeeRandom
 * Name: muellerbs
 * Created 12/17/2019
 */
package Lab2;

import javafx.scene.image.ImageView;

import java.util.List;

/**
 * CS1021-081 Winter 2018-2019
 * Class purpose: random bee
 *
 *
 * This bee chooses a flower at random, and moves straight towards it.
 * This is opposed to the other bee that moves in a set, directed fashion
 * through the garden.
 * @author drazek-loosierc
 * @version created on 12/17/2019 at 7:28 PM
 */
public class BeeRandom extends Bee {

    public static void main(String[] args) {
        //dummy code
    }

    int xPos, yPos, energy;
    static final double MOVE_DISTANCE = 10.0;
    ImageView imageView;

    /**
     * constructor for the random selecting bee
     * @param xPos the xpos for the bee
     * @param yPos the ypos for the bee
     * @param energy the energy of the bee
     * @param imageView the imageView of the bee
     */
    public BeeRandom(int xPos, int yPos, int energy, ImageView imageView){
        super(xPos, yPos, energy, imageView);
    }

    /*
    public ImageView getImageView() {
        return imageView;
    }
    */

    /**
     * chooses a target from a list of flowers
     * @param flowerList the list of flowers
     */
    public void chooseTarget(List<Flower> flowerList ){
        //chooses a target from the list of flowers
    }

    /**
     * Moves the bee a fixed distance towards the target flower.
     */
    public void move(){

    }
}
