package Task2;

public class MotorBike implements Tripable{
    private int distanceKM;
    private int timeMinutes;
    private int numberOfPassengers;
    public MotorBike(int distanceKM, int timeMinutes, int numberOfPassengers){
        this.distanceKM = distanceKM;
        this.timeMinutes = timeMinutes;
        this.numberOfPassengers = numberOfPassengers;
    }
    public boolean canTakeTrip(){
        return numberOfPassengers <= 1 && distanceKM <= 10;
    }
    public int perHeadFare(){
        int fare = Math.max(25, distanceKM * 20) / numberOfPassengers;
        fare = fare - (fare % 5);
        return fare;
    }
}
