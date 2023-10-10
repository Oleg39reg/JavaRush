package Java4_4;

import java.util.Timer;
import java.util.TimerTask;

    public class Arduino {
        public static void main(String[] args) {
            Timer timer = new Timer();
            timer.schedule(new TimerTask() {
                int count = 0;
                public void run() {
                    System.out.println("Count: " + count);
                    count++;
                }
            }, 0, 1000); // запускаем таймер с интервалом 1 секунда
        }
    }

