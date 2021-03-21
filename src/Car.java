public class Car {
    String color;
    String make;
    float fuelConsumption;
    int tankCapacity;

    public Car(String color, String make, float fuelConsumption, int tankCapacity) {
        this.color = color;
        this.make = make;
        this.fuelConsumption = fuelConsumption;
        this.tankCapacity = tankCapacity;
    }

    public String getColor() {
        return color;
    }

    public String getMake() {
        return make;
    }

    public float getFuelConsumption() {
        return fuelConsumption;
    }

    public int getTankCapacity() {
        return tankCapacity;
    }
}
