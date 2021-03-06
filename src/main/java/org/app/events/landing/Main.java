package org.app.events.landing;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.app.events.registration.services.UserService;

public class Main extends Application
{

    @Override
    public void start(Stage primaryStage) throws Exception
    {
        UserService.loadUsersFromFile();
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("./landing/landing.fxml"));
        primaryStage.setTitle("Events App");
        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
