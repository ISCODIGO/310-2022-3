package com.example.player;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import java.io.File;
import java.util.List;

public class PlayerController {
    @FXML Button buttonPlay;
    @FXML Button buttonStop;
    @FXML Button buttonPause;
    @FXML Button buttonOpenFile;
    @FXML TextArea textLogger;
    @FXML TextArea textFiles;
    FileChooser fileChooser;
    Stage stage;
    List<File> files;
    MusicPlayer musicPlayer = new MusicPlayer();
    boolean paused = false;

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    public void startButtons() {
        this.buttonPlay.setDisable(true);
        this.buttonStop.setDisable(true);
        this.buttonPause.setDisable(true);
    }

    @FXML protected void playClick() {
        if (this.files == null || this.files.size() == 0) {
            textLogger.appendText("No hay archivos cargados\n");
        } else {
            textLogger.appendText("Reproducir archivo\n");
            // TODO: Solo carga el primer archivo
            musicPlayer.startPlaying(this.files.get(0).getAbsolutePath());
        }
        paused = false;  // impedir reanudacion
        buttonPlay.setDisable(true);
        buttonPause.setDisable(false);
        buttonStop.setDisable(false);
    }

    @FXML protected void stopClick() {
        textLogger.appendText("Detener archivo file\n");
        musicPlayer.stop();
        buttonStop.setDisable(true);
        buttonPause.setDisable(true);
        buttonPlay.setDisable(false);
    }

    @FXML protected void pauseClick() {
        if (paused) {
            musicPlayer.resume();
            textLogger.appendText("Reanudar archivo\n");
        } else {
            musicPlayer.pause();
            textLogger.appendText("Pausar archivo\n");
        }
        paused = !paused;
    }

    @FXML protected void openFileClick() {
        FileChooser.ExtensionFilter fileExtensions =
                new FileChooser.ExtensionFilter("MP3 Files", "*.mp3");

        fileChooser = new FileChooser();
        fileChooser.setTitle("Elegir un archivo");
        fileChooser.getExtensionFilters().add(fileExtensions);
        this.files = fileChooser.showOpenMultipleDialog(this.stage);

        if (this.files == null) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Advertencia");
            alert.setHeaderText("No se especifico ningun archivo");
            alert.showAndWait();
            return;
        }

        for (File file : this.files) {
            textFiles.appendText(file.getAbsolutePath() + "\n");
        }
        this.buttonPlay.setDisable(false);
    }

    @FXML public void exitApplication() {
        System.out.println("Cerrando app");
        musicPlayer.stop();
        Platform.exit();
    }
}
