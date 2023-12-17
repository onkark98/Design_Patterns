package Strategy_Pattern;

public class MallardDuck extends Duck{

    public MallardDuck() {
        quackBehavior = new Quak();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("Mallard Duck");
    }
}
