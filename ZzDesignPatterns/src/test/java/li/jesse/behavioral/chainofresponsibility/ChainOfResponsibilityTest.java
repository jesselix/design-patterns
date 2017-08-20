package li.jesse.behavioral.chainofresponsibility;

import li.jesse.behavioral.chainofresponsibility.sample.Customer;
import li.jesse.behavioral.chainofresponsibility.sample.handler.PriceHandler;
import org.junit.Test;

import java.util.Random;

public class ChainOfResponsibilityTest
{
    @Test
    public void testChainOfResponsibility()
    {
        Customer customer = new Customer();
        customer.setPriceHandler(PriceHandler.createPriceHandler());

        Random random = new Random();

        for (int i = 0; i < 20; i++)
        {
            System.out.print(i + ": ");
            customer.requestDiscount(random.nextFloat());
        }
    }
}
