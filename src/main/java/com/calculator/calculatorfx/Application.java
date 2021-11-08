package com.calculator.calculatorfx;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Application extends javafx.application.Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource("FXMLDocument.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 400, 400);
        stage.setTitle("calculator");
        stage.setResizable(false);
        /*
        stage.setMaxHeight(400);
        stage.setMinHeight(400);
        stage.setMaxWidth(400);
        stage.setMinHeight(400);
        */

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
/*
https://www.youtube.com/watch?v=r1qowt6yYm8
Handling keyboard events with event handlers
https://docs.oracle.com/javafx/2/events/KeyboardExample.java.htm


 */