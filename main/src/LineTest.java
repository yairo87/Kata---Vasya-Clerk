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

    @Test
    public void twoPersonsFirstExactOK() {
        assertEquals("YES", Line.Tickets(new int[] {25,50}));
    }

    @Test
    public void shouldBeEnoughChangeFor50() {
        assertEquals("YES", Line.Tickets(new int[] {25, 25, 50}));
    }

    @Test
    public void NotEnoughChangeFor100() {
        assertEquals("NO", Line.Tickets(new int []{25, 100}));
    }

    @Test
    public void shouldHave50Bill25BillFor100() {
        assertEquals("YES", Line.Tickets(new int []{25, 50, 25, 100}));
    }

    @Test
    public void shouldHave3Bills25For100() {
        assertEquals("YES", Line.Tickets(new int []{25, 25, 25, 100}));
    }

}