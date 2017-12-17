package li.jesse.behavioral.mediator.example;

public class TenantB extends Tenant{
    public TenantB(RealEstateAgents agent) {
        super(agent);
    }
    public void crying() {
        System.out.println("我是白富美 TenantB！哎呀我想要！");
    }
}
