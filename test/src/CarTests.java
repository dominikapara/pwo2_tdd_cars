import org.junit.jupiter.api.Test;

public class CarTests {

    @Test
    void carInstanceCreatedWithProperValues() {
        String color = "Blue";
        String make = "Honda";
        float fuelConsumption = 6.5f;
        int tankCapacity = 30;

        Car car = new Car(color, make, fuelConsumption, tankCapacity);
        assert car.getColor().equals(color);
        assert car.getMake().equals(make);
        assert car.getFuelConsumption() == fuelConsumption;
        assert car.getTankCapacity() == tankCapacity;
    }

}
