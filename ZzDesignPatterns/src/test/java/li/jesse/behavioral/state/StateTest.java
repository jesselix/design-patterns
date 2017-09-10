package li.jesse.behavioral.state;

import li.jesse.behavioral.state.example.StateContext;
import org.junit.Test;

public class StateTest
{
    @Test
    public void testState()
    {
        final StateContext sc = new StateContext();

        sc.writeName("Monday");
        sc.writeName("Tuesday");
        sc.writeName("Wednesday");
        sc.writeName("Thursday");
        sc.writeName("Friday");
        sc.writeName("Saturday");
        sc.writeName("Sunday");
    }
}
