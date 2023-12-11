package Java12_2_Tasc_3;

public class Robot {
    public static int robotCounter;
    public static int id;
    public static String model;
    public static int productionYear;
    public static String vendor = "Javarush Co.";
    public Robot(String model, int productionYear){
        this.model = model;
        this.productionYear = productionYear;
        this.id = ++robotCounter;
    }
    public void displayInformation(){
        System.out.printf("Я %d-й из %d роботов. Модель: %s. Произведено компанией %s в %d году.\n", id, robotCounter, model, vendor, productionYear);
    }
}
