package ChessGame.Main;

import ChessGame.Display.Display;

public class Launcher {

    public static void main (String args[]) {
        Game game = new Game("Chess game", 600, 700);
        game.start();
    }
}
