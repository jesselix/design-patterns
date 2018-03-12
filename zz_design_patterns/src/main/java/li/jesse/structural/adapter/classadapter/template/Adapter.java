package li.jesse.structural.adapter.classadapter.template;

public class Adapter extends Adaptee implements Target
{
    @Override
    public void request()
    {
        super.specificRequest();
    }
}
