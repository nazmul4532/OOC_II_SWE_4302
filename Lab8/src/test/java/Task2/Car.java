package Task2;

public class Car implements IEngine,Switchable{
    @Override
    public void turnOn(Parent p){
        System.out.println("Turning Radio On Using the Radio object sent");
    }
    @Override
    public void turnOff(Parent p){
        System.out.println("Turning Radio Off using the Radio object sent");
    }
    @Override
    public void startEngine(){
        System.out.println("Starting Car");
    }


    }
