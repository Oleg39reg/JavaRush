package Java4_4Brake;

public class Tasc2 {
    public static void main(String[] args) {
       int i = 1;
       int sum = 0;
//       выполняем цикл от 1 до 100
       while (i<=100){
//           проверяем число на остаток
           if (i%3==0){
               i++;
               continue;
           }
//           ссумируем результат
           sum+=i;
           i++;
       }
        System.out.println(sum);
    }
}
