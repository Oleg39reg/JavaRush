package Java4_4;
import java.util.Scanner;
public class Tasc2 {
    public static void main (String[]args){
        String text = " любит меня";

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int n = 0;
        while (n < 10) {
            System.out.println(name+text);
            n++;
        }

    }
}
