package Java6_4;
import java.util.Scanner;
//Вывод в обратном порядке
public class Example1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] array = new String[10];
        for (int i = 0; i < 10; i++) {
            array[i]=s.nextLine();
        }
        for (int i = 9; i >=0 ; i--) {
            System.out.println(array[i]);
        }
    }
}
