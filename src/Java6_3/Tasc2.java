package Java6_3;

import java.util.Scanner;


public class Tasc2 {
    public static int[] array;

    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = s.nextInt();
        }

        int min = array[0];
        for (int i = 0; i < n; i++) {
            if (array[i]<min){
                min = array[i];
            }
        }
        System.out.println(min);

    }
}
