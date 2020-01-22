/*
 * CS1021-081
 * Winter 2018-2019
 * File header contains class GardenController
 * Name: drazek-loosierc
 * Created 12/17/2019
 */
package Lab2;

import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * CS1021-081 Winter 2018-2019
 * Class purpose: controll
 *
 * @author drazek-loosierc
 * @version created on 12/17/2019 at 7:34 PM
 */
public class GardenController {
    private ImageView beeImage;

    @FXML
    private Pane gardenPane;

    private ArrayList<Bee> beeList = new ArrayList<>();
    private ArrayList<Flower> flowerList = new ArrayList<>();
    private ArrayList<Entity> entityList = new ArrayList<>();

    public void initialize() {
        gardenPane.setStyle("-fx-background-color: linear-gradient(to bottom right," +
                " derive(forestgreen, 20%), derive(forestgreen, -40%));");

        beeList.add(new BeeDirected(100, 100, 50, new ImageView(beeImage.getImage())));
        beeList.add(new BeeRandom(600, 800, 50, new ImageView(beeImage.getImage())));
        entityList.addAll(beeList);
        flowerList.add(new GoodFlower(450, 100, 50, new ImageView(beeImage.getImage())));
        flowerList.add(new GoodFlower(450, 600, 50, new ImageView(beeImage.getImage())));
        flowerList.add(new BadFlower(100, 350, 50, new ImageView(beeImage.getImage())));
        flowerList.add(new BadFlower(800, 350, 50, new ImageView(beeImage.getImage())));
        entityList.addAll(flowerList);
        for (Entity obj: entityList) {
            gardenPane.getChildren().add(obj.getImageView());
        }
        tick();
    }

    @FXML
    public void onKeyPressed(KeyEvent keyEvent) {
        tick();
    }

    private void tick() {
        moveAll();
        checkCollision();
        updateDisplay();
    }

    private void moveAll() {
        for (Bee bee: beeList) {
            bee.move(flowerList);
        }
    }

    private void checkCollision() {
        for (int i = 0; i < entityList.size(); i++) {
            for (int j = i + 1; j < entityList.size(); j++) {
                entityList.get(i).collide(entityList.get(j));
            }
        }
    }

    private void updateDisplay() {
        for (Entity obj: entityList) {
            obj.getImageView().setX(obj.getXPos());
            obj.getImageView().setY(obj.getYPos());
        }
    }
}
