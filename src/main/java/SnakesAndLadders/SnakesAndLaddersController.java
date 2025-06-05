package SnakesAndLadders;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class SnakesAndLaddersController {
    @FXML
    private Button DiceRoll;

    @FXML
    protected void displayMessage(){
        DiceRoll.setText("testClick");
    }

}
