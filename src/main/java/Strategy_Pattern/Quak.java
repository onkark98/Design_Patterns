package Strategy_Pattern;

public class Quak implements QuackBehavior{

    @Override
    public void quack() {
        System.out.println("Quak");
    }
}
