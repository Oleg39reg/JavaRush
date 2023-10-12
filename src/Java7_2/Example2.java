package Java7_2;

public class Example2 {
    public static void printArraySum(int[] data){
        int sum = 0;
        for (int i = 0; i < data.length; i++) {
            sum = sum+data[i];

        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        int[]months = {31,54,54,23,45,7,97,443,4};
        printArraySum(months);
    }
}
