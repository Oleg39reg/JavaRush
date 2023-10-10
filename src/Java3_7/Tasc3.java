package Java3_7;
import java.util.Scanner;
public class Tasc3 {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        double a = s.nextDouble();
        double b = s.nextDouble();
        if (Math.abs(a-b)<0.000001)
            System.out.println("Числа равны");
        else
            System.out.println("Числа не равны");
    }
}
