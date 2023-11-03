package Java8_1;
//Вывод символов Юникода
public class Example1 {
    public static void main(String[] args) {
        char a = 'A';
//        Приведение типа char a в int value
        int value = a;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < 60; j++) {
                a++;
                System.out.print(a);
            }
            System.out.println();
        }
        System.out.println("Σ= "+ value );

    }
}
