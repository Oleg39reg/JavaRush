package Boolean3_6;
import java.util.Scanner;
public class Task2 {
    public static void main (String[] args)
    {
        Scanner s = new Scanner(System.in);
        int age = s.nextInt();
        boolean person = (age<20 || age>60);

        if (person)
            System.out.println("можно не работать");

    }
}
