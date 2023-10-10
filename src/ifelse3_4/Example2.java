package ifelse3_4;

public class Example2 {
    public static void main(String[] args){
        int temp =9;
        if (temp >20)
            System.out.println("Надень рубашку");
        else
            if(temp>10)
                System.out.println("Надень свитер");
            else
                if (temp >0)
                    System.out.println("Надень плащ");
                else
                    System.out.println("Надень плащ");
    }// в данном примере опустили фигурные скобки


}
