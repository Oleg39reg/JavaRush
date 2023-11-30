package Java11_2;

public class Skyscraper_3 {
    private int floorCount;
    private String developer;

    public Skyscraper_3() {
        this.floorCount = 5;
        this.developer = "JavaRushDevelopment";
    }

    private Skyscraper_3(int floorCount, String developer){
        this.floorCount = floorCount;
        this.developer = developer;
    }

    public static void main(String[] args) {
        Skyscraper_3 skyscraper3 = new Skyscraper_3();
        Skyscraper_3 skyscraperUnknown = new Skyscraper_3(50, "Неизвестно");
    }
}
