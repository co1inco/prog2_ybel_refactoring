package refactoring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class EBikeTest {

    @Test
    public void getMaxSpeed() {
        //Arrange
        EBike ebike = new EBike("Name", 1234, 69, 3, 5, 321);

        //Assert
        assertEquals(69, ebike.getMaxSpeed());
    }

    @Test
    public void getGearCount() {
        //Arrange
        EBike ebike = new EBike("Name", 1234, 69, 3, 5, 321);

        //Assert
        assertEquals(15, ebike.getGearsCount());
    }

    @Test
    public void getBatteryCapacity() {
        //Arrange
        EBike ebike = new EBike("Name", 1234, 69, 3, 5, 321);

        //Assert
        assertEquals(321, ebike.getBatteryCapacity());
    }
}
