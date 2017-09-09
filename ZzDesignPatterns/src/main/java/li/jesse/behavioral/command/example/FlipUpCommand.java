package li.jesse.behavioral.command.example;

public class FlipUpCommand implements TheCommand
{
    private Light theLight;

    public FlipUpCommand(Light light) {
        this.theLight = light;
    }

    @Override
    public void execute()
    {
        theLight.turnOn();
    }
}
