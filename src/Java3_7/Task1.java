package Java3_7;
import java.util.Scanner;

public class Task1 {
    static public void main (String [] args){
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int max = a > b ? a:b;
        System.out.println(max);
    }
}
