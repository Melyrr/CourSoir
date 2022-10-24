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
        double radius = 20;
        Canvas canvas = new Canvas(500, 500);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        gc.setFill(Color.BLACK);
        gc.fillRect(0, 0, canvas.getWidth(), canvas.getHeight());

        for (int i = 0; i < 500; ++i) {
            double x = Math.random() * (canvas.getWidth() - radius);
            double y = Math.random() * (canvas.getHeight() - radius);
            Random rand = new Random();
            int n = rand.nextInt(50);
            if(n>25){
                gc.setFill(Color.PURPLE);
            }else{
                gc.setFill(Color.YELLOW);
            }
            gc.fillOval(x, y, radius, radius);
        }

        stage.setScene(new Scene(new VBox(canvas)));
        stage.setTitle("Cercle placé au hasard");
        stage.show();
    }
    public static void main(String[] args) {
        launch();
    }
}