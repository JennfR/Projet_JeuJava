package Timeline;

import java.util.ArrayList;

public class Card {
    private String name; //Name of the event
    private int date; //Date of the event
    private int number;
    private String imagePath; //Path to the graphic element
    private int firstPosition; //Position of the card in the deck
    public Card(String name, int date, int number, String imagePath, int firstPosition )
    {
        this.name = name;
        this.date = date;
        this.imagePath= imagePath;
        this.firstPosition=firstPosition;
        this.number = number;
    }
    public int getCardNumber ()
    {
        return number;
    }
    public String getName()
    {
        return this.name;
    }
    public String getImagePath()
    {
        return this.imagePath;
    }
    public void setFirstPosition(int firstPosition)
    {
        this.firstPosition=firstPosition;
    }

}
