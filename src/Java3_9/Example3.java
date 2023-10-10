package Java3_9;
import java.util.Scanner;
public class Example3 {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        String b = s.nextLine();
        String result = a.equals(b)? "Одинаковые":"Разные";//тернарный оператор
        System.out.println(result);
    }
}
