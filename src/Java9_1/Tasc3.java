package Java9_1;

import java.util.Arrays;
import java.util.Scanner;

//Минимальный элемент массива
public class Tasc3 {
    public static void main(String[] args) {
        int[] intArray = getArrayOfTenElements();
        System.out.println(min(intArray));
    }

    public static int min(int[] ints) {
        //Найти минимальный элемент массива и вернуть этот элемент
        //Обязательно использовать Math.min(int,int)
        int min = ints[0];//создаём переменную типа массив
        for (int i = 1; i <ints.length; i++) {
            min = Math.min(min, ints[i]);// Проходим по остальным элементам массива, сравнивая каждый с текущим минимальным значением
        }
        return min;
    }

    public static int[] getArrayOfTenElements() {
        //Считать 10 чисел с консоли и заполнить ими массив
        Scanner s = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        return arr;
    }
}
