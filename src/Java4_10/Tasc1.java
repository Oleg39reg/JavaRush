package Java4_10;
import java.util.Scanner;

public class Tasc1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int speed = s.nextInt();
        int convert = (int)Math.round(speed*3.6);
        System.out.println(convert);
    }
}
