package Java4_5;
import java.util.Scanner;
public class Tasc2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        while (s.hasNextInt()){
            int x = s.nextInt();
            if (x%2==0 && max<x){
                max=x;

            }
        }
        System.out.println(max);
    }
}
