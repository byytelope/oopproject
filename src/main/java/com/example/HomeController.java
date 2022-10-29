package com.example;

import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;
import java.util.stream.Collectors;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;

public class HomeController implements Initializable {

    @FXML
    private ScrollPane scrollPane;

    @FXML
    private TextField searchBar;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        this.scrollPane.setFitToWidth(true);
    }

    private List<String> searchList(String terms, List<String> titlesList) {
        List<String> termsList = Arrays.asList(terms.trim().split(" "));

        return titlesList.stream().filter(input -> {
            return termsList.stream().allMatch(word -> input.toLowerCase().contains(word.toLowerCase()));
        }).collect(Collectors.toList());
    }

}
