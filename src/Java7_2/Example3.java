package Java7_2;
//метод принимающий два аргумента и выводящий их сумму
import java.util.Scanner;

public class Example3 {

    public static void sum(int a, int b){
        int sum = a + b;
        System.out.println(sum);

    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
    sum(a,b);
    }
}
