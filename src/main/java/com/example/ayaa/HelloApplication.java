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

        FormParameters[] parameters = {
                new FormParameters(false, Color.DARKGOLDENROD, 100, 120, 400),
                new FormParameters(true, Color.DARKCYAN, -50, -50, 500),
                new FormParameters(true, Color.DARKMAGENTA, 200, 200, 250),
                new FormParameters(false, Color.DARKBLUE, 80, 100, 150)
        };

        for (FormParameters p : parameters) {
            gc.setFill(p.color());
            if (p.isCircle()){
                gc.fillOval(p.x(),p.y(),p.size(),p.size());
            }else{
                gc.fillRect(p.x(),p.y(),p.size(),p.size());
            }
        }

        stage.setTitle("N cercle ou carré");
        stage.setScene(new Scene(new VBox(canvas)));
        stage.show();
    }
    public static void main(String[] args) {
        launch();
    }
}