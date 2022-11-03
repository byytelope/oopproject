package com.example;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class PostController implements Initializable {

    private Stage stage;
    private Scene scene;
    private Parent root;
    private int votes = 0;
    private String title = "This is an example title for this post";
    private String content = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum. Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
    private String authorName = "Author";
    private String date = "10.09.2022";

    @FXML
    private Button backButton;

    @FXML
    private Button upvoteButton;

    @FXML
    private Button downvoteButton;

    @FXML
    private Button editButton;

    @FXML
    private Button deleteButton;

    @FXML
    private Circle authorAvatar;

    @FXML
    private Label dateLabel;

    @FXML
    private Text titleText;

    @FXML
    private Text contentText;

    @FXML
    private Text authorNameText;

    @FXML
    private Text votesText;

    @FXML
    private TextField commentField;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // TODO: MOCK

        votesText.setText(String.valueOf(this.votes));
        titleText.setText(this.title);
        contentText.setText(this.content);
        authorNameText.setText(this.authorName);
        dateLabel.setText(this.date);

    }

    public void upvoteAction(ActionEvent e) {
        // TODO: MOCK

        this.votes++;
        votesText.setText(String.valueOf(this.votes));
    }

    public void downvoteAction(ActionEvent e) {
        // TODO: MOCK

        this.votes--;
        votesText.setText(String.valueOf(this.votes));
    }

    public void backAction(ActionEvent e) throws IOException {
        // TODO: MOCK

        root = FXMLLoader.load(getClass().getResource("home.fxml"));
        stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    public void editAction(ActionEvent e) throws IOException {
        // TODO: MOCK

        root = FXMLLoader.load(getClass().getResource("edit_post.fxml"));
        stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    public void deleteAction(ActionEvent e) {
        // TODO: MOCK

    }

}
