package Strategy_Pattern;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck duck = new ModelDuck();
        duck.performFly();
        duck.setFlyBehavior(new RocketFly());
        duck.performFly();
    }
}
