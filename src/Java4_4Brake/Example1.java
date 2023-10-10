package Java4_4Brake;
//Пример вывод на экран числа от 1 до 20 каторые делятся на 7;
//ПРИМЕР 1
public class Example1 {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 20)
        {
            if ((i%7) ==0 )
            {
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }
    }
}
