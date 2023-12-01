package Java11_3;

public class Tasc_1 {
    private final String manufacterer = "Lamborghini";
    private final String model;
    private final int year;
    private final String color;

    public Tasc_1(String model, int year, String color) {
        this.model = model;
        this.year = year;
        this.color = color;
    }

    public Tasc_1(String model, int year) {
        this.model = model;
        this.year = year;
        this.color = "Оранжевый";
    }

    public Tasc_1(String model) {
        this.model = model;
        this.year = 4321;
        this.color = "Оранжевый";
    }
}
