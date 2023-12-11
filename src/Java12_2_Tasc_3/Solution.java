package Java12_2_Tasc_3;

public class Solution {
    public static void main(String[] args) {
        System.out.println("Презентация роботов произведенных компанией " + Robot.vendor);

        Robot robot1 = new Robot("RCV-322", 2019);
        robot1.displayInformation();

        Robot robot2 = new Robot("JavaTron-008", 2017);
        robot1.displayInformation();

        Robot robot3 = new Robot("BugDistroyer-007", 1998 );
        robot1.displayInformation();

        Robot robot4 = new Robot("Gundam-14", 2004);
        robot1.displayInformation();

        Robot robot5 = new Robot("Eve-2", 2012);
        robot1.displayInformation();
    }
}
