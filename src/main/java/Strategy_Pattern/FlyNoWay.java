package Strategy_Pattern;

public class FlyNoWay implements FlyBehavior{
    @Override
    public void fly() {
        //no fly
        System.out.println("I can't fly");
    }
}
