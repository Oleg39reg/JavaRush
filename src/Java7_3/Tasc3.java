package Java7_3;

public class Tasc3 {
    public static long cube(long a){
        return a*a*a;
    }
    public static long ninthDegree(long a){
        return cube(cube(a));
    }

    public static void main(String[] args) {
        System.out.println(ninthDegree(3));
    }
}
