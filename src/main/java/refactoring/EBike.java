package refactoring;

public class EBike extends Bike {

    private final int batteryCapacity;

    public EBike(
        String productName,
        double price,
        int maxSpeed,
        int rearGearCount,
        int frontGearCount,
        int batteryCapacity) {

        super(productName, price, maxSpeed, rearGearCount, frontGearCount);
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public Integer getBatteryCapacity() {
        return batteryCapacity;
    }
}
