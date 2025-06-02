package Snake;

public class Player {
    private String name;
    private String color;
    private int numCase;
    private int state;
    private int numPlayer;

    public Player(String name, String color, int numCase, int numPlayer){

    }

    public void setColor(String color) {this.color = color;}

    public void setName(String name) {this.name = name;}

    public void setState(int state) {this.state = state;}

    public void setNumCase(int add) {this.numCase += add;}

    public String getName() {return name;}

    public int getNumCase() {return numCase;}

    public int getNumPlayer() {return numPlayer;}

    /*public int diceThrow(){
        if (state==0){
            ;
        }
        if (this.state==1){
            ;
            //Player.setNumCase(number.nextInt(1,6));
            //Moi aussi je travaille bande de chiens
            ;
        }
    }*/

    public void restartGame(){
        this.state=1;
        this.numCase=1;
    }
}
