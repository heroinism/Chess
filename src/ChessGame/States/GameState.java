package ChessGame.States;

import ChessGame.Main.Handler;

import java.awt.*;

public class GameState extends State {

    public GameState(Handler handler) {
        super(handler);
    }

    @Override
    public void tick() {

    }

    @Override
    public void render(Graphics g) {
        g.setColor(Color.RED);
        g.fillRect(0,0,100,100);
    }
}
