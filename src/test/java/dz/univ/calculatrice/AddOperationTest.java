package dz.univ.calculatrice;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddOperationTest {
@Test
public void testAdditionNominale() {
    final Operation op = new AddOperation();
    assertEquals(5.0, op.calculer(2.0, 3.0), 0.0001);
}

@Test
public void testAdditionNegatifs() {
    final Operation op = new AddOperation();
    assertEquals(-1.0, op.calculer(2.0, -3.0), 0.0001);
}
}
