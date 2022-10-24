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
        Canvas canvas = new Canvas(500, 150);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        Circle[] circles = {
                new Circle(Color.rgb(255, 0, 0),          0,   0, 45),
                new Circle(Color.rgb(213, 16, 17),          50,   0, 45),
                new Circle(Color.rgb(170, 23, 23), 100, 0, 45),
                new Circle(Color.rgb(112, 65, 6), 150, 0, 45),
                new Circle(Color.rgb(86, 73, 14), 200, 0, 45),
                new Circle(Color.rgb(77, 94, 17), 250, 0, 45),
                new Circle(Color.rgb(160, 180, 53), 300, 0, 45),
                new Circle(Color.rgb(140, 190, 40), 400, 0, 45),
                new Circle(Color.rgb(100, 230, 60), 450, 0, 45),
                new Circle(Color.rgb(172, 255, 0), 500, 0, 45),

        };
        for(int i = 0; i < 5; ++i) {
            for (Circle c : circles) {
                gc.setFill(c.color());
                gc.fillOval(c.x(), c.y(), c.radius(), c.radius());
            }
        }
        stage.setTitle("Color RGB red-green-blue");
        stage.setScene(new Scene(new VBox(canvas)));
        stage.show();
    }
    public static void main(String[] args) {
        launch();
    }
}