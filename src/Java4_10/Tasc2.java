package Java4_10;
import java.util.Scanner;
//В методе main() есть переменная double glass = 0.5, которая символизирует наполовину заполненный стакан. Для пессимиста он наполовину пуст, а для оптимиста - наполовину полон.
//Необходимо считать с клавиатуры данные типа boolean, используя метод nextBoolean() объекта типа Scanner. В зависимости от полученных данных, округлить переменную glass: до целого числа вниз (0), если пессимист (false) и до целого числа вверх (1), если оптимист (true).
//Результат вывести на экран.
public class Tasc2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double glass = 0.5;
        boolean person = s.nextBoolean();
        if (person==true){
            glass= (int)Math.ceil(glass);
            System.out.println(Math.round(glass));
        } else {
            glass=(int)Math.floor(glass);
            System.out.println(Math.round(glass));
        }
    }
}
//тоже решение с использованием тернарного оператора
//если person(true) то Math.ceil иначе Math.floor
//int result = person ? (int)Math.ceil(glass) : (int)Math.floor(glass);
//System.out.println(result);
