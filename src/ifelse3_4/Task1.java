package ifelse3_4;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args){


        Scanner s = new Scanner(System.in);
        int age = s.nextInt();
        if (age<18)
        { //нужно было в нужном месте поставить скобки
            if (age>=6)
                System.out.println("Нужно идти в школу");
        }
            else
            System.out.println("Нужно идти в институт");



    }
}
