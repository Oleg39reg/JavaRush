package Java3_7;
import java.util.Scanner;

//Вывод минимального числа с использованием тернарного оператора
public class Example3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите первое число");
        int a = s.nextInt();
        System.out.println("Введите второе число");
        int b = s.nextInt();
//        Тернарный оператор
        int min = a < b ? a : b;
        System.out.println("Минимальное число: "+min);
    }
}
