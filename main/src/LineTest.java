import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LineTest {

    @Test
    public void onePersonExactAmountShouldBeOK() {
        assertEquals("YES", Line.Tickets(new int[] {25}));
    }

    @Test
    public void onePersonBigBillNotOK() {
        assertEquals("NO", Line.Tickets(new int[] {50}));
    }
//    @Test
//    public void test1() {
//        assertEquals("YES", Line.Tickets(new int[] {25, 25, 50}));
//    }
//
//    @Test
//    public void test2() {
//        assertEquals("NO", Line.Tickets(new int []{25, 100}));
//    }

}