package SnakesAndLadders;

public class Player {
    //instances
    private String color;
    private int position;
    private int state;
    private int numPlayer;

    //constructor
    public Player(String color, int numPlayer){
        this.color=color;
        this.position =1;
        this.numPlayer=numPlayer;
    }

    public Player( int numPlayer){ //2nd constructor if you don't want to set a color
        this.position =1;
        this.numPlayer=numPlayer;
    }

    //methods
    public void setColor(String color) {this.color = color;}

    public void setState(int state) {this.state = state;}

    public void setPosition(int add) {this.position += add;}

    public int getPosition() {return position;}

    public int getNumPlayer() {return numPlayer;}

    public int getState(){return state;}

    /*public int diceThrow(){
        if (state==0){
            ;
        }
        if (this.state==1){
            ;
            //Player.setPosition(number.nextInt(1,6));

            ;
        }
    }*/

    public void restartGame(){
        this.state=1;
        this.position =1;
    }
}
