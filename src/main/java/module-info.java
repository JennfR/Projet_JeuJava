module com.example.demo {
    requires javafx.controls;
    requires javafx.fxml;


    opens HomePage to javafx.fxml;
    exports Snake;
    opens Snake to javafx.fxml;
    exports HomePage;
}