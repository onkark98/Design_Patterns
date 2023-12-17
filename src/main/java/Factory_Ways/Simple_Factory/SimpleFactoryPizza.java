package Factory_Ways.Simple_Factory;

public class SimpleFactoryPizza {

    public Pizza createPizza(String type)
    {
        Pizza pizza = null;
        if(type == "Cheese") {
            pizza = new CheesePizza();
        }
        else if(type=="Pepperoni"){
            pizza = new PepperoniPizza();
        }
        else if(type=="Clam"){
            pizza = new ClamPizza();
        }
        else if(type=="Veggie"){
            pizza = new VeggiePizza();
        }

        return pizza;
    }
}
