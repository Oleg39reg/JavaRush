package Java3_9;

public class Task2 {
    public static String s1 = "Амиго";
    public static String s2 = s1;
    public static String s3 = new String(s1);
    
    public static void main (String[]args){
        String same = "Ссылки на строки одинаковые";
        String different = "Ссылки на строки разные";

        String result1 = (s1==s2) ? same:different;
        String result2 = (s2==s3) ? same:different;
        String result3 = (s1==s3) ? same:different;

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);

    }
}
