package Java11_3;

public class Tasc_2 {
    private String type;

    //    public Tasc_2(String type){
//        this.type = type;
//    }
private void initialize(String type) {
    this.type = type;
}
    public static void main(String[] args) {
        Tasc_2 building = new Tasc_2();
        building.initialize("Барбершоп");
    }


}
