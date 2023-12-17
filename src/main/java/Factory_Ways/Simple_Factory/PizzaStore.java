package Factory_Ways.Simple_Factory;

public class PizzaStore {

    SimpleFactoryPizza simpleFactoryPizza;

    public PizzaStore(SimpleFactoryPizza simpleFactoryPizza) {
        this.simpleFactoryPizza = simpleFactoryPizza;
    }

    public Pizza orderPizza(String type)
    {
        Pizza pizza = null;
        pizza = simpleFactoryPizza.createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
