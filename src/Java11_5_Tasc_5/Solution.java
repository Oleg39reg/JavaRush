package Java11_5_Tasc_5;

public class Solution {
    public static void showWeather(City city){
        System.out.println(String.format("В городе %s сегодня температура %d", city.getName(), city.getTemperature()));
    }

    public static void main(String[] args) {
City city = new City("Калининград", -7);
        showWeather(city);
    }
}
