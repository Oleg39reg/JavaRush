package Java4_4;

import java.util.Timer;
import java.util.TimerTask;

public class Task5 {
    public static void main(String[] args) {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            int seconds = 25 * 60;
            @Override
            public void run() {
                seconds--;

                System.out.println("Осталось времени: " + seconds / 60 + " минут " + seconds % 60 + " секунд.");

                if (seconds <= 0) {
                    timer.cancel();
                    System.out.println("Время истекло!");
                }

            }
        }, 0, 1000);
    }
}