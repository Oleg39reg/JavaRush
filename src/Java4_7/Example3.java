package Java4_7;

public class Example3 {
    public static void main(String[] args) {
//        Цикл по строкам (всего должно быть 10 строк).
        for (int i = 0; i < 10; i++) {
//            Вычисляем, сколько в строке должно быть звездочек.
            int startCount = 10 - i;
//            Цикл по звездочкам
            for(int j = 0; j < startCount; j++) {
//                (выводим starCount звездочек).
                 System.out.print("*");
            }
//            Добавляем перенос курсора на следующую строку, чтобы строки не слиплись.

            System.out.println();
        }

    }
}
