package Boolean3_5;
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        if (a == b) {
            if (b == c) {
                System.out.println(a + " " + b + " " + c);
            } else {
                System.out.println(a + " " + b);
            }
        } else if (a == c) {
            System.out.println(a + " " + c);
        } else if (b == c) {
            System.out.println(b + " " + c);
        }
    }
}




