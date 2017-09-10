package li.jesse.behavioral.mediator.example;

public class TenantA extends Tenant{
    public TenantA(RealEstateAgents agent) {
        super(agent);
    }
    public void crying() {
        System.out.println("我是高富帅 TenantA！哎呀我想要！");
    }
}
