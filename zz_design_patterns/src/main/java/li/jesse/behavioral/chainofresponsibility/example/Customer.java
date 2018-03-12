package li.jesse.behavioral.chainofresponsibility.example;

import li.jesse.behavioral.chainofresponsibility.example.handler.PriceHandler;

public class Customer
{
    private PriceHandler priceHandler;

    public void setPriceHandler(PriceHandler priceHandler)
    {
        this.priceHandler = priceHandler;
    }

    public void requestDiscount(float discount)
    {
        priceHandler.processDiscount(discount);
    }
}
