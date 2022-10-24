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
        double width = 100;
        Canvas canvas = new Canvas(500, 300);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.setFill(Color.RED);
        gc.fillRect(0, 0, canvas.getWidth(), canvas.getHeight());


        drawOval(canvas, 100, 0,0);
        drawOval(canvas, 100, 100,0.25);
        drawOval(canvas, 100, 200,0.5);
        drawOval(canvas, 100, 300,0.75);
        drawOval(canvas, 100, 400,1);


        stage.setScene(new Scene(new VBox(canvas)));
        stage.setTitle("Progression de gris");
        stage.show();
    }
    private void drawOval(Canvas canvas, double width, double x, double percent){
        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.setFill(Color.color(percent,percent,percent));
        gc.fillOval(x,0,width,3*width);
    }
    public static void main(String[] args) {
        launch();
    }
}