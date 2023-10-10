package Java4_6;
import java.util.Scanner;
public class Tasc2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int start =s.nextInt();
        int end =s.nextInt();
        int multiple =s.nextInt();
        int sum = 0;
        for (int i = start; i<end ; i++) {
            if (i%multiple!=0){
                continue;
            }
            sum+=i;
        }
        System.out.println(sum);
    }
}
//В методе main с клавиатуры считывается 3 целых числа: start, end (start <= end), multiple.
//Допиши программу, чтобы на экран выводилась сумма чисел от start (включительно) до end (не включительно), кратных multiple.
//Для этого используй цикл for.
//Подсказка: чтобы перейти к следующей итерации цикла, используй оператор continue.