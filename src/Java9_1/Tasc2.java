package Java9_1;

public class Tasc2 {
    public static double sqrt (double a){
        return Math.sqrt(a);
    }
    public static double cbrt(double a){
        return Math.cbrt(a);
    }

    public static double pow (int number, int power){
        return Math.pow(number,power);
    }


    public static void main(String[] args) {
        System.out.println(sqrt(2)); //корень квадратный из двух
        System.out.println(cbrt(9)); // корень кубический из 3
        System.out.println(pow(2, 2)); // Число в какой-то степени
    }
}
