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
        double width = 500;
        double a = 0;
        Canvas canvas = new Canvas(500, 500);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        gc.setFill(Color.BLACK);
        gc.fillRect(0, 0, canvas.getWidth(), canvas.getHeight());

        for (int i = 0; i < 20; ++i) {
            gc.setFill(Color.color(Math.random(), Math.random(), Math.random()));
            gc.fillRect(a,a,width,width);
            width=width-25;
            a=a+12.5;
        }

        stage.setScene(new Scene(new VBox(canvas)));
        stage.setTitle("Rectangle inmbriqué avec des couleurs différentes");
        stage.show();
    }
    public static void main(String[] args) {
        launch();
    }
}