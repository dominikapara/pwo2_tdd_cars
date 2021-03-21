public class Car {
    private final String color;
    private final String make;
    private final float fuelConsumption;
    private final int tankCapacity;
    private float fuelLevel;
    private final int odometer;
    private final float dailyOdometer;

    public Car(String color, String make, float fuelConsumption, int tankCapacity, float fuelLevel, int odometer, float dailyOdometer) throws FuelLevelBiggerThanTankCapacityException {
        this.color = color;
        this.make = make;
        this.fuelConsumption = fuelConsumption;
        this.tankCapacity = tankCapacity;
        this.fuelLevel = fuelLevel;
        this.odometer = odometer;
        this.dailyOdometer = dailyOdometer;

        if (tankCapacity < fuelLevel) {
            throw new FuelLevelBiggerThanTankCapacityException();
        }
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

    public float getFuelLevel() {
        return fuelLevel;
    }

    public int getOdometer() {
        return odometer;
    }

    public float getDailyOdometer() {
        return dailyOdometer;
    }

    public void refuel(float litres) throws RefuelLitresNegativeException, FuelLevelBiggerThanTankCapacityException {
        if(litres < 0) {
            throw new RefuelLitresNegativeException();
        }

        if(litres + getFuelLevel() > getTankCapacity()) {
            throw new FuelLevelBiggerThanTankCapacityException();
        }

        fuelLevel += litres;
    }

    public void drive(float km) throws NoFuelForSuchKilometersCountException {
        float maxKmOnFuel = fuelLevel / fuelConsumption * 100;
        if(maxKmOnFuel < km) {
            throw new NoFuelForSuchKilometersCountException();
        }
    }
}
