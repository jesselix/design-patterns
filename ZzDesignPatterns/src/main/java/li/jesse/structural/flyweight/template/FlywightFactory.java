package li.jesse.structural.flyweight.template;

import java.util.Hashtable;

public class FlywightFactory
{
    private Hashtable<String, Flyweight> flyweights = new Hashtable<String, Flyweight>();

    public FlywightFactory() {
        flyweights.put("X", new ConcreteFlyweight());
        flyweights.put("Y", new ConcreteFlyweight());
        flyweights.put("Z", new ConcreteFlyweight());
    }

    public Flyweight getFlyweight(String key) {
        return ((Flyweight)flyweights.get(key));
    }
}
