package com.example.ayaa;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.GraphicsContext;
import javafx.stage.Stage;
import javafx.scene.canvas.Canvas;
import javafx.scene.paint.Color;
import javafx.scene.layout.VBox;
import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        int size = 100;
        Canvas canvas = new Canvas(400, 400);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        gc.setFill(Color.BLUE);
        gc.fillRect(0, 0, canvas.getWidth(), canvas.getHeight() / 2);
        gc.setFill(Color.PURPLE);
        gc.fillRect(0, canvas.getHeight() / 2, canvas.getWidth(), canvas.getHeight());

        canvas.setOnMouseMoved(event -> {
            System.out.println(event.getX() + " " + event.getY());
            if (event.getY() < canvas.getHeight() / 2) {
                gc.setFill(Color.AQUA);
                gc.fillRect(0, 0, canvas.getWidth(), canvas.getHeight() / 2);
                gc.setFill(Color.PURPLE);
                gc.fillRect(0, canvas.getHeight() / 2, canvas.getWidth(), canvas.getHeight());
            } else {
                gc.setFill(Color.BLUE);
                gc.fillRect(0, 0, canvas.getWidth(), canvas.getHeight() / 2);
                gc.setFill(Color.PINK);
                gc.fillRect(0, canvas.getHeight() / 2, canvas.getWidth(), canvas.getHeight());
            }
        });

        stage.setScene(new Scene(new VBox(canvas)));
        stage.setTitle("demo mouse");
        stage.show();
    }
    public static void main(String[] args) {
        launch();
    }
}