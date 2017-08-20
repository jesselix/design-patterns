package li.jesse.behavioral.chainofresponsibility.sample;

import li.jesse.behavioral.chainofresponsibility.sample.handler.PriceHandler;

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
