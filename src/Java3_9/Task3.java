package Java3_9;
import java.util.Scanner;

public class Task3 {
    public static String secret = "AmIGo";

    public static void main (String[]args){
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        if (a.equalsIgnoreCase(secret))//сравнение без учёта регистра
            System.out.println("Доступ разрешён");
        else
            System.out.println("Доступ запрещён");

    }
}
