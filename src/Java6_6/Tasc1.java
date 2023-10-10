package Java6_6;
//Создай треугольный массив,
// где значение каждого элемента — это сумма его индексов.
public class Tasc1 {
    public static int[][] result = new int[10][];
    public static void main(String[] args) {
        for (int i = 0; i < result.length; i++) {
            result[i] = new int[i+1];
            for (int j = 0; j < result[i].length ; j++) {
                result[i][j]=i+j;
                System.out.print(result[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
