package li.jesse.behavioral.chainofresponsibility.sample.handler;

public class Boss extends PriceHandler
{
    public void processDiscount(float discount)
    {
        if (discount <= 0.8)
        {
            System.out.format("%s批准了", this.getClass().getName());
            System.out.println();
        }
        else
        {
            System.out.format("%s拒绝了", this.getClass().getName());
            System.out.println();
        }
    }
}
