package Java4_5;
import java.util.Scanner;
public class Example1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int sum = 0;
        while (s.hasNextInt()){
            int x = s.nextInt();
            sum = sum + x;
        }
        System.out.println(sum);
    }
}
