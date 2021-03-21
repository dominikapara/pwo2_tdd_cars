import org.junit.jupiter.api.Test;

public class CarTests {

    @Test
    void carInstanceCreatedWithProperValues() {
        String color = "Blue";
        String make = "Honda";
        float fuelConsumption = 6.5f;
        int tankCapacity = 30;

        Car car = new Car(color, make, fuelConsumption, tankCapacity);
        assert car.color.equals(color);
        assert car.make.equals(make);
        assert car.fuelConsumption == fuelConsumption;
        assert car.tankCapacity == tankCapacity;
    }

}
