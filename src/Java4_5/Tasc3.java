package Java4_5;
import java.util.Scanner;
public class Tasc3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        while (s.hasNextInt()) {
            int tmp = s.nextInt();
            if (tmp < min) {
                secondMin = min;
                min = tmp;
            } else if (tmp > min && tmp < secondMin) {
                secondMin = tmp;
            }
        }

        System.out.println(secondMin);
    }
}
