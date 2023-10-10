package Java3_9;

public class Example1 {
    public static void main (String[]args){
    String s1 = "Привет";
    String s2 = "ПРИВЕТ";
    String s3 = s1.toUpperCase();

    boolean A = (s1.equals(s2));
    boolean B = (s1.equals(s3));
    boolean C = (s2.equals(s3));

        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
    }
}
