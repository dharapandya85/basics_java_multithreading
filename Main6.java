package com.engineeringdigest.corejava.executorframework;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) {
        ScheduledExecutorService scheduler= Executors.newScheduledThreadPool(1);
        scheduler.scheduleAtFixedRate(()->System.out.println("Task executed after every second !"),
                5,
                5,
                TimeUnit.SECONDS);
        ScheduledFuture<?> scheduledFuture=scheduler.scheduleWithFixedDelay(()->System.out.println("Task executed after every second !"),
                5,
                5,
                TimeUnit.SECONDS);
        scheduler.schedule(()->{
            System.out.println(" Initiating shutdwon...");
            scheduler.shutdown();
        },20,TimeUnit.SECONDS);
        scheduler.shutdown();

    }
}