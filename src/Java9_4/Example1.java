package Java9_4;

public class Example1 {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 10; i > 0; i--)
        {
            System.out.println(i);
            Thread.sleep(1000);
        }
        System.out.println("Поехали");
    }
}
