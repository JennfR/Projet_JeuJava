package HomePage;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class HomePageController {
    HomePageController homePageController = new HomePageController();

    @FXML
    public void startSnake(){
        System.out.println("Snake");
    }

    @FXML
    public void startTimeline() {

        System.out.println("TimeLine");
    }

    @FXML
    public void startJeuDuJour(){
        int day = 0;
        if (day%2==0){
            homePageController.startSnake();
        }else{
            homePageController.startTimeline();
        }
    }

}
