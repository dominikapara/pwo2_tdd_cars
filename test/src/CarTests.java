import org.junit.jupiter.api.Test;

public class CarTests {

    @Test
    void canCreateCarInstance() {
        new Car("Blue", "Honda", 6.5f, 30);
    }

}
