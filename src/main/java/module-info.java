module com.example.csd214test3jaspreet {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.almasb.fxgl.all;

    opens com.example.csd214test3jaspreet to javafx.fxml;
    exports com.example.csd214test3jaspreet;
}