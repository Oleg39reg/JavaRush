package Java3_9;

public class Example2 {
    public static void main(String[]args){
        String s1 = "Привет";
        String s2 = "Привет";
        String s3 = s1.toUpperCase();

        System.out.println(s1.equalsIgnoreCase(s2));//игнор регистра при сравнении
        System.out.println(s1.equalsIgnoreCase(s3));
        System.out.println(s2.equalsIgnoreCase(s3));
    }
}
