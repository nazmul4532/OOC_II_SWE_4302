package Task2;

public class RefactoredTrip {
    private Tripable type;
    private int distanceKM;
    private int timeMinutes;
    private int numberOfPassengers;
    public RefactoredTrip(VehicleType type,int distanceKM,int timeMinutes,int numberOfPassengers ) {
        this.type = chooseVehicle (type,distanceKM,timeMinutes,numberOfPassengers);
    }
    public boolean canTakeTrip() {
        return type.canTakeTrip() ;
    }
    public int perHeadFare() {
        return type.perHeadFare();
    }
    public Tripable chooseVehicle (VehicleType type,int distanceKM,int timeMinutes,int numberOfPassengers) {
        Tripable vehicle;
        if(type.equals(VehicleType.SEDAN)) {
            vehicle = new Sedan(distanceKM,timeMinutes,numberOfPassengers);
        } else if (type.equals(VehicleType.SEVEN_SEATER)) {
            vehicle = new SevenSeater(distanceKM,timeMinutes,numberOfPassengers);
        } else vehicle = new MotorBike(distanceKM,timeMinutes,numberOfPassengers);
        return vehicle;
    }
}
