package li.jesse.structural.facade;

import li.jesse.structural.facade.example.Computer;
import org.junit.Test;

public class FacadeTest
{
    @Test
    public void testComputerFacade()
    {
        Computer computerFacade = new Computer();
        computerFacade.startComputer();
    }
}
