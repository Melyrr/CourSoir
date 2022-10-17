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
        Canvas canvas = new Canvas(500,500);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        Square[] squares = {
                new Square(Color.RED,100,50),
                new Square(Color.BLACK,300,100),
                new Square(Color.BLUE,50,300),
        };
        for ( Square square : squares){
            gc.setFill(square.color());
            gc.fillRect(square.x(),square.y(),100,100);
        }
        stage.setTitle("Trois triangles !");
        stage.setScene(new Scene(new VBox(canvas)));
        stage.show();
    }
    public static void main(String[] args) {
        launch();
    }
}