package Java6_1;

public class Example1 {
    public static void main(String[] args) {
        int[] a = new int[10];
        a[2]=4;
        a[7]=9;
        a[9]=a[2]+a[7];
        System.out.println(a[9]);
    }
}
