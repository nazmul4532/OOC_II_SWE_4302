package Task2;

public class Sedan implements Tripable{
    private int distanceKM;
    private int timeMinutes;
    private int numberOfPassengers;
    public Sedan(int distanceKM, int timeMinutes, int numberOfPassengers){
        this.distanceKM = distanceKM;
        this.timeMinutes = timeMinutes;
        this.numberOfPassengers = numberOfPassengers;
    }
    public boolean canTakeTrip(){
        return numberOfPassengers <= 4 && distanceKM <= 25;
    }
    public int perHeadFare(){
        int fare = (50 + distanceKM * 30 + timeMinutes * 2) / numberOfPassengers;
        fare = fare - (fare % 5);
        return fare;
    }
}
