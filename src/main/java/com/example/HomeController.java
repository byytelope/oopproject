package com.example;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ScrollPane;

public class HomeController implements Initializable {

    @FXML
    private ScrollPane scrollPane;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        this.scrollPane.setFitToWidth(true);
    }

}
