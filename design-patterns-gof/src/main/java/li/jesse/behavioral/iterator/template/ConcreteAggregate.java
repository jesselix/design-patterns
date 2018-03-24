package li.jesse.behavioral.iterator.template;

import java.util.ArrayList;
import java.util.List;

public class ConcreteAggregate extends Aggregate
{
    private List<Object> list = new ArrayList<>();

    public ConcreteAggregate(List<Object> list)
    {
        this.list = list;
    }

    public Iterator createIterator()
    {
        return new ConcreteIterator(list);
    }
}
