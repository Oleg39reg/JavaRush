package Java4_4Brake;

public class Example2 {
    public static void main(String[] args) {
        int i = 0;
        while (i < 20)
        {
            i++;
            if ((i%7)==0)
                continue;
            System.out.println(i);
        }
    }
}
