package Java4_4;

public class lastTasc {
    public static void main(String[] args) {
        int a = 1;
//        Внешний цыкл
        while (a<=10) {
            int b = 1;
//            Внутренний цыкл
            while (b<=20){
                if (a==1||a==10){
                    System.out.print("Б");
                } else if (b==1||b==20) {
                    System.out.print("Б");
                }else {
                    System.out.print(" ");
                }
                b++;
            }
            System.out.println();
            a++;
        }
    }
}