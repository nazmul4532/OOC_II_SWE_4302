package Task2;

public class SevenSeater implements Tripable{
    private int distanceKM;
    private int timeMinutes;
    private int numberOfPassengers;
    public SevenSeater(int distanceKM, int timeMinutes, int numberOfPassengers){
        this.distanceKM = distanceKM;
        this.timeMinutes = timeMinutes;
        this.numberOfPassengers = numberOfPassengers;
    }
    public boolean canTakeTrip(){
        return numberOfPassengers <= 7 && distanceKM >= 10;
    }
    public int perHeadFare(){
        int fare = distanceKM * 30 / numberOfPassengers;
        fare = fare - (fare % 5);
        return fare;
    }
}
