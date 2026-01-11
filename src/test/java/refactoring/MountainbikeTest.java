package refactoring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class MountainbikeTest {

    @Test
    public void getMaxSpeed() {
        //Arrange
        Mountainbike mountainbike = new Mountainbike("Name", 1234, 69, 3, 5);

        //Assert
        assertEquals(69, mountainbike.getMaxSpeed());
    }

    @Test
    public void getGearCount() {
        //Arrange
        Mountainbike mountainbike = new Mountainbike("Name", 1234, 69, 3, 5);

        //Assert
        assertEquals(15, mountainbike.getGearsCount());
    }

    @Test
    public void getBatteryCapacity() {
        //Arrange
        Mountainbike mountainbike = new Mountainbike("Name", 1234, 69, 3, 5);

        //Assert
        assertNull(mountainbike.getBatteryCapacity());
    }
}
