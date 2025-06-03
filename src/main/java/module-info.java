module com.example.demo {
    requires javafx.controls;
    requires javafx.fxml;


    opens HomePage to javafx.fxml;
    exports SnakesAndLadders;
    opens SnakesAndLadders to javafx.fxml;
    exports HomePage;
}