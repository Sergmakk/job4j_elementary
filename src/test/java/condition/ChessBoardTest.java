package condition;

import org.junit.Test;
import org.junit.Assert;

import static org.junit.Assert.*;

public class ChessBoardTest {

    @Test
    public void way() {
        int x1 = 6;
        int y1 = 7;
        int x2 = 1;
        int y2 = 2;
        int result = ChessBoard.way(x1, y1, x2, y2);
        int expected = 5;
        Assert.assertEquals(expected, result);
    }
}