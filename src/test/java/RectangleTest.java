import Exercice6.Rectangle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RectangleTest {

    @Test
    public void testAireEtPerimetre() {
        Rectangle rectangle = new Rectangle(2,4);
        assertAll(
                () -> assertEquals(rectangle.aire(), 2*4),
                () -> assertEquals(rectangle.perimetre(), 4+8)
        );
    }
}
