package li.jesse.creational.factorymethod.factory.template;

public abstract class Creator
{
    public abstract <T extends Product> T createProduct(Class<T> clazz);
}
