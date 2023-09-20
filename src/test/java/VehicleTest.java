import seminar_2.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class VehicleTest {
    private Car car;
    private Motorcycle motorcycle;
    @BeforeEach
    public void setUp() {
        car = new Car("Geely", "Coolray", 2023);
        motorcycle = new Motorcycle("BMV", "R18", 2021);
    }

    // - проверка того, что экземпляр объекта Car также является экземпляром
    // транспортного средства; (instanceof)
    @Test
    void carInstanceOfVehicleTest() {
        assertThat(car instanceof Vehicle).isEqualTo(true);
    }

    // проверка того, объект Car создается с 4-мя колесами
    @Test
    void car4WheelsTest() {
        assertThat(car.getNumWheels()).isEqualTo(4);
    }

    // проверка того, объект Motorcycle создается с 2-мя колесами
    @Test
    void motorcycle2WheelsTest() {
        assertThat(motorcycle.getNumWheels()).isEqualTo(2);
    }

    // проверка того, объект Car развивает скорость 60 в режиме тестового вождения (testDrive())
    @Test
    void carSpeed60Test() {
        car.testDrive();
        int result = car.getSpeed();
        assertEquals(result, 60);
    }

    // проверка того, объект Motorcycle развивает скорость 75 в режиме тестового вождения (testDrive())
    @Test
    void motorcycleSpeed75Test() {
        motorcycle.testDrive();
        int result = motorcycle.getSpeed();
        assertEquals(result, 75);
    }

    // проверить, что в режиме парковки (сначала testDrive, потом park, т.е эмуляция движения транспорта)
    // машина останавливается (speed = 0)
    @Test
    void carStopTest() {
        car.testDrive();
        car.park();
        int result = car.getSpeed();
        assertEquals(result, 0);
    }

    // проверить, что в режиме парковки (сначала testDrive, потом park  т.е эмуляция движения транспорта)
    // мотоцикл останавливается (speed = 0)
    @Test
    void motorcycleStopTest() {
        motorcycle.testDrive();
        motorcycle.park();
        int result = motorcycle.getSpeed();
        assertEquals(result, 0);
    }
}
