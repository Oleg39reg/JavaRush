package Boolean3_6;
import java.util.Scanner;


public class Tasc1 {
    private static final String TRIANGLE_EXISTS = "треугольник существует";
    private static final String TRIANGLE_NOT_EXISTS = "треугольник не существует";

    public static void main (String[] args){
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        boolean TriangleA = a < b+c;
        boolean TriangleB = b < a+c;
        boolean TriangleC = c < a+b;
        boolean Triangle = TriangleA && TriangleB && TriangleC;
        if (Triangle)
            System.out.println(TRIANGLE_EXISTS);
        else System.out.println(TRIANGLE_NOT_EXISTS);
    }
}
