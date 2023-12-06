package Java11_5;

public class Tasc_3 {
    public static class Market{
        private static final boolean hasEggs = true;

        public static void main(String[] args) {
            boolean hasEggs = false;
            makePurchases(hasEggs);
        }

        public static void makePurchases(boolean hasEggs){
            if (hasEggs){
                System.out.println("Купил 10 бананов");
            } else {
                System.out.println("Купил 1 банан");
            }
        }
    }
}
