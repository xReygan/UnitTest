package seminar_3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class NumberInIntervalTest {
    @Test
    // проверка на вхождение числа в диапазон (25 - 100)
    void checkingIfNumberIsInRange25x100() {
        assertTrue(NumbersInInterval.numberInInterval(47));
    }

    @Test
    // проверка на НЕ вхождение числа в диапазон (25 - 100)
    void checkingIfNumberIsNotInRange25x100() {
        assertFalse(NumbersInInterval.numberInInterval(132));
    }
}
