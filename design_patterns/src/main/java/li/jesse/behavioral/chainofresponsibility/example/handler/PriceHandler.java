package li.jesse.behavioral.chainofresponsibility.example.handler;

public abstract class PriceHandler
{
    protected PriceHandler successor;

    public void setSuccessor(PriceHandler successor)
    {
        this.successor = successor;
    }

    public abstract void processDiscount(float discount);

    public static PriceHandler createPriceHandler()
    {
        PriceHandler salesperson = new Salesperson();
        PriceHandler manager = new Manager();
        PriceHandler boss = new Boss();

        salesperson.setSuccessor(manager);
        manager.setSuccessor(boss);

        return salesperson;
    }
}
