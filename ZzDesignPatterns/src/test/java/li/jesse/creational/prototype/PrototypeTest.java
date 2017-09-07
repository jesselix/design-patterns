package li.jesse.creational.prototype;

import li.jesse.creational.prototype.template.ConcretePrototype;
import org.junit.Test;

public class PrototypeTest
{
    @Test
    public void testPrototype()
    {
        ConcretePrototype cp = new ConcretePrototype();

        for(int i=0; i< 10; i++)
        {
            ConcretePrototype clonecp = (ConcretePrototype)cp.clone();
            clonecp.show();
        }
    }
}
