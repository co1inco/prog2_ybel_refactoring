package refactoring;

public class EBike extends Bike {

    private final int batteryCapacity;

    public EBike(String pn, double p, int ms, int rgc, int fgc, int bc) {
        super(pn, p, ms, rgc, fgc);
        this.batteryCapacity = bc;
    }

    @Override
    public Integer getBatteryCapacity() {
        return batteryCapacity;
    }
}
