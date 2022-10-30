package Task2;

public class Drone implements IEngine,Switchable{
    @Override
    public void turnOn(Parent p){
        System.out.println("Turning Car On using the Camera object sent");
    }
    @Override
    public void turnOff(Parent p){
        System.out.println("Turning Car Off using the Camera object sent");
    }
    public void startEngine(){
        System.out.println("Starting Drone");
    }
}
