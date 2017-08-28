package li.jesse.behavioral.iterator;

import li.jesse.behavioral.iterator.template.Aggregate;
import li.jesse.behavioral.iterator.template.ConcreteAggregate;
import li.jesse.behavioral.iterator.template.Iterator;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class IteratorTest
{
    @Test
    public void testIterator()
    {
        List<Object> list = new ArrayList<>();
        list.add("Andy");
        list.add("Deli");
        Aggregate agg = new ConcreteAggregate(list);
        Iterator iterator = agg.createIterator();
        iterator.first();
        while(!iterator.isDone()){
            System.out.println(iterator.currentItem());
            iterator.next();
        }
    }
}
