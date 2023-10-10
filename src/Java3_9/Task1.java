package Java3_9;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        String b = s.nextLine();
        if(a.equals(b))
             System.out.println("Строки одинаковые");

        else System.out.println("Строки разные");
    }
}
