package Java4_4;

public class Example3 {
    public static void main (String[]args)
    {
        int n = 0;
        while (n < 4)
        {          //Внешний цикл
            int m = 0;
            while (m<5)
            {        //Внутренний цикл
                System.out.print("A");
                m++;
            }
            System.out.println();   //переводит курсор на новую строку
            n++;
        }
    }
}
