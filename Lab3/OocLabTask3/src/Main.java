import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Input your cell Number");
        String s = "0";
        Scanner scanner = new Scanner(System.in);
        s = scanner.nextLine();
        boolean flag = false;
        int size = s.length();
        for (int i = 0; i < size; i++) {
            if (s.charAt(i) == '_') {
                flag = true;
                break;
            }
        }
        if (size == 9 && flag == true) {
            System.out.println("OK");
        } else {
            System.out.println("Not OK");
        }
    }
}