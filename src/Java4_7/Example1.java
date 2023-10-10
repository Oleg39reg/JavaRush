package Java4_7;
import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int count =0;
        for (int i = 0; i < 10; i++) {
            if (s.hasNextInt()){
                count++;
                s.hasNextLine();
            }

        }
        System.out.println(count);
    }
}
