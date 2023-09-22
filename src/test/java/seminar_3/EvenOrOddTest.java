package seminar_3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class EvenOrOddTest {
    @Test
    // проверка на четное число
    void checkingEven() {
        assertTrue(EvenOrOdd.evenOddNumber(4));
    }

    @Test
    // проверка на нечетное число
    void checkingOdd() {
        assertFalse(EvenOrOdd.evenOddNumber(5));
    }
}
