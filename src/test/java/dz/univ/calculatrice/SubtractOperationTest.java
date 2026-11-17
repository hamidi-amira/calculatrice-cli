package dz.univ.calculatrice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SubtractOperationTest {

    @Test
    public void testSoustraction() {
        SubtractOperation op = new SubtractOperation();
    assertEquals(2.0, op.calculate(5.0, 3.0), "5 - 3 doit faire 2");
    }
}