package Java6_6;
//НЕРОВНЫЕ массивы
public class Example1 {
    public static void main(String[] args) {
        int[][] matrix = new int[2][];
        matrix[0] = new int[10];
        matrix[1] = new int[50];
//        Длинна контейнера контейнеров
        System.out.println("Длинна массива контейнера контейнеров "+matrix.length);
//        Длинна массива строк
        System.out.println("Длинна массива первой строки: " + matrix[0].length);
        System.out.println("Длинна массива второй строки: " + matrix[1].length);
    }

}
