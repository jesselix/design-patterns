package li.jesse.behavioral.state.example;

public class StateContext
{
    private Statelike myState;

    public StateContext() {
        setState(new StateLowerCase());
    }

    void setState(final Statelike newState) {
        myState = newState;
    }

    public void writeName(final String name) {
        myState.writeName(this, name);
    }
}
