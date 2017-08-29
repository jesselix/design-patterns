package li.jesse.behavioral.command.sample;

import java.util.ArrayList;
import java.util.List;

public class Switch
{
    private List<TheCommand> history = new ArrayList<>();

    public Switch() {
    }

    public void storeAndExecute(TheCommand cmd) {
        this.history.add(cmd); // optional
        cmd.execute();
    }
}
