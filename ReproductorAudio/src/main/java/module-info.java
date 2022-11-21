module com.example.reproductormp3 {
    requires javafx.controls;
    requires javafx.fxml;
    requires jlayer;


    opens com.example.player to javafx.fxml;
    exports com.example.player;
}