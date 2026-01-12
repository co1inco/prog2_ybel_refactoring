package refactoring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class BromptonTest {


    @Test
    public void getMaxSpeed() {
        //Arrange
        Brompton brompton = new Brompton("Name", 1234, 69, 3, 5);

        //Assert
        assertEquals(69, brompton.getMaxSpeed());
    }

    @Test
    public void getGearCount() {
        //Arrange
        Brompton brompton = new Brompton("Name", 1234, 69, 3, 5);

        //Assert
        assertEquals(15, brompton.getGearsCount());
    }

    @Test
    public void getBatteryCapacity() {
        //Arrange
        Brompton brompton = new Brompton("Name", 1234, 69, 3, 5);

        //Assert
        assertNull(brompton.getBatteryCapacity());
    }

}
