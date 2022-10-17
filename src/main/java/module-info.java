module com.example.ayaa {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ayaa to javafx.fxml;
    exports com.example.ayaa;
}