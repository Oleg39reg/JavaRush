package Java4_7;
//Факториал числа
public class Example2 {
    public static void main(String[] args) {
        int f =1;
        for (int i = 1; i <=10 ; i++) {
            f = f *i;
        }
        System.out.println(f);
    }
}
//Факториалом числа n (обозначается n!) называется произведение ряда чисел: 1*2*3*4*5*..*n;