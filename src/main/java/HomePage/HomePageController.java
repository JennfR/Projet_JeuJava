package HomePage;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import java.io.IOException;

public class HomePageController {

    private Stage stage = new Stage();

    @FXML
    public void startSnake(){
        System.out.println("Snake");
        FXMLLoader fxmlLoader = new FXMLLoader(HomePageApplication.class.getResource("Timeline.fxml"));
        try {
            // Load the scene from FXML and show it in a new stage
            Scene scene = new Scene(fxmlLoader.load());
            stage.setScene(scene);
            stage.setTitle("Planet around the Sun");
            stage.show();
        } catch (IOException e) {
            System.out.println("Something went wrong: " + e.getMessage());
        }
    }

    @FXML
    public void startTimeline() {
        System.out.println("TimeLine");
        FXMLLoader fxmlLoader = new FXMLLoader(HomePageApplication.class.getResource("Snake.fxml"));
        try {
            // Load the scene from FXML and show it in a new stage
            Scene scene = new Scene(fxmlLoader.load());
            stage.setScene(scene);
            stage.setTitle("Planet around the Sun");
            stage.show();
        } catch (IOException e) {
            System.out.println("Something went wrong: " + e.getMessage());
        }
    }

    @FXML
    public void startJeuDuJour(){
        int day = 0;
        if (day%2==0){
            this.startSnake();
        }else{
            this.startTimeline();
        }
    }

}
