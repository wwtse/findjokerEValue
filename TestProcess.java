import static org.junit.Assert.*;
import org.junit.Test;

public class TestProcess {

    @Test
    public void testStdRandom(){
        int[] resultP = StdRandom.permutation(13);
        StdRandom.shuffle(resultP);
        System.out.println(resultP);
    }

    @Test
    public void testProcess(){
        Process testR = new Process();
        int actual = testR.cards[53];
        int expected = 14;
        assertEquals("Oh noooo!\nThis is bad:\n   Random number " + actual
                        + " not equal to " + expected + "!",
                expected, actual);


    }

    @Test
    public void testCRandomAndDealer(){
        Process testR = new Process();
        testR.cardRandom();
        testR.dealer(4);
        System.out.println(1);
    }

    @Test
    public void testThrowAndCountM(){
        Process testR = new Process();
        testR.cardRandom();
        int result = testR.throwAndCountM(1);
        System.out.println(1);

    }


}
