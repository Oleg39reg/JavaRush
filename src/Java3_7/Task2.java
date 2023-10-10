package Java3_7;
import java.util.Scanner;
public class Task2 {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if (n<5)
            System.out.println("Число меньше 5");
        else if (n>5) {
            System.out.println("Числ больше 5");
        } else
            System.out.println("Число равно 5");
    }
}
