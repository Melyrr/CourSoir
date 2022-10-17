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
        Canvas canvas = new Canvas(300, 300);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.setFill(Color.color(1,1,0));
        gc.fillOval(0, 10, size, size);
        gc.setFill(Color.color(0,1,1));
        gc.fillOval(100, 100, size, size);
        gc.setFill(Color.color(1,0,1));
        gc.fillOval(200, 200, size, size);
        stage.setTitle("Jouons avec RGB.");
        stage.setScene(new Scene(new VBox(canvas)));
        stage.show();
    }
    public static void main(String[] args) {
        launch();
    }
}