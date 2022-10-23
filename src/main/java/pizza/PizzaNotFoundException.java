package pizza;

public class PizzaNotFoundException extends RuntimeException{

    public PizzaNotFoundException (){
        super("Pizza not in menu.");
    }
}
