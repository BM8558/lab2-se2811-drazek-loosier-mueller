/*
 * CS1021-081
 * Winter 2018-2019
 * File header contains FX app Garden
 * Name: drazek-loosierc
 * Created 12/17/2019
 */
package Lab2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Garden extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("garden.fxml"));
        primaryStage.setTitle("adjusted value of bees");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
}
