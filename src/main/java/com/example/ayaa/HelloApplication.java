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
        gc.setFill(Color.WHEAT);
        gc.fillRect(0,0,500,500);
        Circle[] circles = {
                new Circle(Color.color(0, 0, 0),          0,   100, 100),
                new Circle(Color.color(1/4., 1/4., 1/4.), 100, 100, 100),
                new Circle(Color.color(2/4., 2/4., 2/4.), 200, 100, 100),
                new Circle(Color.color(3/4., 3/4., 3/4.), 300, 100, 100),
                new Circle(Color.color(4/4., 4/4., 4/4.), 400, 100, 100),
        };
        for(int i = 0; i < 5; ++i) {
            for (Circle c : circles) {
                gc.setFill(c.color());
                gc.fillOval(c.x(), c.y(), c.radius(), c.radius());
            }
        }
        stage.setTitle("5 cercle");
        stage.setScene(new Scene(new VBox(canvas)));
        stage.show();
    }
    public static void main(String[] args) {
        launch();
    }
}