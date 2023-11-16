package Java9_2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Tasc2_Solution {
    public static void main(String[] args) {
        System.out.println("Задайте вопрос");
        Scanner s = new Scanner(System.in);
        String question = s.nextLine();
        System.out.println(Tasc2_MagicBall.getPrediction());
    }
}
