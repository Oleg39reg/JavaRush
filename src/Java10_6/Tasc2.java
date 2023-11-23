package Java10_6;

import java.util.Scanner;

public class Tasc2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        System.out.println(format(name, 5000));
    }

    public static String format(String name, int salary){
        return String.format("Меня зовут %s. Я буду зарабатывать $%d в месяц.",name,salary);
    }

}
