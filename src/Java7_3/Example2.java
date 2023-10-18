package Java7_3;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Example2 {
    //Метод принимает два параметра — строку и количество ее повторений.
    public static String multiple(String str, int times) {
        //Создается пустая строка для будущего результата
        String result = "";
        for (int i = 0; i < times; i++) {
            result = result + " " + str;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите строку");
        String str = s.nextLine();
        System.out.println("Введите количество");
        int times = s.nextInt();
        System.out.println(multiple(str, times));
    }

}
