package Boolean;
import java.util.Scanner;

public class Task2
{
    public static void main(String[]args)
    {
        Scanner s = new Scanner(System.in);

        int num1 = s.nextInt();
        int num2 = s.nextInt();
        int num3 = s.nextInt();
        boolean A = (num1 == num2);
        boolean B = (num1 == num3);
        boolean C = (num2 == num3);
        boolean D = (num1==num2 && num1==num3 && num2==num3);

         if (D){
                    System.out.println(num1+" "+num2+" "+num3);
                } else if (A) {
                    System.out.println(num1 +" "+ num2);
                } else if (B) {
                    System.out.println(num1+" "+num3);

                } else if (C) {
                    System.out.println(num2+" "+num3);
         }
                 else
                    System.out.println("Нет совпадений");
    }
}
