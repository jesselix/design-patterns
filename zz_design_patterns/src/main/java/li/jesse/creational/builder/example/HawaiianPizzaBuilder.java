package li.jesse.creational.builder.example;

public class HawaiianPizzaBuilder extends PizzaBuilder
{
    @Override
    public void buildDough()
    {
        pizza.setDough("cross");
        System.out.println(pizza.getDough());
    }

    @Override
    public void buildSauce()
    {
        pizza.setSauce("mild");
        System.out.println(pizza.getSauce());
    }

    @Override
    public void buildTopping()
    {
        pizza.setTopping("ham+pineapple");
        System.out.println(pizza.getTopping());
    }
}
