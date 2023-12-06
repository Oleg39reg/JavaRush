package Java11_5;

public class Tasc_4 {
    public static class Hedgehog {
        public void eat(Apple apple) {
            System.out.println("Яблоко съедено");
        }

        public static void main(String[] args) {
            Apple apple = new Apple();
            new Hedgehog().eat(apple);
        }

        public static class Apple {

        }
    }
}
