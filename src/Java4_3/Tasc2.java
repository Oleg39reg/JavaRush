package Java4_3;
import java.util.Scanner;
public class Tasc2 {
    public static void main(String[] args) {
        String text = " любит меня.";
        int a=0;
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        while (a<10){
            System.out.println(name+text);
            a++;
        }
    }
}
