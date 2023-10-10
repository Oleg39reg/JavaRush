package Java6_7;
import java.util.Arrays;
//Вывод на экрас содержание массива
public class Tasc1 {
    public static String[] strings = new String[]{"I","Love","Java"};
    public static int[] ints = new int[]{1,2,3,4,5,6,7,8};

    public static void main(String[] args) {
        String str = Arrays.toString(strings);
        String integer = Arrays.toString(ints);
        System.out.println(str);
        System.out.println(integer);
    }
}
