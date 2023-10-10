package Java4_4Brake;
import  java.util.Scanner;
public class Tasc1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (true){
            String line = s.nextLine();
            if (line.equals("Exit")) break;
            else System.out.println(line);
        }
    }
}
