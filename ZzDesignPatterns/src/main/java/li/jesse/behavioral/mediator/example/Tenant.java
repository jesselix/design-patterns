package li.jesse.behavioral.mediator.example;

public abstract class Tenant{
    private RealEstateAgents agent;
    public Tenant(RealEstateAgents agent) {
        this.agent = agent;
    }
    public abstract void crying();
    public void renting(){
        agent.sell(this);
    }
}

