package Java4_5;
import java.util.Scanner;
//Вывод на экран максимального числа введенного с клавиатуры
public class Example2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int max = 0;
        while (s.hasNextInt())
        {
            int x = s.nextInt();
            if (x>max) max=x;
        }
        System.out.println(max);
    }
}
