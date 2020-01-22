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

import java.io.FileInputStream;
import java.io.IOException;
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
    Image dirBeeImage;
    Image ranBeeImage;
    Image goodFlowerImage;
    Image badFlowerImage;

    @FXML
    private Pane gardenPane;
    @FXML
    ImageView dirBeeView;
    @FXML
    ImageView ranBeeView;
    @FXML
    ImageView goodFlowerView;
    @FXML
    ImageView badFlowerView;

    private ArrayList<Bee> beeList = new ArrayList<>();
    private ArrayList<Flower> flowerList = new ArrayList<>();
    private ArrayList<Entity> entityList = new ArrayList<>();

    public void initialize() {
        gardenPane.setStyle("-fx-background-color: linear-gradient(to bottom right," +
                " derive(forestgreen, 20%), derive(forestgreen, -40%));");

        dirBeeImage = dirBeeView.getImage();
        ranBeeImage = ranBeeView.getImage();
        goodFlowerImage = goodFlowerView.getImage();
        badFlowerImage = badFlowerView.getImage();

        beeList.add(new BeeDirected(100, 100, 50, new ImageView(dirBeeImage)));
        beeList.add(new BeeRandom(600, 800, 50, new ImageView(ranBeeImage)));
        entityList.addAll(beeList);
        flowerList.add(new GoodFlower(450, 100, 50, new ImageView(goodFlowerImage)));
        flowerList.add(new GoodFlower(450, 600, 50, new ImageView(goodFlowerImage)));
        flowerList.add(new BadFlower(100, 350, 50, new ImageView(badFlowerImage)));
        flowerList.add(new BadFlower(800, 350, 50, new ImageView(badFlowerImage)));
        entityList.addAll(flowerList);
        for (Entity obj: entityList) {
            ImageView temp = obj.getImageView();
            temp.setPreserveRatio(false);
            temp.setFitWidth(50);
            temp.setFitHeight(50);
            gardenPane.getChildren().add(temp);
        }
        tick();
    }

    @FXML
    public void onKeyPressed(KeyEvent keyEvent) {
        if (keyEvent.getCode() == KeyCode.RIGHT) {
            tick();
        }
    }

    private void tick() {
        moveAll();
        checkCollision();
        updateDisplay();
    }

    private void moveAll() {
        for (Bee bee: beeList) {
            int x = 1;
            bee.move(flowerList);
        }
    }

    private void checkCollision() {
        for (int i = 0; i < beeList.size(); i++) {
            for (int j = i + 1; j < entityList.size(); j++) {
                int s = i + j;
                beeList.get(i).collide(entityList.get(j));
            }
        }
    }

    private void updateDisplay() {
        for (Entity obj: entityList) {
            obj.getImageView().setX(obj.getxPos());
            obj.getImageView().setY(obj.getyPos());
            if (obj.energy <= 0) {
                obj.getImageView().setOpacity(50.0);
            }
        }
    }
}
