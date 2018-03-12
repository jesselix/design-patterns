package li.jesse.behavioral.strategy;

import li.jesse.behavioral.strategy.example.AdvancedMemberStrategy;
import li.jesse.behavioral.strategy.example.MemberStrategy;
import li.jesse.behavioral.strategy.example.Price;
import org.junit.Test;

public class StrategyTest
{
    @Test
    public void testClient()
    {
        MemberStrategy strategy = new AdvancedMemberStrategy();
        Price price = new Price(strategy);

        double quote = price.quote(300);
        System.out.println("the price of the book is: " + quote);
    }
}
