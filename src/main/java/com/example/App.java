package com.example;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

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
        stage.initStyle(StageStyle.UTILITY);
        stage.setScene(loginScene);
        stage.show();
    }

}
// #468189