package Boolean3_6;
import java.util.Scanner;

public class example1 {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        int age = s.nextInt();
        boolean isYoung = (age < 18);
        boolean isOld = (age > 65);
        if (!isYoung && !isOld)
            System.out.println("Вы можете работать");
        else if (isYoung)
            System.out.println("Ещё рано работать");
        else
            System.out.println("Пора на пенсию");
    }
}
