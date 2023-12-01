package Java11_4;

public class Tasc_2 {
    private int salary = 1000;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        if (this.salary < salary) {
            this.salary = salary;
        }
    }


    public static void main(String[] args) {
        System.out.println();
    }
}
