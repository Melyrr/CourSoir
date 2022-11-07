package com.example.ayaa;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) {
        double width = 100;
        int nr = 5;
        Canvas canvas = new Canvas(nr * width, 3 * width);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        drawOval(canvas, width, 0, 0);
        drawOval(canvas, width, 100, 0.25);
        drawOval(canvas, width, 200, 0.5);
        drawOval(canvas, width, 300, 0.75);
        drawOval(canvas, width, 400, 1);

        stage.setScene(new Scene(new VBox(canvas)));
        stage.setTitle("Pogression de gris ( avec méthode)");
        stage.show();
    }
    private void drawOval(Canvas canvas, double width, double x, double percent) {
        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.setFill(Color.color(percent, percent, percent));
        gc.fillOval(x, 0, width, 3 * width);
    }
}