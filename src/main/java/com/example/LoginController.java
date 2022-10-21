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
import javafx.scene.text.Text;
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
    private Text loginText;

    @FXML
    private Text registerText;

    @FXML
    private Hyperlink signInLink;

    @FXML
    private Hyperlink registerLink;

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

    protected void setError(Text textObj, String errorText) {
        textObj.setText(errorText);
        textObj.setStyle("-fx-fill: maroon");
    }

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
        boolean invalidCreds = loginEmailField.getText().isBlank()
                || loginPasswordField.getText().isBlank();

        if (invalidCreds) {
            setError(loginText, "Invalid credentials. Please try again");
        } else {
            System.out.println("Logged in");
        }
    }

    public void registerAction(ActionEvent e) {
        boolean emailInvalid = registerEmailField.getText().isBlank();

        if (emailInvalid) {
            setError(registerText, "Please enter a valid email");
        } else if (registerPasswordField.getText().length() < 8) {
            setError(registerText, "Password must atleast 8 characters long");
        } else if (!confirmPasswordField.getText().equals(registerPasswordField.getText())) {
            setError(registerText, "Passwords do not match");
        } else {
            System.out.println("Registered");
        }
    }

}
