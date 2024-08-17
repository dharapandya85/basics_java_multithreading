package com.engineeringdigest.corejava.executorframework;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Future<Integer> submit = executorService.submit(() ->  1+2);
        Integer i= submit.get();
        System.out.println("sum is "+ i);
        executorService.shutdown();
        System.out.println(executorService.isShutdown());
        System.out.println(executorService.isTerminated());
        //long startTime = System.currentTimeMillis();
        //Thread[] threads = new Thread[9];
//        ExecutorService executorService = Executors.newSingleThreadExecutor();
//        Future<?> future = executorService.submit(() ->  System.out.println("Hello"));
//        future.get();
//        executorService.shutdown();
//        Future<String> submit = executorService.submit(() -> System.out.println("Hello"),"success");
    }

    }
