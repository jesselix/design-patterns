package li.jesse.creational.factorymethod;

public abstract class Creator
{
    public abstract <T extends Product> T createProduct(Class<T> clazz);
}
