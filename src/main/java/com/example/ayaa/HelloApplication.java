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

        gc.setFill(Color.BLACK);
        gc.fillRect(0, 0, canvas.getWidth(), canvas.getHeight());

            double width = 400;
            double a = 0;
            for (int i = 0; i < 20; ++i) {
                gc.setFill(Color.color(Math.random(), Math.random(), Math.random()));
                gc.fillRect(a, a, width, width);
                width = width - 25;
                a = a + 12.5;
            }
            double b=400;
            double z = 400;
            for (int i = 0; i < 20; ++i) {
                gc.setFill(Color.color(Math.random(), Math.random(), Math.random()));
                gc.fillRect(b, b, z, z);
                z = z - 25;
                b = b + 12.5;
            }
            double az = 400;
            double av = 400;
            double am = 0;
            for (int i = 0; i < 20; ++i) {
                gc.setFill(Color.color(Math.random(), Math.random(), Math.random()));
                gc.fillRect(0+am, av, az, az);
                az = az - 25;
                av = av + 12.5;
                am= am + 12.5;
            }
        double ak = 400;
        double al = 400;
        double aj = 0;
        for (int i = 0; i < 20; ++i) {
            gc.setFill(Color.color(Math.random(), Math.random(), Math.random()));
            gc.fillRect(al, 0+aj, ak, ak);
            ak = ak - 25;
            al = al + 12.5;
            aj= aj + 12.5;
        }
        stage.setScene(new Scene(new VBox(canvas)));
        stage.setTitle("Rectangle inmbriqué avec des couleurs différentes*4");
        stage.show();
    }
    public static void main(String[] args) {
        launch();
    }
}