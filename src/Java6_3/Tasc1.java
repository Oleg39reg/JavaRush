package Java6_3;

import java.util.Scanner;

public class Tasc1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//Ввожу число n
        int n = s.nextInt();
//Присваиваю длинну массива равную числу n
        int[] array = new int[n];
//Ввожу в переменную array числа равные числу n
        for (int i = 0; i < n; i++) {
            array[i] = s.nextInt();
        }
//Если число n нечётное то вывожу элементы массива в порядке ввода
        if (n % 2 != 0) {
            for (int i = 0; i < n; i++) {
                System.out.println(array[i]);
            }
//Иаче вывожу елементы массива в обратном порядке
        } else {
            for (int i = n - 1; i >= 0; i--) {
                System.out.println(array[i]);
            }
        }
//Вывожу длинну массива
        System.out.println("Длинна массива = " + array.length);
    }
}
