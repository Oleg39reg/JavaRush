package Java11_5_Tasc_5;

public class City {
    private String name;
    private int temperature;

    public City(String name, int temperature) {
        this.name = name;
        this.temperature = temperature;
    }
    public String getName(){
        return name;
    }
    public int getTemperature(){
        return temperature;
    }
}
