package com.example;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class App extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws IOException {
        String cssPath = getClass().getResource("styles.css").toExternalForm();
        Parent loginRoot = FXMLLoader.load(getClass().getResource("login.fxml"));
        Scene loginScene = new Scene(loginRoot);

        loginScene.getStylesheets().add(cssPath);

        stage.setResizable(false);
        stage.setTitle("Ribbit");
        stage.getIcons().add(new Image(getClass().getResourceAsStream("globe.png")));
        stage.setScene(loginScene);
        stage.show();
    }

}
// #B9EBD4 #F4F1E3 #F9BBB4 #F9BF7F