package Boolean;
import java.util.Scanner;

public class Task1
{
    private static boolean isHigh;
    private static boolean isLow;

    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        double bodyTemp =s.nextDouble();

         isHigh = (bodyTemp>37);
         isLow = (bodyTemp<36);

        if (isHigh) {
            System.out.println("Высокая температуры тела");
        } else if (isLow) {
            System.out.println("Низкая температура тела");
        } else {
            System.out.println("Нормальная температура тела");
        }

    }
}
