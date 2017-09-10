package li.jesse.behavioral.mediator.example;


public class RealEstateAgents implements StateMediator{
    private TenantA teA;
    private TenantB teB;
    private TenantC teC;

    public void sell(Tenant tenant) {
        System.out.println("海景洋房 已经租出去了！");
        if(tenant instanceof TenantA){
            teB.crying();
            teC.crying();
        }else if(tenant instanceof TenantB){
            teA.crying();
            teC.crying();
        }else if(tenant instanceof TenantC){
            teB.crying();
            teA.crying();
        }
    }

    public void createAgents(){
        teA = new TenantA(this);
        teB = new TenantB(this);
        teC = new TenantC(this);
    }
}
