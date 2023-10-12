package Java7_2;
//параметры в методе
public class Example1 {
    public static void printLines(String text, int count)
    {
        for (int i = 0; i < count; i++) {
            System.out.println(text);
        }
    }

    public static void main(String[] args) {
        printLines("привет", 10);
        printLines("пока", 20);
    }
}
