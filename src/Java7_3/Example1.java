package Java7_3;

import java.util.Scanner;

public class Example1 {
    public static int min(int a, int b)
    {
        if (a<b)
            return a;
        else
            return b;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int min= min(a,b);
        System.out.println(min);
    }
}
