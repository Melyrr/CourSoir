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
        Canvas canvas = new Canvas(500,500);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.setFill(Color.BLACK);
        gc.fillRect(0, 0, 500, 500);
        gc.setFill(Color.RED);
        gc.fillRect(100, 50, 100, 100);
        gc.setFill(Color.GREEN);
        gc.fillRect(300, 100, 100, 100);
        gc.setFill(Color.BLUE);
        gc.fillRect(50, 300, 100, 100);
        stage.setTitle("Trois triangles !");
        stage.setScene(new Scene(new VBox(canvas)));
        stage.show();
    }
    public static void main(String[] args) {
        launch();
    }
}