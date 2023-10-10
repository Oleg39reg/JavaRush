package Java4_3;
import java.util.Scanner;

public class Tasc3 {
    public static void main(String[] args) {
//        Создаём сканнер
        Scanner s = new Scanner(System.in);
        int sum = 0;
        boolean isExit = false;
        while (!isExit){
//            Если следующее ИНТ то
           if (s.hasNextInt()){
//               присваиваем number число с клавиатуры
               int number = s.nextInt();
//               Суммируем вводимые значения с клавиатуры
               sum = sum + number;
//               Иначе если вводится строка
           } else if(s.hasNextLine()) {
//               Присваеваем переменной значение строки
               String line = s.nextLine();
//               Если значение строки равно "ENTER"
               if(line.equals("ENTER")){
//                   Тогда меняем значение булевой переменной на тру, соответственно в условии
//                   while будет значение fols после чего работа цыкла остановится.
                   isExit = true;
               }
            }
        }
        System.out.println(sum);
    }
}
