package Snake;

public class Questions extends Static {
    protected String type;
    protected String question;
    protected String answer;

    public Questions(int numCase,String type, String question, String answer){
        super(numCase);
        this.type=type;
        this.question=question;
        this.answer =answer;

    }

    //si l'on ne veut pas preciser le type de question (à voir)
    public Questions(int numCase,String question, String answer){
        super(numCase);
        this.question=question;
        this.answer =answer;
    }

    public void setType(String type){
        this.type=type;
    }

    public void displayQuestion(){
        System.out.println(this.question);
    }

    public void displayAnswer(){
        System.out.println(this.answer);
    }
}
