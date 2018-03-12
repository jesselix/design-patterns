package li.jesse.creational.builder;

import li.jesse.creational.builder.example.*;
import org.junit.Test;

public class BuilderTest
{
    @Test
    public void testBuilder()
    {
        Waiter waiter = new Waiter();
        PizzaBuilder hawaiian_pizzabuilder = new HawaiianPizzaBuilder();
        PizzaBuilder spicy_pizzabuilder = new SpicyPizzaBuilder();

        waiter.setPizzaBuilder ( hawaiian_pizzabuilder );
        waiter.constructPizza();

        Pizza pizza = waiter.getPizza();
    }
}
