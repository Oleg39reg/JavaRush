package Java6_6;

import java.util.Scanner;

public class Tasc2 {
    public static int[][] multiArray;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        multiArray = new int [n][];
        for (int i = 0; i < n; i++) {
            int size = s.nextInt();
            multiArray[i] = new int[size];
        }

    }
}
