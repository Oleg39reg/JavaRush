package Java4_3;
import java.util.Scanner;
public class Example3 {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        while (s.hasNextInt()){  //выводт в консоль числа до первой ошибки(напрмер если буквы)
            int x = s.nextInt();
        }
    }
}
