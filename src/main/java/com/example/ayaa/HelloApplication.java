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
        Canvas canvas = new Canvas(500, 500);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        Circle[] circles = {
                new Circle(Color.LIGHTCORAL, -120, 100, 600),
        new Circle(Color.ALICEBLUE, 180, 20, 450),
        new Circle(Color.ORANGE, 10, 10, 100),
        new Circle(Color.AQUAMARINE, 200, 300, 150),
        new Circle(Color.YELLOW, 30, 150, 120),
        new Circle(Color.AQUA, 3000, 200, 110)
        };

        for (Circle c : circles) {
            gc.setFill(c.color());
            gc.fillOval(c.x(), c.y(), c.radius(), c.radius());
        }
        stage.setTitle("n cercles en record !");
        stage.setScene(new Scene(new VBox(canvas)));
        stage.show();
    }
    public static void main(String[] args) {
        launch();
    }
}