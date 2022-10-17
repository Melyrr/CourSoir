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
        Canvas canvas = new Canvas(500, 300);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        Circle[] circles = {
                new Circle(Color.color(1, 1, 0), 0, 0, 100),
                new Circle(Color.color(0, 1, 1), 100, 100, 100),
                new Circle(Color.color(1, 0, 1), 200, 200, 100)
        };

        for (Circle c : circles) {
            gc.setFill(c.color());
            gc.fillOval(c.x(), c.y(), c.radius(), c.radius());
        }
        stage.setTitle("Jouons avec RGB.");
        stage.setScene(new Scene(new VBox(canvas)));
        stage.show();
    }
    public static void main(String[] args) {
        launch();
    }
}