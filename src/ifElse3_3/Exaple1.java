package ifElse3_3;
import java.util.Scanner;

public class Exaple1 {
    public static void main(String[]args)
    {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        if (a<b)
            System.out.println(a);
        else
            System.out.println(b);
    }

}
