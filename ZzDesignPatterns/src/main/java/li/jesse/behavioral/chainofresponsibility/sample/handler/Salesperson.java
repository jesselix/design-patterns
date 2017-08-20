package li.jesse.behavioral.chainofresponsibility.sample.handler;

public class Salesperson extends PriceHandler
{
    @Override
    public void processDiscount(float discount)
    {
        if (discount <= 0.3)
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
