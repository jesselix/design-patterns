package li.jesse.behavioral.iterator.template;

public interface Iterator
{
    Object first();
    Object next();
    boolean isDone();
    Object currentItem();
}
