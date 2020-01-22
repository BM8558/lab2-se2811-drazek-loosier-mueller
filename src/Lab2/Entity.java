package Lab2;
/*
 * CS1021-081
 * Winter 2018-2019
 * File header contains class Lab2.Entity
 * Name: muellerbs
 * Created 12/17/2019
 */

import javafx.scene.image.ImageView;

/**
 * CS1021-081 Winter 2018-2019
 * Class purpose: Class
 *
 * @author drazek-loosierc
 * @version created on 12/17/2019 at 7:23 PM
 */
public abstract class Entity {
    int xPos, yPos, energy;
    ImageView imageView;

    public static void main(String[] args) {
        //dummy code
    }

    /**
     * General constructor for entity objects with shared attributes
     * @param xPos the xpos of the entity
     * @param yPos the ypos of the entity
     * @param energy the energy of the entity
     * @param imageView the imageview for the entity
     */
    public Entity(int xPos, int yPos, int energy, ImageView imageView){
        this.xPos = xPos;
        this.yPos = yPos;
        this.energy = energy;
        this.imageView = imageView;
    }


    public ImageView getImageView() {
        return imageView;
    }

    public void setxPos(int xPos) {
        this.xPos = xPos;
    }

    /**
     * gets the x pos of the bee
     * @return
     */
    public int getxPos() {
        return xPos;
    }

    /**
     * sets y pos when the bee moves
     * @param yPos
     */
    public void setyPos(int yPos) {
        this.yPos = yPos;
    }

    public int getyPos() {
        return yPos;
    }
}
