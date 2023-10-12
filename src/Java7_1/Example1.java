package Java7_1;

public class Example1 {
    public static void main(String[] args) {
        printWiFi10Times();
    }

    public static void printWiFi10Times() {
        for (int i = 0; i < 10; i++) {
            printWiFi();
        }
    }
    public static void printWiFi() {
        System.out.print("Wi-");
        System.out.println("Fi");
    }
}

