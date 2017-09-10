package li.jesse.behavioral.state.example;

public class StateLowerCase implements Statelike
{
    @Override
    public void writeName(StateContext context, String name)
    {
        System.out.println(name.toLowerCase());
        context.setState(new StateMultipleUpperCase());
    }
}
