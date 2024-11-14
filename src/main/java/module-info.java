module com.example.demoxo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.demoxo to javafx.fxml;
    exports com.example.demoxo;
}