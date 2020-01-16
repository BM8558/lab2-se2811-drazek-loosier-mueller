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
import javafx.scene.layout.Pane;

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

    public void initialize() {
        gardenPane.setStyle("-fx-background-color: linear-gradient(to bottom right," +
                " derive(forestgreen, 20%), derive(forestgreen, -40%));");

    }
}
