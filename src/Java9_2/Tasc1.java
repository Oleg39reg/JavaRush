package Java9_2;
//Рандомайзер(случайное число)
public class Tasc1 {
    public static void main(String[] args) {
        System.out.println(generateNumber());
    }
    public static int generateNumber(){
        return (int)(Math.random()*100);
    }
}
