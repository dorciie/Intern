import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static PerfectNum.PerfectNumber.isPerfect;

public class JUnitTest {
    @Test
    public void perfect_positive() {
        assertTrue(isPerfect(6));
        assertTrue(isPerfect(496));
        assertTrue(isPerfect(8128));
    }

    @Test
    public void perfect_negative() {
        assertFalse(isPerfect(6 + 1));
        assertFalse(isPerfect(496 + 1));
        assertFalse(isPerfect(8128 + 1));
    }

}
