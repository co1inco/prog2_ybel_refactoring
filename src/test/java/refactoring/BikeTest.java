package refactoring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BikeTest {


    @Test
    public void getBatteryCapacity() {
        Bike bike = new Bike();

        bike.batteryCapacity = 123;

        assertEquals(123, bike.getBatteryCapacity());
    }

    @Test
    public void getGearsCount() {
        Bike bike = new Bike();

        assertThrows(UnsupportedOperationException.class, bike::getGearsCount);
    }
}
