import org.junit.jupiter.api.Test;

public class CarTests {

    @Test
    void canCreateCarInstance() {
        Car car = new Car("Blue", "Honda", 6.5f, 30);
        assert car.color.equals("Blue");
        assert car.make.equals("Honda");
        assert car.fuelConsumption == 6.5f;
        assert car.tankCapacity == 30;
    }

}
