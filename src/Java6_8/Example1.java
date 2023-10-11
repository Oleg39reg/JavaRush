package Java6_8;

import java.util.Arrays;
import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] arr = {3, 2, 1, 8, 5, 4, 7, 9, 6, 10};
        Arrays.sort(arr);//сортировка массива
        int target = s.nextInt();//ввод числа с клавиатуры
        int result = Arrays.binarySearch(arr, target);//бинарный поиск
        {
            System.out.println("Элемент найден в индексе " + result);
        }
    }
}
