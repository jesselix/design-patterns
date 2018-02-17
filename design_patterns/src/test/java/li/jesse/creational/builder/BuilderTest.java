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

    @Test
    public void testBuilder2() {
        User user = new User.UserBuilder("王", "小二").age(20).phone("123456789").address("亚特兰蒂斯大陆").build();

        System.out.println(user.getAddress());

    }
}
