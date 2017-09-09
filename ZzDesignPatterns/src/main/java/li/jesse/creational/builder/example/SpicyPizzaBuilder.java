package li.jesse.creational.builder.example;

public class SpicyPizzaBuilder extends PizzaBuilder
{
    @Override
    public void buildDough()
    {
        pizza.setDough("pan baked");
        System.out.println(pizza.getDough());
    }

    @Override
    public void buildSauce()
    {
        pizza.setSauce("hot");
        System.out.println(pizza.getSauce());
    }

    @Override
    public void buildTopping()
    {
        pizza.setTopping("pepperoni+salami");
        System.out.println(pizza.getTopping());
    }
}
