package com.example;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginController {

    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    private Button signInButton;

    @FXML
    private Button registerButton;

    @FXML
    private Hyperlink signInText;

    @FXML
    private Hyperlink registerText;

    @FXML
    private TextField loginEmailField;

    @FXML
    private TextField loginPasswordField;

    @FXML
    private TextField registerEmailField;

    @FXML
    private TextField registerPasswordField;

    @FXML
    private TextField confirmPasswordField;

    public void switchToLogin(ActionEvent e) throws IOException {
        root = FXMLLoader.load(getClass().getResource("login.fxml"));
        stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToRegister(ActionEvent e) throws IOException {
        root = FXMLLoader.load(getClass().getResource("register.fxml"));
        stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void signInAction(ActionEvent e) {
        System.out.println("Logged in");
    }

    public void registerAction(ActionEvent e) {
        System.out.println("Registered");
    }

}
