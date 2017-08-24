package li.jesse.behavioral.strategy;

import li.jesse.behavioral.strategy.sample.AdvancedMemberStrategy;
import li.jesse.behavioral.strategy.sample.MemberStrategy;
import li.jesse.behavioral.strategy.sample.Price;
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
