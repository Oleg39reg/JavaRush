package Java4_9;
import java.util.Scanner;
//Площадь круга
public class Task1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int radius = s.nextInt();
        double pi = 3.14;
        int S = (int)(pi * radius * radius);
        System.out.println(S);
    }
}
