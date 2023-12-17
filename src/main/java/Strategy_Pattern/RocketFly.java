package Strategy_Pattern;

public class RocketFly implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("Flying like a rocket!");
    }
}
