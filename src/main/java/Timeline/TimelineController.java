package Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.stage.Stage;
import javafx.scene.control.Button;

import java.util.HashMap;
import java.util.Map;

public class TimelineController{
    private int selectedCardIndex;
    private Map<Integer, Button> carButtons  = new HashMap<>();
    private Map<Integer, Button> spaceButtons = new HashMap();
    @FXML
    public void setButton(String path)
    {

    }
    public void initialize(Card TabCard[]){
        for (int i=0;i<5;i++)
        {
          TabCard[i].setFirstPosition(i);
        }
        carButtons.put(1, Button);
        carButtons.put(2, TabCard[1]);
        carButtons.put(3, TabCard[2]);
        carButtons.put(4, TabCard[3]);
        carButtons.put(5, TabCard[4]);
    }
    protected int Select_the_card(ActionEvent event){

    }

}
