package com.hospistat;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class HospiStatGenerator {

    public static void main(String[] args) {
        System.out.println("HospiStat Backend Generator started.");

        // Create a scheduler
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

        // Define the task that just prints "tick"
        Runnable task = () -> {
            System.out.println("tick");
        };

        // Schedule the task to run every 2 seconds
        scheduler.scheduleAtFixedRate(task, 0, 2, TimeUnit.SECONDS);
    }
}
