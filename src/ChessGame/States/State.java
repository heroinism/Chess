package ChessGame.States;

import ChessGame.Main.Handler;

import java.awt.*;

public abstract class State {

    private static State currentState = null;
    private boolean lastState;

    public static void setState(State state) {
        currentState = state;
    }

    public boolean isLastState() {
        return lastState;
    }

    public void setLastState(boolean lastState) {
        this.lastState = lastState;
    }

    public static State getState() {
        return currentState;
    }

    protected Handler handler;

    public State(Handler handler) {
        this.handler = handler;
    }

    public abstract void tick();

    public abstract void render(Graphics g);

}
