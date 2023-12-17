package Strategy_Pattern;

public class ModelDuck extends Duck{
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quak();
    }

    @Override
    public void display() {
        System.out.println("I'm Model Duck");
    }
}
