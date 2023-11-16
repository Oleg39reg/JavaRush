package Java9_4;
import java.util.concurrent.TimeUnit;

public class Example2 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("3 секунды пошло");
        TimeUnit.SECONDS.sleep(3);
        System.out.println("Время вышло");
    }
}
