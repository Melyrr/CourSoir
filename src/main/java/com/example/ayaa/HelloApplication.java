package com.example.ayaa;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.GraphicsContext;
import javafx.stage.Stage;
import javafx.scene.canvas.Canvas;
import javafx.scene.paint.Color;
import javafx.scene.layout.VBox;
import java.io.IOException;
import java.lang.Math;
import java.util.Random;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Canvas canvas = new Canvas(800, 800);
        GraphicsContext gc = canvas.getGraphicsContext2D();



        gc.setFill(Color.color(Math.random(), Math.random(), Math.random()));
        gc.fillRect(0, 0, canvas.getWidth(), canvas.getHeight());
        gc.setFill(Color.color(Math.random(), Math.random(), Math.random()));
        gc.fillOval(0,0,800,800);
        gc.setFill(Color.color(Math.random(), Math.random(), Math.random()));
        gc.fillRect(118,115,560, 570);
        canvas.setOnMouseMoved(event -> {
                    System.out.println(event.getX() + " " + event.getY());
                });




        stage.setScene(new Scene(new VBox(canvas)));
        stage.setTitle("Rectangle inmbriqué avec des couleurs différentes*4");
        stage.show();
    }
    public static void main(String[] args) {
        launch();
    }
}