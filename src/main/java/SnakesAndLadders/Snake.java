package SnakesAndLadders;

public class Snake extends Dynamic{

    public Snake(int startCase, int finishCase){
        super(startCase,finishCase); //what happens if you don't have a constructor above ? !!
    }

    public void displayMessage(){
        System.out.println("You have been eaten by the snake");
    }

    public void changePlayerPosition(Player player){
        //player must move backwards on the board
        player.setPosition(finishCase);
    }

}
