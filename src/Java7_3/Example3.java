package Java7_3;

public class Example3 {
    public static int max(int a, int b){
        return (a>b?a:b);
    }

    public static void main(String[] args) {
        int a = 23;
        int b = 44;
        int max= max(a,b);
        System.out.println(max);
    }
}
