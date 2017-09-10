package li.jesse.behavioral.mediator;

import li.jesse.behavioral.mediator.example.RealEstateAgents;
import li.jesse.behavioral.mediator.example.TenantA;
import li.jesse.behavioral.mediator.example.TenantB;
import org.junit.Test;

public class MediatorTest
{
    @Test
    public void testMediator()
    {
        RealEstateAgents agent = new RealEstateAgents();
        agent.createAgents();

        System.out.println("TeA 抢到了房子了！");
        agent.sell(new TenantA(agent));

        System.out.println("过了两个月 TeB 抢到了房子了！");
        agent.sell(new TenantB(agent));

    }
}
