package Java11_5;

import java.util.Calendar;

public class Tasc_8 {
    static class Solution{
        private final int currentYear;
        public Solution(){
            this.currentYear= Calendar.getInstance().get(Calendar.YEAR);
        }
        public int getCurrentYear(){
            return currentYear;
        }

        public static void main(String[] args) {
            Solution solution= new Solution();
            System.out.println(solution.getCurrentYear());
        }
    }
}
