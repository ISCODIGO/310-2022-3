package com.example.player;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;

public class PlayerController {
    @FXML Button buttonPlay;
    @FXML Button buttonStop;
    @FXML Button buttonPause;
    @FXML Button buttonOpenFile;
    @FXML TextArea textLogger;
    FileChooser fileChooser;
    Stage stage;
    File file;

    MusicPlayer musicPlayer = new MusicPlayer();
    boolean paused = false;

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    @FXML protected void playClick() {
        if (this.file == null) {
            textLogger.appendText("No hay archivo cargado\n");
        } else {
            textLogger.appendText("\tReproducir archivo\n");
            musicPlayer.startPlaying(this.file.getAbsolutePath());
        }
    }

    @FXML protected void stopClick() {
        textLogger.appendText("\tDetener archivo file\n");
        musicPlayer.stop();
        paused = true;  // permitir la posibilidad de reanudar
    }

    @FXML protected void pauseClick() {
        if (paused) {
            textLogger.appendText("\tReanudar archivo\n");
            musicPlayer.resume();
        } else {
            textLogger.appendText("\tPausar archivo\n");
            musicPlayer.pause();
        }

        paused = !paused;
    }

    @FXML protected void openFileClick() {
        fileChooser = new FileChooser();
        fileChooser.setTitle("Elegir un archivo");
        this.file = fileChooser.showOpenDialog(this.stage);
        textLogger.appendText(String.format("Archivo: %s%n", this.file.getAbsolutePath()));
    }
}
