package Java9_1;

import java.util.Arrays;
//Заполнение элементов массива случайными числами

public class Practik_1 {
    public static int RandomInt(){  //Метод случайных чисел от 1 до 10
        int min = 1;
        int max = 10;
        return min +(int)(Math.random()*((max-min)+1));
    }

    public static void main(String[] args) {
        int [] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = RandomInt(); //Присвоение случайного числа элементу масива
        }
        System.out.println(Arrays.toString(arr)); //Вывод эементов массива
    }
}
