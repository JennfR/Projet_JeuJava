package SnakesAndLadders;

public class Static extends Events{

    public Static(int numCase){
        super(numCase);
    }

    public int setStateMove(int State){
        return State =1;
    }

    public int setStateFreeze(int State){
        return State =0;
    }

    public int setStateBonus(int State){
        return State =2;
    }

}
