module com.example.demo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.HomePage to javafx.fxml;
    exports Snake;
    opens Snake to javafx.fxml;
    exports HomePage;
    opens HomePage to javafx.fxml;
}