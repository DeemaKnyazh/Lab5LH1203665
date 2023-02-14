module com.example.lab5lh1203665 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.lab5lh1203665 to javafx.fxml;
    exports com.example.lab5lh1203665;
}