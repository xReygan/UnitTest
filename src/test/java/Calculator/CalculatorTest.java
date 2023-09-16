package Calculator;

import static org.assertj.core.api.AssertionsForClassTypes.*;

public class CalculatorTest {
    public static void main(String[] args) {

        // Проверка базового функционала с использованием утверждений:
        assert 170 == Calculator.calculatingDiscount(200, 15);
        assert 0 == Calculator.calculatingDiscount(0, 15);
        assert 200 == Calculator.calculatingDiscount(200, 0);
        assert 170 == Calculator.calculatingDiscount(200, -15);
        assert 170 == Calculator.calculatingDiscount(200, 115);

        // Проверка базового функционала с использованием утверждений AssertJ:
        assertThat(Calculator.calculatingDiscount(200, 15)).isEqualTo(170);
        assertThat(Calculator.calculatingDiscount(0, 15)).isEqualTo(0);
        assertThat(Calculator.calculatingDiscount(200, 0)).isEqualTo(200);
        assertThat(Calculator.calculatingDiscount(200, -15)).isEqualTo(170);
        assertThat(Calculator.calculatingDiscount(200, 115)).isEqualTo(170);
    }
}