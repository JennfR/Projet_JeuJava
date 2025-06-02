module com.example.demo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.HomePage to javafx.fxml;
    exports com.example.HomePage;
    exports Snake;
    exports Images;
    opens Snake to javafx.fxml;
    exports HomePage;
    opens HomePage to javafx.fxml;
}