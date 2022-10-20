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

            if(s.equals("C_400"))
            {
                System.out.println("Bad Request");
            }
            else if(s.equals("C_401"))
            {
                System.out.println("Unauthorized");
            }
            else if(s.equals("C_403"))
            {
                System.out.println("Forbidden");
            }
            else if(s.equals("C_404"))
            {
                System.out.println("NotFound");
            }
            else if(s.equals("C_408"))
            {
                System.out.println("Request Timeout");
            }
            else {
                System.out.println("NotFound ... manehhh Invalid Request r ki");
            }
        }

        System.out.println("End");
        System.out.println("Now with Enums");
        String s1="x";

        while(!s1.equals("0"))
        {
            Scanner scan = new Scanner(System.in);
            s1 = scan.nextLine();
            if(s1.equals("0")) {break;}
            System.out.println(HttpResponseStatus.Code.valueOfLabel(s1));
        }
        System.out.println("End of Process");
    }
}