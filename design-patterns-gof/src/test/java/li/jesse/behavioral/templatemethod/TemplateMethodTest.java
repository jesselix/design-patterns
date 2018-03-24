package li.jesse.behavioral.templatemethod;

import li.jesse.behavioral.templatemethod.example.Chess;
import li.jesse.behavioral.templatemethod.example.Game;
import org.junit.Test;

public class TemplateMethodTest
{
    @Test
    public void testTemplateMethod()
    {
        Game chessGame = new Chess();
        chessGame.initializeGame();
//        chessGame.playOneGame(1);
    }
}
