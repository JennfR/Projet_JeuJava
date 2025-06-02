module com.example.demo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.demo to javafx.fxml;
    exports com.example.demo;
    exports Snake;
    opens Snake to javafx.fxml;
    exports HomePage;
    opens HomePage to javafx.fxml;
}