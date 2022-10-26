package Task2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RefactoredTripTest {
    @Test
    public void SedanPerHeadFare(){
        RefactoredTrip trip = new RefactoredTrip(VehicleType.SEDAN, 5,5,5);
        assertEquals(40,trip.perHeadFare());
    }
    @Test
    public void SedanCanTakeTrip(){
        RefactoredTrip trip = new RefactoredTrip(VehicleType.SEDAN, 4,5,4);
        assertTrue(trip.canTakeTrip());
    }
    @Test
    public void SedanCannotTakeTrip(){
        RefactoredTrip trip = new RefactoredTrip(VehicleType.SEDAN, 4,5,25);
        assertFalse(trip.canTakeTrip());
    }
    @Test
    public void SedanCannotTakeTrip02(){
        RefactoredTrip trip = new RefactoredTrip(VehicleType.SEDAN, 200,5,4);
        assertFalse(trip.canTakeTrip());
    }
    @Test
    public void MotorBikePerHeadFare(){
        RefactoredTrip trip = new RefactoredTrip(VehicleType.MOTOR_BIKE, 5,5,5);
        assertEquals(20,trip.perHeadFare());
    }
    @Test
    public void MotorBikeCanTakeTrip(){
        RefactoredTrip trip = new RefactoredTrip(VehicleType.MOTOR_BIKE, 4,5,1);
        assertTrue(trip.canTakeTrip());
    }
    @Test
    public void MotorBikeCanNotTakeTrip(){
        RefactoredTrip trip = new RefactoredTrip(VehicleType.MOTOR_BIKE, 4,5,2);
        assertFalse(trip.canTakeTrip());
    }
    @Test
    public void MotorBikeCanNotTakeTrip02(){
        RefactoredTrip trip = new RefactoredTrip(VehicleType.MOTOR_BIKE, 200,5,1);
        assertFalse(trip.canTakeTrip());
    }
    @Test
    public void SevenSeaterPerHeadFare(){
        RefactoredTrip trip = new RefactoredTrip(VehicleType.SEVEN_SEATER, 10,5,6);
        assertEquals(50,trip.perHeadFare());
    }
    @Test
    public void SevenSeaterCanTakeTrip(){
        RefactoredTrip trip = new RefactoredTrip(VehicleType.SEVEN_SEATER, 10,5,6);
        assertTrue(trip.canTakeTrip());
    }
    @Test
    public void SevenSeaterCannotTakeTrip(){
        RefactoredTrip trip = new RefactoredTrip(VehicleType.SEVEN_SEATER, 5,5,6);
        assertFalse(trip.canTakeTrip());
    }
    @Test
    public void SevenSeaterCannotTakeTrip02(){
        RefactoredTrip trip = new RefactoredTrip(VehicleType.SEVEN_SEATER, 10,5,9);
        assertFalse(trip.canTakeTrip());
    }

}
