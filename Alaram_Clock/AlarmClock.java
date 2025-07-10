package Alaram_Clock;

import java.util.Timer;
import java.util.TimerTask;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AlarmClock {

    public static void main(String[] args) {
        // Set the alarm time (24-hour format)
        String alarmTime = "00:19"; // Change this to your desired alarm time

        // Create a timer
        Timer timer = new Timer();

        // Define a task to be executed when the alarm time is reached
        TimerTask task = new TimerTask() {
            public void run() {
                SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
                String currentTime = sdf.format(new Date());
                System.out.println("Checking time... Current time: " + currentTime);

                if (currentTime.equals(alarmTime)) {
                    System.out.println("⏰ Alarm! It's time to wake up!");
                    // Cancel the timer after the alarm is triggered
                    timer.cancel();
                }
            }
        };

        // Schedule the task to run every 10 seconds (or 1 minute)
        timer.scheduleAtFixedRate(task, 0, 10000); // 10000 ms = 10 seconds
    }
}
