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
 * @author muellerbs
 * @version created on 12/17/2019 at 7:28 PM
 */
public class BeeRandom extends Bee {

    public static void main(String[] args) {
        //dummy code
    }

    int xPos, yPos, energy;
    static final double MOVE_DISTANCE = 10.0;
    ImageView imageView;
    Flower target;

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
        int random = (int)(Math.random() * ((flowerList.size())));
        target = flowerList.get(random);
    }

    /**
     * Moves the bee a fixed distance towards the target flower.
     */
    public void move(List<Flower> flowerList){
        if(target == null){
            chooseTarget(flowerList); //sets a new target if the old target was reached
        }
        double targetX = target.getImageView().getX();
        double targetY = target.getImageView().getY();
        double currentX = imageView.getX();
        double currentY = imageView.getY();
        double newX, newY;


        /*
        gets the new x value for the bee based on the target
         */
        if(Math.abs(targetX - currentX) > 10.0){
            if(targetX > currentX){
                newX = currentX + 10.0;
            } else {
                newX = currentX - 10.0;
            }
        } else{
            newX = targetX;
        }

        /*
        gets the new y value for the bee based on the target
         */
        if(Math.abs(targetY - currentY) > 10.0){
            if(targetY > currentY){
                newY = currentY + 10.0;
            } else {
                newY = currentY - 10.0;
            }
        } else{
            newY = targetY;
        }

        imageView.setX(newX);
        imageView.setY(newY);
    }
    
}
