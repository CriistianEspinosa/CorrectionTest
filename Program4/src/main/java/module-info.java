module com.example.program4 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.program4 to javafx.fxml;
    exports com.example.program4;
}