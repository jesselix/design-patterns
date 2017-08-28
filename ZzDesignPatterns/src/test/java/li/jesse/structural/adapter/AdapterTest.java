package li.jesse.structural.adapter;

import li.jesse.structural.adapter.classadapter.template.Adaptee;
import li.jesse.structural.adapter.classadapter.template.ConcreteTarget;
import li.jesse.structural.adapter.classadapter.template.Target;
import li.jesse.structural.adapter.objectadapter.template.Adapter;
import org.junit.Test;

public class AdapterTest
{
    @Test
    public void testClassAdapter()
    {
        Target concreteTarget = new ConcreteTarget();
        concreteTarget.request();

        Target adapter = new li.jesse.structural.adapter.classadapter.template.Adapter();
        adapter.request();
    }

    @Test
    public void testObjectAdapter()
    {
        li.jesse.structural.adapter.objectadapter.template.Target concreteTarget = new li.jesse.structural.adapter.objectadapter.template.ConcreteTarget();
        concreteTarget.request();

        li.jesse.structural.adapter.objectadapter.template.Target adapter = new Adapter(new li.jesse.structural.adapter.objectadapter.template.Adaptee());
        adapter.request();
    }
}
