package Java3_7;
import java.util.Scanner;

public class Example1 {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int min = a < b ? a : b; //Тернарное выражение. Если А меньше Б то А, иначе Б.
        System.out.println(min);
    }
}
