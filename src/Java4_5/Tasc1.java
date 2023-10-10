package Java4_5;
import java.util.Scanner;
public class Tasc1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
       int min = Integer.MAX_VALUE;
       while (s.hasNextInt()){
           int x = s.nextInt();
           if (min>x) min = x;
       }
        System.out.println(min);
    }
}
