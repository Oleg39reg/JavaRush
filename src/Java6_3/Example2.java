package Java6_3;
import java.util.Scanner;
//нужно ввести с клавиатуры 10 чисел и вывести их в обратном порядке.
public class Example2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        Создаем объект-массив на 10 элементов
        int [] arrey = new int[10];
//        Цикл от 0 до 9 включительно
        for (int i = 0; i < 5; i++) {
//        Читаем число с клавиатуры и сохраняем его в очередную ячейку массива
            arrey[i] = s.nextInt();

        }
    }
}
