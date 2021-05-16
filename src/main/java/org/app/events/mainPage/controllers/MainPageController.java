package org.app.events.mainPage.controllers;



import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;

import javafx.stage.Stage;

import java.io.IOException;

public class MainPageController {


    @FXML
    private Button LogOutBtn;
    @FXML
    public void changeToLanding() throws IOException
    {
        Stage stage = (Stage)LogOutBtn.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("landing.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}