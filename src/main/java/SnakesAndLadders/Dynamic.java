package SnakesAndLadders;

abstract class Dynamic {
    protected int startCase;
    protected int finishCase;

    public Dynamic(int startCase, int finishCase){
        this.startCase=startCase;
        this.finishCase=finishCase;
    }

    //methods
    public int getStartCase(){
        return startCase;
    }

    public int getFinishCase(){
        return finishCase;
    }

    public abstract void displayMessage(); //message depends on if its snake or ladder

    public abstract void changePlayerPosition(Player player); //move up ladder, move down snake

}
