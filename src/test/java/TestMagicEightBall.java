import org.junit.Before;
import org.junit.Test;

import java.util.Collections;

import static org.junit.Assert.assertEquals;

public class TestMagicEightBall {


    private MagicEightBall magicEightBall;

    @Before
    public void before() {
        magicEightBall = new MagicEightBall();
        magicEightBall.addResult("Yes");
        magicEightBall.addResult("Maybe");
        magicEightBall.addResult("No");
    }

    @Test
    public void hasNumberOfEntries() {
        assertEquals(3, magicEightBall.getCount());
    }

    @Test
    public void canAddResultToArray() {
        magicEightBall.addResult("Yes");
        assertEquals(4, magicEightBall.getCount());
    }

    @Test
    public void canGetFirstResult() {
        assertEquals("Yes", magicEightBall.getResultAtIndex(0));
    }

    @Test
    public void canRemoveResultFromArray() {
        magicEightBall.removeResult(0);
        assertEquals(2, magicEightBall.getCount());
    }

    @Test
    public void canGetShuffledResult() {
        assertEquals(3, magicEightBall.getCount());
    }


}