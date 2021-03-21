import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CarTests {

    @Test
    void carInstanceCreatedWithProperValues() {
        String color = "Blue";
        String make = "Honda";
        float fuelConsumption = 6.5f;
        int tankCapacity = 30;
        float fuelLevel = 17.5f;
        int odometer = 170000;
        float dailyOdometer = 180;

        Car car = new Car(color, make, fuelConsumption, tankCapacity, fuelLevel, odometer, dailyOdometer);
        assert car.getColor().equals(color);
        assert car.getMake().equals(make);
        assert car.getFuelConsumption() == fuelConsumption;
        assert car.getTankCapacity() == tankCapacity;
        assert car.getFuelLevel() == fuelLevel;
        assert car.getOdometer() == odometer;
        assert car.getDailyOdometer() == dailyOdometer;
    }

    @Test
    void carInstanceCantHaveFuelLevelBiggerThanTankCapacity() {
        int tankCapacity = 20;
        float fuelLevel = 30;

        Assertions.assertThrows(FuelLevelBiggerThanTankCapacityException.class,
                () -> new Car("color", "make", 1f, tankCapacity, fuelLevel, 1, 1)
        );
    }
}
