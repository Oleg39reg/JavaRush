package Boolean3_5;
import java.util.Scanner;
public class Example1 {
    private static boolean isHigh;
    private static boolean isLow;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double bodyTemperature = s.nextDouble();
        isHigh = (bodyTemperature > 37);
        isLow = (bodyTemperature < 36);
        if (isHigh){
            System.out.println("Температура тела высокая");
        } else if (isLow) {
            System.out.println("Температура тела низкая");
        } else {
            System.out.println("Температура тела нормальная");
        }
    }

}
