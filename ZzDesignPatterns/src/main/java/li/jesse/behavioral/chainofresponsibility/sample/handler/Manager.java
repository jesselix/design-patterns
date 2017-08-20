package li.jesse.behavioral.chainofresponsibility.sample.handler;

public class Manager extends PriceHandler
{

    public void processDiscount(float discount)
    {
        if (discount <= 0.5)
        {
            System.out.format("%s批准了", this.getClass().getName());
            System.out.println();
        }
        else
        {
            successor.processDiscount(discount);
        }
    }
}
