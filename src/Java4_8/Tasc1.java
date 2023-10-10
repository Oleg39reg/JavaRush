package Java4_8;
import java.util.Scanner;
//В этой задаче нужно:
//
//Ввести с клавиатуры строку и число number, которое больше 0 и меньше 5.
//Вывести на экран строку number раз с помощью цикла do-while. Каждое значение нужно вывести с новой строки.
//Если число number меньше/равно 0 или больше/равно 5, то введенную строку нужно вывести на экран один раз.
public class Tasc1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String line = s.nextLine();
        int number = s.nextInt();
        int i = 0;
        do {
            System.out.println(line);
            i++;
            if (number<=0||number>=5){
                break;
            }
        }while (i<number);
    }
}
