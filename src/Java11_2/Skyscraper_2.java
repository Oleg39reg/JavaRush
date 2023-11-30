package Java11_2;

public class Skyscraper_2 {
    public static final String SKYSCRAPER_WAS_BUILD = "Небоскрёб построен."; //Постоянные переменные(константы)
    public static final String SKYSCRAPER_WAS_FLOORS_COUNT = "Небоскрёб построен. Количество этажей - ";
    public static final String SKYSCRAPER_WAS_BUILD_DEVELOPER = "Небоскрёб построен. Застройщик - ";

    public Skyscraper_2() { //конструкторы
        System.out.println(SKYSCRAPER_WAS_BUILD);
    }

    public Skyscraper_2(int floorsCount) {
        System.out.println(SKYSCRAPER_WAS_FLOORS_COUNT + floorsCount);
    }

    public Skyscraper_2(String build_developer) {
        System.out.println(SKYSCRAPER_WAS_BUILD_DEVELOPER + build_developer);
    }

    public static void main(String[] args) { //метод маин
        Skyscraper_2 skyscraper2 = new Skyscraper_2();
        Skyscraper_2 skyscraperTower = new Skyscraper_2(50);
        Skyscraper_2 skyscraperSkyLine = new Skyscraper_2("JavaRushDevelopment");
    }
}
