package refactoring;

public class Bike {

    private final String productName;
    private final double price;
    private final int maxSpeed;
    private final int frontGearCount;
    private final int rearGearCount;

    public Bike(String productName, double price, int maxSpeed, int frontGearCount, int rearGearCount) {
        this.productName = productName;
        this.price = price;
        this.maxSpeed = maxSpeed;
        this.frontGearCount = frontGearCount;
        this.rearGearCount = rearGearCount;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public Integer getBatteryCapacity() {
        return null;
    }

    public int getGearsCount() {
        return rearGearCount * frontGearCount;
    }
}
