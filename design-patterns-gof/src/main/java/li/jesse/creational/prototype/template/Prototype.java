package li.jesse.creational.prototype.template;

public class Prototype implements Cloneable
{
    public Prototype clone()
    {
        Prototype prototype = null;
        try
        {
            prototype = (Prototype)super.clone();
        }catch(CloneNotSupportedException e){
            e.printStackTrace();
        }

        return prototype;
    }
}
