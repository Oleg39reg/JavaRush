package Java6_4;

import java.util.Scanner;

public class Tasc1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        Создаю массив переменной типа String
        String[] strings = new String[6];
//         Заполняю массив строками
        for (int i = 0; i < 6; i++) {
            strings[i] = s.nextLine();
        }
//Делаю сравнение массива
        String[] curentString = new String[6];

        for (int i = 0; i < 6; i++) {
            if (strings[i].equals(strings[i])) {
                for (int j = i + 1; j < 6; j++) {
                    if (curentString == null) {
                        break;
                    }
                    if (curentString.equals(strings[j])) {
                        strings[j] = null;
                        strings[i] = null;
                    }
                }
            }

//Вывод результата

        }
        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i] + ", ");
        }

    }
}
