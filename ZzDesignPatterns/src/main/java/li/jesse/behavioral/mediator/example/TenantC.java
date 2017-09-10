package li.jesse.behavioral.mediator.example;

public class TenantC extends Tenant{
    public TenantC(RealEstateAgents agent) {
        super(agent);
    }
    public void crying() {
        System.out.println("我是穷屌丝 TenantC！哎呀我想要！");
    }
}
