package com.example.player;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class PlayerApp extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(PlayerApp.class.getResource("player-view.fxml"));

        Parent root = (Parent) fxmlLoader.load();
        PlayerController controller = fxmlLoader.getController();
        controller.setStage(primaryStage);

        Scene scene = new Scene(root, 600, 400);
        primaryStage.setTitle("Reproductor MP3");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
