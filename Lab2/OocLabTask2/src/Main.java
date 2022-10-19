import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Beginning");
        String s="x";
        while(!s.equals("0")) {
            Scanner scan = new Scanner(System.in);
            s = scan.nextLine();
            if(s.equals("0")) {
                break;
            }
            s=s.toUpperCase();
            if(s.equals("NORTH"))
            {
                System.out.println("I am in the North");
                System.out.println("I have to go North");
            }
            else if(s.equals("SOUTH"))
            {
                System.out.println("I am in the South");
                System.out.println("I have to go South");
            }
            else if(s.equals("EAST"))
            {
                System.out.println("I am in the East");
                System.out.println("I am in the West");
            }
            else if(s.equals("WEST"))
            {
                System.out.println("I am in the West");
                System.out.println("I am in the East");
            }
            else {
                System.out.println("NotFound ... manehhh Invalid Request r ki");
            }
        }
        System.out.println("Now with Enums");
        s="X";
        while(!s.equals("0"))
        {
            Scanner scan = new Scanner(System.in);
            s= scan.nextLine();
            if(s.equals("0")) {break;}
            System.out.println("I am in the " + Direction.direction.position(s));
            System.out.println("I have to " + Direction.direction.toGo(String.valueOf((Direction.direction.position(s).ordinal()))));
        }
        System.out.println("End of Process");


    }
}
