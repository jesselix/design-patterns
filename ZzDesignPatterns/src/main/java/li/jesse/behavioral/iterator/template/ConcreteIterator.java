package li.jesse.behavioral.iterator.template;

import java.util.ArrayList;
import java.util.List;

public class ConcreteIterator implements Iterator
{
    private List<Object> list = new ArrayList<>();
    private int curr = 0;

    public ConcreteIterator(List<Object> list)
    {
        this.list = list;
    }

    public Object first()
    {
        return list.get(0);
    }

    public Object next()
    {
        Object ret = null;
        curr++;
        if(curr < list.size())
        {
            ret = list.get(curr);
        }

        return ret;
    }

    public boolean isDone()
    {
        return curr >= list.size();
    }

    public Object currentItem()
    {
        return list.get(curr);
    }
}
