package decorator;

public class Decaf extends Beverage{

    public Decaf(){
        description = "Decaffeinated";
    }

    public double cost(){
        return 1.05;
    }
}
