package Java7_3;

import java.util.Scanner;

public class Tasc1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String user = s.nextLine();
        signIn(user);
    }
    public static void signIn(String username){
        if (username.equals("user"))
            return;

        System.out.println("Добро пожаловать "+ username);
        System.out.println("Очень скучали по Вам, "+ username);
    }
}
