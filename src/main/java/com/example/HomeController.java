package com.example;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class HomeController implements Initializable {

    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    private TextField searchBar;

    @FXML
    private Button newPostButton;

    @FXML
    private Button settingsButton;

    @FXML
    private Button logoutButton;

    @FXML
    private GridPane postsGrid;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        int rows = 0;

        try {
            for (int i = 0; i < 5; i++) {
                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(getClass().getResource("post_card.fxml"));

                HBox postCard = fxmlLoader.load();

                postsGrid.add(postCard, 0, rows++);
                GridPane.setMargin(postCard, new Insets(8));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void newPostAction(ActionEvent e) throws IOException {
        root = FXMLLoader.load(getClass().getResource("new_post.fxml"));
        stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void settingsAction(ActionEvent e) throws IOException {
        root = FXMLLoader.load(getClass().getResource("settings.fxml"));
        stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void logoutAction(ActionEvent e) throws IOException {
        // TODO: MOCK

        root = FXMLLoader.load(getClass().getResource("login.fxml"));
        stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void searchAction(ActionEvent e) throws IOException {
        // TODO: MOCK
    }

}
