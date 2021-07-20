package strategy;

public class MallardDuck extends Duck{

    @Override
    public void performQuack() {
        new Quack().quack();
    }

    @Override
    public void performFly() {
        new FlyWithWings().fly();
    }

    @Override
    public void display() {

    }
}
