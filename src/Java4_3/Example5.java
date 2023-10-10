package Java4_3;
import java.util.Scanner;
public class Example5 {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        boolean isExit = false;
        while (!isExit){
            String c = s.nextLine();
            isExit = c.equals("exit");//выход из программы
        }
    }
}
