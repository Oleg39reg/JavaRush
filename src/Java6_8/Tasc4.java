package Java6_8;
/*
Реализуй метод main(String[]), который выводит в консоль true,
если элемент содержится в переданном массиве, иначе — false.
Массив array не должен изменять расположение своих элементов.
 */
import java.util.Arrays;

public class Tasc4 {
    public static int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1};
    public static int element = 5;

    public static void main(String[] args) {
        int[] copy = Arrays.copyOf(array,array.length);
        Arrays.sort(copy);
        int result = Arrays.binarySearch(copy, element);
        boolean results=false;
        for (int i = 0; i < copy.length; i++) {
            if (element == copy[i]) {
                results = true;
                break;
            }
        }
        System.out.println(results);
    }
}
