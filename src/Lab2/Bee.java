/*
 * CS1021-081
 * Winter 2018-2019
 * File header contains class Bee
 * Name: muellerbs
 * Created 12/17/2019
 */
package Lab2;

import javafx.scene.image.ImageView;

import java.util.ArrayList;
import java.util.Collection;

/**
 * CS1021-081 Winter 2018-2019
 * Class purpose: bee
 *
 * @author drazek-loosierc
 * @version created on 12/17/2019 at 7:26 PM
 */
public abstract class Bee extends Entity {
    int xPos, yPos, energy;
    static final double MOVE_DISTANCE = 10.0;
    ImageView imageView;

    /**
     * constructor for the random selecting bee
     * @param xPos the xpos for the bee
     * @param yPos the ypos for the bee
     * @param energy the energy of the bee
     * @param imageView the imageView for the bee
     */
    public Bee(int xPos, int yPos, int energy, ImageView imageView){
        super(xPos, yPos, energy, imageView);
    }

    /**
     * moves the bee a fixed distance in the bee's set pattern
     */
    public void move(ArrayList<Flower> flowerList){
        //moves the bee a fixed amount based on its particular strategy
    }

    @Override
    public int colWith(int energy) {
        this.energy += energy;
        return -1;
    }

    public void collide(Entity obj) {
        if (dist(obj) < 10 ){
            energy += obj.colWith(-1);
        }
    }

    private double dist(Entity obj) {
        double xd = Math.abs(xPos - obj.getxPos());
        double yd = Math.abs(yPos - obj.getyPos());
        return (Math.sqrt((xd * xd) + (yd * yd)));
    }
}
